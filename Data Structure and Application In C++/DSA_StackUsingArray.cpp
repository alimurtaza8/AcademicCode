#include <iostream>
using namespace std;

const int MAX_SIZE = 100; 

struct Stack {
    int arr[MAX_SIZE];
    int top;

    Stack() {
        top = -1; 
    }

    bool isEmpty() {
        return top == -1;
    }

    bool isFull() {
        return top == MAX_SIZE - 1;
    }

    void push(int value) {
        if (isFull()) {
            cout << "Stack overflow" << endl;
            return;
        }
        ++top;
        arr[top] = value;
    }

    void pop() {
        if (isEmpty()) {
            cout << "Stack underflow" << endl; 
        }
        arr[top--];
    }

    int Top() {
        if (isEmpty()) {
            cout << "Stack is empty" << endl;
            return -1; 
        }
        return arr[top];
    }
};

int main() {
    Stack stack;
    int userCounter = 1;
    int user;

    while(userCounter != 4){
        cout<<"Enter 1 for push\n2 for pop\n3 for Top"<<endl;
        cin>>userCounter;

        if(userCounter == 1){
            cout<<"Enter data to push: "<<endl;
            cin>>user;
            stack.push(user);
        }
        else if(userCounter == 2){
            stack.pop();
        }
        else if(userCounter == 3){
            cout<<"Top: "<<stack.Top()<<endl;
        }
    }

    return 0;
}




