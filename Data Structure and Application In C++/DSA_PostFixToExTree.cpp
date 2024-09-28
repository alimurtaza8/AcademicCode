#include <iostream>
#include <string>
#include <cctype>
using namespace std;

struct exTree {
    char data;
    exTree* left;
    exTree* right; 
};

struct stNode {
    exTree* node;
    stNode* next;
};

stNode* topNode = NULL;

void push(exTree* node) {
    stNode* newNode = new stNode;
    newNode->node = node; 
    newNode->next = topNode;
    topNode = newNode; 
}

exTree* pop() {
    if (topNode == NULL) {
        cout << "Stack underflow" << endl;
        return NULL; 
    }
    
    stNode* temp = topNode;
    exTree* node = topNode->node; 
    topNode = topNode->next;
    delete temp;
    return node;
}

exTree* top() {
    if (topNode == NULL) {
        cout << "Stack is empty" << endl;
        return NULL; 
    }

    exTree* ch = topNode->node;
    return ch;
}

exTree* create(string postfix) {
    for (int i = 0; i < postfix.length(); i++) {
        if (isalnum(postfix[i])) {
            exTree* temp = new exTree;
            temp->data = postfix[i];
            temp->left = NULL;
            temp->right = NULL;
            push(temp); 
        } else {
            exTree* curr = new exTree;
            curr->data = postfix[i];
            curr->right = pop(); 
            curr->left = pop();  
            push(curr); 
        }
    }
    return top(); 
}

void postorder(exTree* root) {
    if (root == NULL) {
        return;
    }
    postorder(root->left);
    postorder(root->right);
    cout << root->data << " ";
}

int main() {
    int userCounter = 1;
    string user;

    while (userCounter != 3) {
        cout << "Enter 1 for enter infix expression\n2 for evaluate postfix expression: ";
        cin >> userCounter;

        if (userCounter == 1) {
            cout << "Enter a postfix expression: ";
            cin >> user;
            exTree* node = create(user);
            cout << "Postorder traversal of the expression tree: ";
            postorder(node);
            cout << endl;
        }
    }

    return 0;
}