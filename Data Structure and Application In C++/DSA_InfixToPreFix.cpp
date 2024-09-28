#include <iostream>
using namespace std;

struct stNode {
    char data;
    stNode* next;
};

stNode* topNode = NULL;

void push(char value) {
       stNode* newNode = new stNode;
       newNode->data = value;
       newNode->next = NULL;

       if(topNode == NULL){
        topNode = newNode;
       }
       else{
        stNode* curr = topNode;
        topNode = newNode;
        newNode->next = curr;
       }
}

char pop() {
    if (topNode == NULL) {
        cout << "Stack underflow" << endl;
        return 0; 
    }
    
    stNode* temp = topNode;
    char ch = topNode->data;
    topNode = topNode->next;
    delete temp;
    return ch;
    
}

char top() {
    if (topNode == NULL) {
        cout << "Stack is empty" << endl;
        return -1; 
    }
    char ch = topNode->data;
    return ch;
}

int precedence(char operatorChar)
{
    if (operatorChar == '*' || operatorChar == '/' || operatorChar == '%')
    {
        return 4;
    }
    if (operatorChar == '+' || operatorChar == '-')
    {
        return 3;
    }
    if (operatorChar == '<' || operatorChar == '>')
    {
        return 2;
    }
    if (operatorChar == '&' || operatorChar == '|')
    {
        return 1;
    }
    return -1;
}

void reverseString(string &inputString){
    string reverseStr = "";

    for(int i=0; i < inputString.length(); i++){
        reverseStr = inputString[i] + reverseStr ;
    }

    inputString = reverseStr;
}

string convertToPrefix(string &inputString)
{
    reverseString(inputString);
    string prefixString;
    for (int i=0; i<inputString.length(); i++)
    {
        char ch = inputString[i];
        if (isalnum(ch))
        {
            prefixString += ch;
        }
        else if (ch == ')')
        {
            push(ch);
        }
        else if (ch == '(')
        {
            while (topNode != NULL && top() != ')')
            {
                prefixString += top();
                pop();
            }
            pop();
        }
        else
        {
            while (topNode != NULL && precedence(ch) < precedence(top()))
            {
                prefixString += top();
                pop();
            }
            push(ch);
        }
    }
    while (topNode != NULL)
    {
        prefixString += top();
        pop();
    }
    reverseString(prefixString);
    return prefixString;
}

int preFixEvaluation(string postFix){


    for(int i=postFix.length()-1; i>=0; i--){
        if(postFix[i] >= '0' && postFix[i] <= '9'){
            push(postFix[i] - '0');
        }
        else{
            int operand1 = top();
            pop();
            int operand2 = top();
            pop();

            switch(postFix[i]){
                case '+':
                push(operand1 + operand2);
                break;

                case '-':
                push(operand1 - operand2);
                break;

                case '*':
                push(operand1 * operand2);
                break;

                case '/':
                push(operand1 / operand2);
                break;
            }
        }
    }
    return top();

}

int main(){

    int userCounter = 1;
    string user;

    while (userCounter != 3) {
        cout << "Enter 1 for enter infix expression\n2 for evaluate prefix expression: ";
        cin >> userCounter;

        if (userCounter == 1) {
            cout << "Enter a infix expression: ";
            cin>>user;
            string prefixExpression = convertToPrefix(user);
            cout << "Prefix expression: " << prefixExpression << endl;
        
        } else if (userCounter == 2) {
            int preFixEva = preFixEvaluation("552*2/4*+15*+");
            cout << "PreFix Evaluations: " << preFixEva << endl;
        }

    return 0;
}
}



