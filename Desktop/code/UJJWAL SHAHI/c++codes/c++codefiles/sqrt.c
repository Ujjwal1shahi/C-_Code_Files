SJF Preemptive(SRTF):

#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

struct node {
    int id, execution_time, arrival_time, remaining_time;
    struct node *next;
};

struct node *create() {
    struct node *start = NULL;
    int n, id, exec, arrival;
    printf("Enter the total number of processes = ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        printf("Enter the process id = ");
        scanf("%d", &id);
        printf("Enter the execution time = ");
        scanf("%d", &exec);
        printf("Enter the arrival time = ");
        scanf("%d", &arrival);
        printf("\n");
        struct node *temp = (struct node *)malloc(sizeof(struct node));
        temp->id = id;
        temp->execution_time = exec;
        temp->arrival_time = arrival;
        temp->remaining_time = exec;
        temp->next = NULL;
        if (start == NULL) {
            start = temp;
        } else {
            struct node *ptr = start;
            while (ptr->next != NULL) {
                ptr = ptr->next;
            }
            ptr->next = temp;
        }
    }
    
    return start;
}

void display(struct node *start) {
    if (start == NULL) {
        printf("No processes available\n");
        return;
    }
    
    printf("Processes are:\n");
    printf("ProcessID    Execution Time   Arrival Time\n");
    struct node *ptr = start;
    while (ptr != NULL) {
        printf("%d\t\t%d\t\t%d\n", ptr->id, ptr->execution_time, ptr->arrival_time);
        ptr = ptr->next;
    }
    printf("\n");
}

void preemptiveSJF(struct node *head) {
    if (head == NULL) {
        printf("No processes available\n");
        return;
    }

    struct node *completed = NULL;
    int current_time = 0;
    int total_tat = 0, total_waiting = 0, process_count = 0;
    int *completion_times = (int *)calloc(1000, sizeof(int));

    printf("ProcessID   Arrival Time   Completion Time   Turnaround Time   Waiting Time\n");

    while (head != NULL) {
        struct node *prev = NULL, *ptr = head, *shortest_prev = NULL, *shortest = NULL;
        int min_remaining_time = INT_MAX;

        while (ptr != NULL) {
            if (ptr->arrival_time <= current_time && ptr->remaining_time < min_remaining_time && ptr->remaining_time > 0) {
                shortest_prev = prev;
                shortest = ptr;
                min_remaining_time = ptr->remaining_time;
            }
            prev = ptr;
            ptr = ptr->next;
        }

        if (shortest == NULL) {
            current_time++;
            continue;
        }

        shortest->remaining_time--;
        current_time++;

        if (shortest->remaining_time == 0) {
            completion_times[shortest->id] = current_time;
            process_count++;

            if (shortest_prev == NULL) {
                head = shortest->next;
            } else {
                shortest_prev->next = shortest->next;
            }

            int tat = current_time - shortest->arrival_time;
            int waiting = tat - shortest->execution_time;
            total_tat += tat;
            total_waiting += waiting;

            printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n", shortest->id, shortest->arrival_time, current_time, tat, waiting);

            free(shortest);
        }
    }

    printf("\nAverage Turnaround Time = %.2f\n", (float)total_tat / process_count);
    printf("Average Waiting Time = %.2f\n", (float)total_waiting / process_count);

    free(completion_times);
}

int main() {
    struct node *head = create();
    display(head);
    printf("Preemptive SJF Scheduling result:\n");
    preemptiveSJF(head);
    return 0;
}

Round Robin:

#include <stdio.h>
#include <stdlib.h>

struct node {
    int id, execution_time, arrival_time, remaining_time;
    struct node *next;
};

struct node *create() {
    struct node *start = NULL;
    int n, id, exec, arrival;
    printf("Enter the total number of processes = ");
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        printf("Enter the process id = ");
        scanf("%d", &id);
        printf("Enter the execution time = ");
        scanf("%d", &exec);
        printf("Enter the arrival time = ");
        scanf("%d", &arrival);
        printf("\n");
        struct node *temp = (struct node *)malloc(sizeof(struct node));
        temp->id = id;
        temp->execution_time = exec;
        temp->arrival_time = arrival;
        temp->remaining_time = exec;
        temp->next = NULL;
        if (start == NULL) {
            start = temp;
        } else {
            struct node *ptr = start;
            while (ptr->next != NULL) {
                ptr = ptr->next;
            }
            ptr->next = temp;
        }
    }
    
    return start;
}

void display(struct node *start) {
    if (start == NULL) {
        printf("No processes available\n");
        return;
    }
    printf("Processes are:\n");
    printf("ProcessID    Execution Time   Arrival Time\n");
    struct node *ptr = start;
    while (ptr != NULL) {
        printf("%d\t\t%d\t\t%d\n", ptr->id, ptr->execution_time, ptr->arrival_time);
        ptr = ptr->next;
    }
    printf("\n");
}

void roundRobin(struct node *head, int quantum) {
    if (head == NULL) {
        printf("No processes available\n");
        return;
    }

    struct node *ready_queue = NULL;
    int current_time = 0;
    int total_tat = 0, total_waiting = 0, process_count = 0;
    int *completion_times = (int *)calloc(1000, sizeof(int));

    printf("ProcessID   Arrival Time   Completion Time   Turnaround Time   Waiting Time\n");

    while (head != NULL || ready_queue != NULL) {
        while (head != NULL && head->arrival_time <= current_time) {
            struct node *temp = head;
            head = head->next;
            temp->next = ready_queue;
            ready_queue = temp;
        }

        if (ready_queue == NULL) {
            current_time++;
            continue;
        }

        struct node *current = ready_queue;
        ready_queue = ready_queue->next;

        if (current->remaining_time <= quantum) {
            current_time += current->remaining_time;
            current->remaining_time = 0;
        } else {
            current_time += quantum;
            current->remaining_time -= quantum;
        }

        if (current->remaining_time == 0) {
            completion_times[current->id] = current_time;
            process_count++;

            int tat = current_time - current->arrival_time;
            int waiting = tat - current->execution_time;
            total_tat += tat;
            total_waiting += waiting;

            printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n", current->id, current->arrival_time, current_time, tat, waiting);

            free(current);
        } else {
            struct node *temp = ready_queue;
            if (temp == NULL) {
                ready_queue = current;
            } else {
                while (temp->next != NULL) {
                    temp = temp->next;
                }
                temp->next = current;
            }
            current->next = NULL;
        }
    }

    printf("\nAverage Turnaround Time = %.2f\n", (float)total_tat / process_count);
    printf("Average Waiting Time = %.2f\n", (float)total_waiting / process_count);

    free(completion_times);
}

int main() {
    struct node *head = create();
    display(head);
    int quantum;
    printf("Enter time quantum for Round Robin: ");
    scanf("%d", &quantum);
    printf("Round Robin Scheduling result:\n");
    roundRobin(head, quantum);
    return 0;
}

SJF:

#include <stdio.h>
#include <stdlib.h>

struct node {
    int id, execution_time, arrival_time;
    struct node *next;
};

struct node *create() {
    struct node *start = NULL;
    int n, id, exec, arrival;

    printf("Enter the total number of processes = ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        printf("Enter the process id = ");
        scanf("%d", &id);
        printf("Enter the execution time = ");
        scanf("%d", &exec);
        printf("Enter the arrival time = ");
        scanf("%d", &arrival);
        printf("\n");

        struct node *temp = (struct node *)malloc(sizeof(struct node));
        temp->id = id;
        temp->execution_time = exec;
        temp->arrival_time = arrival;
        temp->next = NULL;

        if (start == NULL) {
            start = temp;
        } else {
            struct node *ptr = start;
            while (ptr->next != NULL) {
                ptr = ptr->next;
            }
            ptr->next = temp;
        }
    }
    return start;
}

void display(struct node *start) {
    if (start == NULL) {
        printf("No processes available\n");
        return;
    }
    printf("Processes are:\n");
    printf("ProcessID    Execution Time   Arrival Time\n");

    struct node *ptr = start;
    while (ptr != NULL) {
        printf("%d\t\t%d\t\t%d\n", ptr->id, ptr->execution_time, ptr->arrival_time);
        ptr = ptr->next;
    }
    printf("\n");
}

void SJF(struct node *head) {
    if (head == NULL) {
        printf("No processes available\n");
        return;
    }

    struct node *completed = NULL; 
    int current_time = 0;
    int total_tat = 0, total_waiting = 0, process_count = 0;

    printf("ProcessID   Arrival Time   Completion Time   Turnaround Time   Waiting Time\n");

    while (head != NULL) {
        struct node *prev = NULL, *ptr = head, *shortest_prev = NULL, *shortest = NULL;

        while (ptr != NULL) {
            if (ptr->arrival_time <= current_time &&
                (shortest == NULL || ptr->execution_time < shortest->execution_time)) {
                shortest_prev = prev;
                shortest = ptr;
            }
            prev = ptr;
            ptr = ptr->next;
        }

        if (shortest == NULL) {
            current_time++;
            continue;
        }

        current_time += shortest->execution_time;
        int completion = current_time;
        int tat = completion - shortest->arrival_time; 
        int waiting = tat - shortest->execution_time;

        total_tat += tat;
        total_waiting += waiting;
        process_count++;

        printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n",
               shortest->id, shortest->arrival_time, completion, tat, waiting);

        if (shortest_prev == NULL) {
            head = shortest->next;
        } else {
            shortest_prev->next = shortest->next;
        }

        free(shortest);
    }

    printf("\nAverage Turnaround Time = %.2f\n", (float)total_tat / process_count);
    printf("Average Waiting Time = %.2f\n", (float)total_waiting / process_count);
}

int main() {
    struct node *head = create();
    display(head);

    printf("SJF Scheduling result:\n");
    SJF(head);

    return 0;
}


FCFS:

#include<stdio.h>
#include<stdlib.h>

struct node {
    int id, execution_time, arrival_time;
    struct node *next;
};

struct node *create() {
    struct node *start = NULL;
    int n, id, exec, arrival;
    printf("Enter the total number of processes = ");
    scanf("%d", &n);
    
    for(int i = 0; i < n; i++) {
        printf("Enter the process id = ");
        scanf("%d", &id);
        printf("Enter the execution time = ");
        scanf("%d", &exec);
        printf("Enter the arrival time = ");
        scanf("%d", &arrival);
        printf("\n");
        
        struct node *temp = (struct node *)malloc(sizeof(struct node));
        temp->id = id;
        temp->execution_time = exec;
        temp->arrival_time = arrival;
        temp->next = NULL;

        if(start == NULL) {
            start = temp;
        } else {
            struct node *ptr = start;
            while(ptr->next != NULL) {
                ptr = ptr->next;
            }
            ptr->next = temp;
        }
    }
    return start;
}

struct node *sort_list(struct node *head) {
    if (head == NULL || head->next == NULL) {
        return head; 
    }

    struct node *i, *j;
    int temp_id, temp_exec, temp_arrival;

    for (i = head; i != NULL; i = i->next) {
        for (j = i->next; j != NULL; j = j->next) {
            if (i->arrival_time > j->arrival_time) {
                temp_id = i->id;
                temp_exec = i->execution_time;
                temp_arrival = i->arrival_time;

                i->id = j->id;
                i->execution_time = j->execution_time;
                i->arrival_time = j->arrival_time;

                j->id = temp_id;
                j->execution_time = temp_exec;
                j->arrival_time = temp_arrival;
            }
        }
    }
    return head;
}

void display(struct node *start) {
    if (start == NULL) {
        printf("No processes available\n");
        return;
    }
    printf("Processes are: \n");
    struct node *ptr = start;
    printf("ProcessID    Execution time   Arrival time\n");
    while(ptr != NULL) {
        printf("%d\t\t%d\t\t%d\n", ptr->id, ptr->execution_time, ptr->arrival_time);
        ptr = ptr->next;
    }
    printf("\n");
}

void FCFS(struct node *head) {
    if (head == NULL) {
        printf("No processes available\n");
        return;
    }

    struct node *ptr = head;
    int current_time = 0;
    int completion, waiting, tat;
    int total_tat = 0, total_waiting = 0; // To calculate averages
    int count = 0;

    printf("ProcessID   Arrival Time   Completion Time   Turnaround Time   Waiting Time\n");

    while (ptr != NULL) {
        if (current_time < ptr->arrival_time) {
            current_time = ptr->arrival_time;
        }

        completion = current_time + ptr->execution_time;
        tat = completion - ptr->arrival_time;
        waiting = tat - ptr->execution_time;

        printf("%d\t\t%d\t\t%d\t\t%d\t\t  %d\n", ptr->id, ptr->arrival_time, completion, tat, waiting);

        total_tat += tat;
        total_waiting += waiting;
        count++;

        current_time = completion;
        ptr = ptr->next;
    }

    // Calculate and display average TAT and WT
    printf("\nAverage Turnaround Time = %.2f\n", (float)total_tat / count);
    printf("Average Waiting Time = %.2f\n", (float)total_waiting / count);
}

int main() {
    struct node *head = create();
    display(head);
    head = sort_list(head);
    
    printf("Processes sorted in order of their arrival time:\n\n");
    display(head);
    
    printf("FCFS result:\n");
    FCFS(head);
    
    return 0;
}