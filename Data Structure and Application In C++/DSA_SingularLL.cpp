#include <iostream>
using namespace std;

struct Node{
    int data;
    Node* next;
};

Node* head = NULL;

void insertFirst(int data){
    Node* ptr = new Node;
    ptr->data = data;
    ptr->next = NULL;

    if(head == NULL){
        head = ptr;
    }
    else{
        ptr->next = head;
        head = ptr;
    }
}

void insertLast(int data) {
    Node* ptr = new Node;
    ptr->data = data;
    ptr->next = NULL;

    if(head == NULL){
        head = ptr;
    }

    else{
    Node* curr = head;

    while (curr->next != NULL) {
        curr = curr->next;
    }
    curr->next = ptr;
    }
}

void deleteFirst(){
    if(head == NULL){
        cout<<"List is empty"<<endl;
        return;
    }
    Node* temp = head;
    head = head->next;
    delete temp;
}

void deleteLast(){
    if(head == NULL){
        cout<<"list is empty"<<endl;
        return;
    }
    if(head->next == NULL){
        delete head;
        head = NULL;
        return;
    }

    Node* secondNode = head;
    Node* lastNode = head->next;

    while(lastNode->next != NULL){
        // secondNode = lastNode;
        secondNode = secondNode->next;
        lastNode = lastNode->next;
    }
    secondNode->next = NULL;
    delete lastNode;
}

void deleteNthNode(int toDel){
    Node* curr = head;
    
    if(head == NULL){
        cout<<"List is empty"<<endl;
        return;
    }

    if(toDel == curr->data){
        head = head->next;
        delete curr;
        return;
    }
    else{
        Node* prev = head;
        curr = curr->next;

        while(curr != NULL){
            if(curr->data == toDel){
                prev->next = curr->next;
                delete curr;
                break;
            }
            prev = prev->next;
            curr = curr->next;
        }
    }
}

void deletion(int toDel){

    Node* temp = head;
    while(temp->next->data != toDel){
        temp = temp->next;
    }
    Node* todel = temp->next;
    temp->next = temp->next->next;

    delete todel;
}

void deleteWholeLL(){

    if(head == NULL){
        cout<<"No Elements to Delete"<<endl;
        return;
    }

    else if(head->next == NULL){
        Node* temp = head;
        head = NULL;
        delete temp;
        return;
    }

    else{
        Node* curr = head;
        Node* temp = NULL;
        
        while(curr != NULL){
            temp = curr;
            curr = curr->next;
            delete temp;
            
        }
        head = NULL;
        cout<<"Deleted All Nodes"<<endl;
    }
}

void reverseIterate(){
    if(head == NULL || head->next == NULL){
        return;
    }

    Node* prev = head;
    Node* curr = head->next;
    while(curr != NULL){
        Node* nextNode = curr->next;
        curr->next = prev;
        //update
        prev = curr;
        curr = nextNode;
    }
    head->next = NULL;
    head = prev;
}

Node* reverseRecursive(Node* head) {
		if (head == NULL || head->next == NULL) {
			return head;
		}
		Node* newHead = reverseRecursive(head->next);
		head->next->next = head;
		head->next = NULL;

		return newHead;
	}


void search(int toSearch){
    Node* ptr = head;
    bool flag = false;

    while(ptr != NULL){
        if(ptr->data == toSearch){
            cout<<"Found value"<<endl;
            flag = true;
            break;
        }
        ptr = ptr->next;
    }

    if(flag == false){
        cout<<"not found"<<endl;
    }
}

void findMiddle(){
    if(head == NULL){
        cout<<"No Data"<<endl;
        return;
    }

    Node* slow = head;
    Node* fast = head;

    while(fast->next != NULL && fast->next->next != NULL){
        slow = slow->next;
        fast = fast->next->next;
    }
    cout<<slow->data<<endl;
}

void printLL(){
    Node* ptr = head;

    while(ptr != NULL){
        cout<<ptr->data<<"->";
        ptr = ptr->next;
    }
    cout<<"NULL"<<endl;
}



int main(){

    int userCounter = 1;
    int user;

    while(userCounter != 13){
        cout<<"Enter 1 for insertFirst\n2 for print\n3 for insertLast\n4 for search\n5 for deleteLast\n6 for deleteFirst\n7 for deleteNthNode\n8 for deletion\n9 for searchMiddle\n10 for deleteWholeList\n11 for reverseIterative\n12 for reverseRecursive: "<<endl;
        cin>> userCounter;

        if(userCounter == 1){
            cout<<"Enter data to insert: ";
            cin>>user;
            insertFirst(user);
        }
        else if(userCounter == 2){
            printLL();
        }
        else if(userCounter == 3){
            cout<<"Enter data to insert: ";
            cin>>user;
            insertLast(user);
        }
        else if(userCounter == 4){
            cout<<"Enter data to search: ";
            cin>>user;
            search(user);
        }
        else if(userCounter == 5){
            deleteLast();
        }
        else if(userCounter == 6){
            deleteFirst();
        }
        else if(userCounter == 7){
            cout<<"Enter data to delete: ";
            cin>>user;
            deleteNthNode(user);
        }
        else if(userCounter == 8){
            cout<<"Enter data to delete: ";
            cin>>user;
            deletion(user);
        }
        else if(userCounter == 9){
            findMiddle();
        }
        else if(userCounter == 10){
            deleteWholeLL();
        }
        else if(userCounter == 11){
            reverseIterate();
        }
        else if(userCounter == 12){
            head = reverseRecursive(head);
        }

    }

    return 0;
}

