#include <iostream>
using namespace std;

struct DLL{
    int data;
    DLL* prev;
    DLL* next;
};

DLL* head = NULL;

void insert(int data){
    DLL* ptr = new DLL;
    ptr->data = data;

    if(head == NULL){
        head = ptr;
        ptr->next = NULL;
        ptr->prev = NULL;
    }
    else{
        DLL* curr = head;

        while(curr->next != NULL){
            curr = curr->next;
        }
        curr->next = ptr;
        ptr->prev = curr;
        ptr->next = NULL;
    }
    
    
}

void deleteDLL(int data) {
    if (head == NULL) {
        cout<<"Empty List"<<endl;
        return;
    }
    // for just one node
    if(head->next == NULL){
        if(head->data == data){
            delete head;
            head = NULL;
            return;
        }
    }
    // for first head which next is not null
    else if(head->next != NULL && head->data == data){
        DLL* temp = head;
        head = head->next;
        head->prev = NULL;
        delete temp;        
    }
    // for last or nth node
    else{
        DLL* newPrev = head;
        DLL* curr = head->next;

        while(curr != NULL){
            if(curr->data == data){
                newPrev->next = curr->next;
                curr->prev = newPrev;
                delete curr;
                break;
            }
            curr = curr->next;
            newPrev = newPrev->next;
        }
    }
}

void deleteWholeDLL(){
    if(head == NULL){
        cout<<"No Elements to Delete"<<endl;
        return;
    }

    else if(head->next == NULL){
        DLL* temp = head;
        head = NULL;
        delete temp;
        return;
    }

    else{
        DLL* curr = head->next;
        DLL* temp = NULL;
        
        while(curr != NULL){
            temp = curr;
            curr = curr->next;
            delete temp;
            
        }
        head = NULL;
        cout<<"Deleted All Nodes"<<endl;
    }
}


void printDLL(){
    DLL* curr = head;

    while(curr != NULL){
        cout<<curr->data<<"->";
        curr = curr->next;
    }
    cout<<"NULL"<<endl;
}

int main(){
    int userCounter = 1;
    int user;

    while(userCounter != 5){
        cout<<"Enter 1 for insert\n2 for print\n3 for deleteDLL\n4 for deleteWholeDLL: "<<endl;
        cin>> userCounter;

        if(userCounter == 1){
            cout<<"Enter data to insert: ";
            cin>>user;
            insert(user);
        }
        else if(userCounter == 2){
            printDLL();
        }
        else if(userCounter == 3){
            cout<<"Enter data to delete: ";
            cin>>user;
            deleteDLL(user);
        }
        else if(userCounter == 4){
            deleteWholeDLL();
        }
    }

    return 0;
}


