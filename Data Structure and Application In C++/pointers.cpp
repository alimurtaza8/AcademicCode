#include <iostream>
using namespace std;

void swap(string *a, string *b){
    string temp = *a;
    *a = *b;
    *b = temp;
}


void sumArray(int arr[], int size){
    int *arrPtr = arr;
    for(int i=0; i<size; i++){
        *arrPtr += 5;
        arrPtr++;   
    }
}


int main(){

    //Array Examples
    int arr[] = {10,20,30,40,50};
    // cout<<*arr<<endl;

    int *arrPtr = arr;
    int sizeOfArray = sizeof(arr)/sizeof(arr[0]);


    sumArray(arr,sizeOfArray);
    for(int i=0; i<sizeOfArray; i++){
        cout<<arr[i]<< "address is: "<<&(arr[i])<<endl;
    }





    int a = 10;
    cout<<&a<<endl;
    int *p = &a;
    cout<< *p << endl;
    cout<< &p << endl;
    

    cout<<"---------------------"<<endl;
    int **q = &p;
    cout<< *q << endl;
    cout<< **q << endl;
    // cout<< &q << endl;


  


    // string a = "100";
    // string b = "200";
    // cout<<"value of before swapping a: "<<a<<endl;
    // cout<<"value of before swapping b: "<<b<<endl;
    // swap(&a, &b);
    // cout<<"value of after swapping a: "<<a<<endl;
    // cout<<"value of after swapping b: "<<b<<endl;

    // int a = 10;
    // int *ptr = &a;
    // cout <<"value of 'a' through the pointer:" <<*ptr << endl;  // This will print the value of 'a' through the pointer
    // cout <<"address of 'a' through the pointer: " <<ptr << endl;   // This will print the memory address of 'a'
    // cout<< &ptr <<endl;

    // Correct way to assign a memory address to a pointer
    // int *ptr2 = (int*)200;  // Assuming 200 is a valid memory address
    // cout << *ptr2 << endl;  // This will try to print the value at memory address 200
    // cout << ptr2 << endl;   // This will print the memory address 200
    // ----- not possible -----






    // int arr[] = {1,2,3,4,5,5};
    // int size = sizeof(arr)/sizeof(arr[0]);
    // cout<<"size: "<<size<<endl;
    // cout<<"address of array is: "<<&arr<<endl;
    // cout<<"address of first element is: "<<&arr[0]<<endl;
    // cout<<"address of second element is: "<<&arr[1]<<endl;
    // cout<<"address of third element is: "<<&arr[2]<<endl;
    // cout<<"address of fourth element is: "<<&arr[3]<<endl;
    // cout<<"address of fifth element is: "<<&arr[4]<<endl;
    // cout<<"address of sixth element is: "<<&arr[5]<<endl;

    // int b = 250;
    // int *ptr = &b;
    // cout<<b<<endl;
    // cout<<&b<<endl;
    // cout<<ptr<<endl;
    // cout<<&ptr<<endl;
    // cout<<*ptr<<endl;




    // int a = 10;
    // int *ptr = &a;
    // cout << *ptr << endl;
    // cout << ptr << endl; 
    // int *b = ptr;
    // cout<<"address of a in b is: "<<b<<endl;
    // cout<<"value of a in b is: "<<*b<<endl;
    // cout<<"address of b is: "<<&b<<endl;
    // int c = 20;
    // cout<<"address of c is: "<<&c<<endl;
    // int d = 30;
    // cout<<"address if d is: "<<&d<<endl;

    // if(b == &a)
    // {
    //     cout<<"b and a are same"<<endl;
    // }
    // else
    // {
    //     cout<<"b and a are not same"<<endl;
    // }


    return 0;
}