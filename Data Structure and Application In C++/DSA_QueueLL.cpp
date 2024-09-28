#include <iostream>
using namespace std;
struct QueueLL {
    int data;
    QueueLL* next;
};

QueueLL* head = NULL;
QueueLL* rare = NULL;

bool isEmpty() {
    return head == NULL && rare == NULL;
}

void enQueue(int value) {
    QueueLL* newNode = new QueueLL;
    newNode->data = value;

    if (isEmpty()) {
        head = newNode;
        rare = newNode;
        newNode->next = NULL;
        return;
    }
    else {
        rare->next = newNode;
        rare = newNode;
    }
}

void deQueue() {
    if(isEmpty()){
        cout << "Queue is empty" << endl;
        return;
    }

    if (head == rare) {
        head = NULL;
        rare = NULL;
        return;
    }

    QueueLL* temp = head;
    head = head->next;
    delete temp;
}

int front() {
    if (isEmpty()) {
        cout << "Queue is empty" << endl;
        return -1; 
    }
    return head->data;
}


int main() {

    int userCounter = 1;
    int user;

    while(userCounter != 4) {
        cout<<"Enter 1 for enQueue\n2 for deQueue\n3 for peek\n4 for exit"<<endl;
        cin>>userCounter;

        if(userCounter == 1) {
            cout<<"Enter data to enQueue: ";
            cin>>user;
            enQueue(user);
        }
        else if(userCounter == 2) {
            deQueue();
        }
        else if(userCounter == 3) {
            cout<<"Front: "<<front()<<endl;
        }
    }
    return 0;
}