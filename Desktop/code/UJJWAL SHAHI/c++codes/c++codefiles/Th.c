#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

int *arr;  // Dynamically allocated array
int sum1 = 0, sum2 = 0;
int SIZE;  // Global variable for array size

void* sum_first_half(void* arg) {
    for (int i = 0; i < SIZE / 2; i++) {
        sum1 += arr[i];
    }
    return NULL;
}

void* sum_second_half(void* arg) {
    for (int i = SIZE / 2; i < SIZE; i++) {
        sum2 += arr[i];
    }
    return NULL;
}

int main(int argc, char *argv[]) {
    if (argc < 2) {
        printf("Usage: %s <array elements>\n", argv[0]);
        return 1;
    }

    SIZE = argc - 1;  // Number of elements entered
    arr = (int*)malloc(SIZE * sizeof(int));  // Allocate memory for array

    // Convert command-line arguments to integers
    for (int i = 0; i < SIZE; i++) {
        arr[i] = atoi(argv[i + 1]);
    }

    pthread_t thread1, thread2;

    // Create threads
    pthread_create(&thread1, NULL, sum_first_half, NULL);
    pthread_create(&thread2, NULL, sum_second_half, NULL);

    // Wait for both threads to finish
    pthread_join(thread1, NULL);
    pthread_join(thread2, NULL);

    // Print the total sum
    int total_sum = sum1 + sum2;
    printf("Total Sum: %d\n", total_sum);

    free(arr);  // Free allocated memory
    return 0;
}
