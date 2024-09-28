#include <iostream>
using namespace std;

const int MAX_SIZE = 5; 

struct Queue {
    int arr[MAX_SIZE];
    int rear;

    Queue() {
        rear = -1; 
    }

    bool isEmpty() {
        return rear == -1;
    }

    void enQueue(int value) {
        if (rear == MAX_SIZE-1) {
            cout << "Stack overflow" << endl;
            return;
        }
        rear++;
        arr[rear] = value;
    }

    void deQueue() {
        if (isEmpty()) {
            cout << "Stack underflow" << endl; 
        }
        int front = arr[0];
        for(int i=0; i<rear; i++){
            arr[i] = arr[i+1];
        }
        // int last = arr[MAX_SIZE-1];
        // swap(front,last);
        // int temp = arr[0];
        // arr[0] = arr[MAX_SIZE-1];
        // arr[MAX_SIZE-1] = temp;

        // int front = arr[0];
        rear--;
    }

    int Front() {
        if (isEmpty()) {
            cout << "Stack is empty" << endl;
            return -1; 
        }
        return arr[0];
    }

    void printArr(){
        for(int i=0; i<MAX_SIZE; i++){
            cout<<arr[i]<<endl;
        }
    }
};

int main() {
    Queue queue;

    int userCounter = 1;
    int user;

    while(userCounter != 5) {
        cout<<"Enter 1 for enQueue\n2 for deQueue\n3 for peek\n4 for exit"<<endl;
        cin>>userCounter;

        if(userCounter == 1) {
            cout<<"Enter data to enQueue: ";
            cin>>user;
            queue.enQueue(user);
        }
        else if(userCounter == 2) {
            queue.deQueue();
        }
        else if(userCounter == 3) {
            cout<<"Front: "<<queue.Front()<<endl;
        }
        else if(userCounter == 4){
            queue.printArr();
        }
    }
    return 0;
}




