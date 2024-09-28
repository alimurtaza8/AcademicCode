#include <iostream>
using namespace std;

// Bubble sort
void bubbleSort(int arr[], int size){
    for(int i=0; i<size-1; i++){
        for(int j=0; j<size-i-1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp; 
            }
        }
    }
}

// selection sort

void selectionSort(int arr[], int size){
    for(int i=0; i<size-1; i++){
        int smallest = i;
        for(int j=i+1; j<size; j++){
            if(arr[smallest] > arr[j]){
                smallest = j;
            }
        }
        // now swapping
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }    
}

// insertion sort

void insertionSort(int arr[], int size){
    for(int i=1; i<size; i++){
        int current = arr[i];
        int j = i-1;
        while(j >=0 && current < arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current;
    }
}

// print
void print(int arr[], int size){
    for(int i = 0; i < size; i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}

int main(){

    int arr[] = {7,8,3,1,2};
    int size = sizeof(arr)/sizeof(arr[0]);
    int user = 1;

    while(user != 5){
        cout<<"Enter 1 for bubbleSort and type 2 for print array and type 3 for selectionSort and type 4 for insertionSort"<<endl;
        cin>>user;
        if(user == 1){
            bubbleSort(arr, size);
        }
        else if(user == 2){
            print(arr, size);
        }
        else if(user == 3){
            selectionSort(arr, size);
        }
        else if(user == 4){
            insertionSort(arr, size);
        }
    }

    return 0;
}