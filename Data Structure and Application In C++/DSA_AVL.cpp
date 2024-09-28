#include <iostream>
#include <stdlib.h>
using namespace std;
struct node {
	node *left;
	node *right;
	int Lheight;
	int Rheight;
	int value;
};

node *root=NULL;
int Max(int a,int b){
    if(a > b){
        return a;
    }
    else{
        return b;
    }
}
node* shiftleft(node * unbalance){
	node *temp=unbalance->right;
	node *curr=temp->left;
	temp->left=unbalance;
	unbalance->right=curr;
	if(curr==NULL){
		unbalance->Rheight=0;
	}
	else{
		unbalance->Rheight=max(curr->Lheight,curr->Rheight)+1;
	}
	temp->Lheight=Max(unbalance->Lheight,unbalance->Rheight)+1;
	return temp;
}

node* shiftright(node * unbalance){
	node *temp=unbalance->left;
	node *curr=temp->right;
	temp->right=unbalance;
	unbalance->left=curr;
	if(curr==NULL){
		unbalance->Lheight=0;
	}
	else{
		unbalance->Lheight=max(curr->Lheight,curr->Rheight)+1;
	}
	temp->Rheight=Max(unbalance->Lheight,unbalance->Rheight)+1;
	return temp;
}

node * insert(node * root,int data){
	if(root==NULL){
		root = new node;
		root->value=data;
		root->Lheight=0;
		root->Rheight=0;
		root->left=NULL;
		root->right=NULL;
		return root;
	}
	if(root->value > data){
		root->left=insert(root->left,data);
		root->Lheight=Max(root->left->Lheight,root->left->Rheight)+1;
	}
	if(root->value<data){
		root->right=insert(root->right,data);
		root->Rheight=Max(root->right->Lheight,root->right->Rheight)+1;
	}
	int balancefactor=(root->Lheight)-(root->Rheight);
	if(balancefactor>1){               //l-l
		if(data<root->left->value){
			root=shiftright(root);
		}
		else{
			root->left=shiftleft(root->right);
			root=shiftright(root);
		}
	}
	if(balancefactor<-1){               //l-l
		if(data>root->right->value){
			root=shiftleft(root);
		}
		else{
			root->right=shiftright(root->right);
			root=shiftleft(root);
		}
	}
	return root;
}
void search(node * root,int tosearch){
	if(root==NULL){
		cout<<"no element is found"<<endl;
		return;
	}
	if(root->value==tosearch){
		cout<<"found "<<endl;
		return;
	}
	if(tosearch>root->value){
		search(root->right,tosearch);
	}
	else{
		search(root->left,tosearch);
	}
}
node *min(node *root){
	if(root==NULL){
		cout<<"MINIMUM NOT FOUND"<<endl;
	}
	if(root->left!=NULL){
		min(root->left);
	}
	return root;
}
void inorder(node *root){
	if(root!=NULL){
		inorder(root->left);
		cout<<root->value<<" ";
		inorder(root->right);
	}
}
node *Delete(node *root,int todel){
	if(root==NULL){
		cout<<"no element fouund"<<endl;
		return NULL;
	}
	if(todel>root->value){
		root->right=Delete(root->right,todel);
	}
	else if(todel<root->value){
		root->left=Delete(root->left,todel);
	}
	else if(todel==root->value){
		if(root->left==NULL){
			node *temp=root->right;
			free(root);
			return temp;
		}
		else if(root->right==NULL){
			node *temp=root->left;
			free(root);
			return temp;
		}
		else{
			node *temp=min(root->right);
			root->value=temp->value;
			root->right=Delete(root->right,temp->value);
		}
		
	}
	return root;
	
}


int main(){
	
	int b=0;
	while(b<5){
		cout<<"enter 1 for insert\n 2 for inorder \n 3 for search \n4 for delete/n"<<endl;
		cin >>b;
		if(b==1){
			int a;
			cout<<"enter a number to insert"<<endl;
			cin >>a;
			root=insert(root,a);
		}
		else if(b==2){
			inorder(root);
		}
		else if(b==3){
			int a;
			cout<<"enter a number to search"<<endl;
			cin >>a;
			search(root,a);
		}
		else if(b==4){
			int a;
			cout<<"enter a number to Delete"<<endl;
			cin >>a;
			Delete(root,a);
		}
	}
}