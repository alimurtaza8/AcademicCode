#include <iostream>
using namespace std;

struct CLL{
    int data;
    CLL *next;
};

CLL* head = NULL;

void insert(int data){
    CLL* ptr = new CLL;
    ptr->data = data;

    if(head == NULL){
        head = ptr;
        ptr->next = head;
        return;
    }
    else{
    CLL* curr = head;

    while (curr->next != head) {
        curr = curr->next;
    }
    curr->next = ptr;
    ptr->next = head;
    }
}

void deleteCLL(int data) {
    if (head == NULL) {
        cout<<"Empty List"<<endl;
        return;
    }
    // for just one node
    if(head->next == head){
        if(head->data == data){
            delete head;
            head = NULL;
            return;
        }
    }
    // for last or nth node
    else{
        CLL* prev = head;
        CLL* curr = head->next;

        while(curr != head){
            if(curr->data == data){
                prev->next = curr->next;
                delete curr;
                break;
            }
            curr = curr->next;
            prev = prev->next;
        }
    }
}


void deleteWholeLL(){
    if(head == NULL){
        cout<<"No Elements to Delete"<<endl;
        return;
    }

    else if(head->next == head){
        CLL* temp = head;
        head = NULL;
        delete temp;
        return;
    }

    else{
        CLL* curr = head->next;
        CLL* temp = NULL;
        
        while(curr != head){
            temp = curr;
            curr = curr->next;
            delete temp;
            
        }
        head = NULL;
        cout<<"Deleted All Nodes"<<endl;
    }
}


void printCLL(){
    if(head == NULL){
        cout<<"NULL"<<endl;
        return;
    }
    CLL* curr = head;
    do{
        cout<<curr->data<<"->";
        curr = curr->next;
    }
    while(curr != head);

    cout<<"NULL"<<endl;
}

int main(){
    int userCounter = 1;
    int user;

    while(userCounter != 5){
        cout<<"Enter 1 for insert\n2 for print\n3 for deleteCLL\n4 for deleteWholeCLL: "<<endl;
        cin>> userCounter;

        if(userCounter == 1){
            cout<<"Enter data to insert: ";
            cin>>user;
            insert(user);
        }
        else if(userCounter == 2){
            printCLL();
        }
        else if(userCounter == 3){
            cout<<"Enter data to delete: ";
            cin>>user;
            deleteCLL(user);
        }
        else if(userCounter == 4){
            deleteWholeLL();
        }
    }

    return 0;
}


