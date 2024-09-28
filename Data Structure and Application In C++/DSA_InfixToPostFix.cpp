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

string convertToPostfix(string &inputString)
{
    string postfixString = "";
    for (int i=0; i<inputString.length(); i++)
    {
        char ch = inputString[i];
        if (isalnum(ch))
        {
            postfixString += ch;
        }
        else if (ch == '(')
        {
            push(ch);
        }
        else if (ch == ')')
        {
            while (topNode != NULL && top() != '(')
            {
                postfixString += top();
                pop();
            }
            pop();
        }
        else
        {
            while (topNode != NULL && precedence(ch) <= precedence(top()))
            {
                postfixString += top();
                pop();
            }
            push(ch);
        }
    }
    while (topNode != NULL)
    {
        postfixString += top();
        pop();
    }
    return postfixString;
}


int postFixEvaluation(string postFix){
    for(int i=0; i<postFix.length(); i++){
        if(postFix[i] >= '0' && postFix[i] <= '9'){
            push(postFix[i] - '0');
        }
        else{
            int operand2 = top();
            pop();
            int operand1 = top();
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

int main()
{    
    int userCounter = 1;
    string user;

    while(userCounter != 3){
        cout<<"Enter 1 for enter infix expression\n2 for evaluate postfix expression: "<<endl;
        cin>>userCounter;

        if(userCounter == 1){
            cout<<"Enter an infix expression: ";
            cin>>user;
            string postfixExpression = convertToPostfix(user);
            cout << "Postfix expression: " << postfixExpression << endl;
        }
        else if(userCounter == 2){
            int postFixEva = postFixEvaluation("46+2/5*7+");
            cout<< "PostFix Evaluations: " << postFixEva << endl;
        }
       
    }

    return 0;
}

// 5+5*2/2*4+10*5