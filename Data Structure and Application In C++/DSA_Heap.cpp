#include <iostream>
using namespace std;

void minHeap(int arr[], int size) {
    for (int i = 1; i < size; i++) {
        int child = i;
        while (child > 0) {
            int parent = (child - 1) / 2;
            if (arr[parent] <= arr[child]) {
                break;
            }
            swap(arr[parent], arr[child]);
            child = parent;
        }
    }
}

void deleteMin(int arr[], int size){
    arr[0] = arr[size-1];
    arr[size-1] = -1;
    minHeap(arr, size-1);
}


void maxHeap(int arr[], int size) {
    for (int i = 1; i < size; i++) {
        int child = i;
        while (child > 0) {
            int parent = (child - 1) / 2;
            if (arr[parent] >= arr[child]) {
                break;
            }
            swap(arr[parent], arr[child]);
            child = parent;
        }
    }
}

void heapSort(int arr[], int size) {
    minHeap(arr, size);
    for(int i = size-1; i >= 0; i--) {
        swap(arr[0], arr[i]);
        minHeap(arr, i);
    }
}

int main(){
    int arr[] = {78,99,23,63,97,55,230,117,70,11};
    int size = sizeof(arr)/sizeof(arr[0]);

    // minHeap(arr, size);
    //  for(int i=0; i<size; i++){
    //     cout<<arr[i]<<" ";
    // }

    // maxHeap(arr, size);
    // for(int i=0; i<size; i++){
    //     cout<<arr[i]<<" ";
    // }

    // cout<<"Now for delete"<<endl;

    heapSort(arr, size);
    for(int i=0; i<size; i++){
        cout<<arr[i]<<" ";
    }



    // deleteMin(arr, size);
    // for(int i=0; i<size; i++){
    //     cout<<arr[i]<<" ";
    // }

    return 0;
}

