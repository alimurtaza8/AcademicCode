#include <iostream>
using namespace std;

void binearySeach(int arr[], int size, int toSearch){
    int low = 0;
    int high = size - 1;
    int mid;
    int counter = 0;
    bool flag = false;

    while(low <= high){
        mid = low + (high - low)/2;
        counter ++;
        if(arr[mid] == toSearch){
            cout<<"Found at index: "<<mid<<endl;
            flag = true;
            break;
        }
        else if(arr[mid] > toSearch){
            high = mid - 1;
        }
        else{
           low = mid + 1;
        }
    }
    if(flag == false){
        cout<<"Not found"<<endl;
    }
    cout<<"Counter: "<<counter<<endl;
}

int main(){
    int arr[] = {10,20,30,40,50};
    int size = sizeof(arr)/sizeof(arr[0]);
    int toSearch;
    int user = 1;

    while(user != 2){
        cout<<"Enter 1 for search and type 2 for exit"<<endl;
        cin>>user;
        if(user == 1){
            cout<<"Enter number to search: "<<endl;
            cin>>toSearch;
            binearySeach(arr, size, toSearch);
        }
    }
    return 0;
    
}


//Bineary search algorithm
// {10,20,30,40,50}

// 1. initialized low with 0
// 2 . initialized high with size - 1
// 3. Now find mid using this formula (mid = low + high/2)
// 4. loop through the array untile find the element when low is less than or equal to high
//     1. first check if mid is equal to toSearch
//         1.1 . if yes then print it and break
//     2. check if mid is greater than toSearch
//         2.1 . if yes then high = mid + 1
//     3. check if mid is less than toSearch
//         3.1 . if yes then low = mid + 1

