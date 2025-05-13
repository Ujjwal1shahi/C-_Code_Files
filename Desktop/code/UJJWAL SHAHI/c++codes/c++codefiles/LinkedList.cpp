#include <iostream>
using namespace std;

class Node{
 
    public:
    
    int data;
    Node *next;

    Node(int value){
        data = value;
        next = NULL;
    }
};

int main(){
    Node *Head;
    Head = NULL;

    int a[] = {1,3,4,5};

    for(int i = 0; i < 4; i++){
        if(Head == NULL){
            Head = new Node(a[i]);
        }
        else{
            Node * temp;
            temp = new Node(a[i]);
            temp->next = Head;
            Head = temp;
        }
    }

    Node *ptr;
    ptr = Head;

    while(ptr != NULL){
        cout << ptr->data << endl;
        ptr = ptr->next;
    }

    return 0;
}