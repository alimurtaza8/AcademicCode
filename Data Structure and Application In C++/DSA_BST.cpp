#include <iostream>
using namespace std;

struct BSTNode{
    int data;
    BSTNode* left;
    BSTNode* right;
};

BSTNode *root = NULL;

BSTNode* insert(BSTNode* root, int data){
    if(root == NULL){
        root = new BSTNode;
        root->data = data;
        root->left = NULL;
        root->right = NULL;
        return root;
    }

    if(data < root->data){
        root->left = insert(root->left, data);
    }
    else{
        root->right = insert(root->right, data);
    }
    return root;
}


void search(BSTNode* root, int toSearch){
    if(root == NULL){
        cout<<"Not found"<<endl;
        return;
    }

    else if(root->data == toSearch){
        cout<<"Found"<<endl;
        return;
    }
    else if(toSearch < root->data){
        search(root->left, toSearch);
    }
    else{
        search(root->right, toSearch);
    }
}

BSTNode* findMin(BSTNode* root) {
    while (root->left != NULL) {
        root = root->left;
    }
    return root;
}

BSTNode* findMax(BSTNode* root) {
    while(root->right != NULL) {
        root = root->right;
    }
    return root;
}
// Delete a node
BSTNode* deleteBSTNode(BSTNode* root, int toDel) {
    if (root == NULL) {
        cout << "Not found" << endl;
        return root;
    }

    if (toDel < root->data) {
        root->left = deleteBSTNode(root->left, toDel);
    } else if (toDel > root->data) { 
        root->right = deleteBSTNode(root->right, toDel);
    } else { // Node to delete found
        if (root->left == NULL && root->right == NULL) { // Case 1: No children
            delete root;
            root = NULL;
            return root;
        } else if (root->left == NULL) { // Case 2: Only right child
            BSTNode* temp = root->right;
            delete root;
            return temp;
        } else if (root->right == NULL) { // Case 3: Only left child
            BSTNode* temp = root->left;
            delete root;
            return temp;
        } else { // Case 4: Node has both left and right children
            BSTNode* temp = findMin(root->right);
            root->data = temp->data;
            root->right = deleteBSTNode(root->right, temp->data);
        }
    }
    return root;
}

// Tree Traversal

void inOrder(BSTNode* root){
    if(root == NULL){
        return;
    }
    else{
        inOrder(root->left);
        cout<<root->data<<" ";
        inOrder(root->right);
    }
}

void preOrder(BSTNode* root){
    if(root == NULL){
        return;
    }
    else{
        cout<<root->data<<" ";
        preOrder(root->left);
        preOrder(root->right);
    }
}

void postOrder(BSTNode* root){
    if(root == NULL){
        return;
    }
    else{
        postOrder(root->left);
        postOrder(root->right);
        cout<<root->data<<" ";
    }
}

int main(){

    int userCounter = 1;
    int user;
    while(userCounter != 7){
        cout<<"\nEnter 1 for insert\n2 for search\n3 for inOrder\n4 for preOrder\n5 for postOrder\n6 for deleteNode: "<<endl;
        cin >> userCounter;
        if(userCounter == 1){
            cout<<"Enter number for insert: ";
            cin>>user;
           root = insert(root, user);
        }
        else if(userCounter == 2){
            cout<<"Enter number to search: ";
            cin>>user;
            search(root, user);
        }
        else if(userCounter == 3){
            inOrder(root);
        }
        else if(userCounter == 4){
            preOrder(root);
        }
        else if(userCounter == 5){
            postOrder(root);
        }
        else if(userCounter == 6){
            cout<<"Enter number to delete: ";
            cin>>user;
            root = deleteBSTNode(root, user);
        }
    }

    return 0;
}