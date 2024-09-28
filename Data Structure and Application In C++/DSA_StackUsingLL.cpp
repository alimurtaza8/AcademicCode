#include <iostream>
using namespace std;

struct stNode {
    int data;
    stNode* next;
};

stNode* head = NULL;

void push(int value) {
    stNode* newNode = new stNode;
    newNode->data = value;
    newNode->next = NULL;
    
    if(head == NULL){
        head = newNode;
    }

    newNode->next = head;
    newNode->next->next = NULL;
    head = newNode;
}

int pop() {
    if (head == NULL) {
        cout << "Stack underflow" << endl;
        return -1; 
    }
    
    else if(head->next == NULL){
        delete head;
        head = NULL;
        return -1;
    }

    stNode* temp = head;
    head = head->next;
    delete temp;

    return head->data;
    
}

int top() {
    if (head == NULL) {
        cout << "Stack is empty" << endl;
        return -1; 
    }
    return head->data;
}


int main() {

    int userCounter = 1;
    int user;

    while(userCounter != 4){
        cout<<"Enter 1 for push\n2 for pop\n3 for Top"<<endl;
        cin>>userCounter;

        if(userCounter == 1){
            cout<<"Enter data to push: "<<endl;
            cin>>user;
            push(user);
        }
        else if(userCounter == 2){
            pop();
        }
        else if(userCounter == 3){
            cout<<"Top: "<<top()<<endl;
        }
    }

    return 0;
}
