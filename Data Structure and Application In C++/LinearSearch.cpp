#include <iostream>
using namespace std;

void linearSearch(int arr[], int size, int toSearch){
    bool flag = false;
    int counter = 0;

    for(int i=0; i<size; i++){
        if(arr[i] == toSearch){
            cout<<"Found at index: "<<i<<endl;
            flag = true;
            break;
        }
        counter++;
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
    int counter = 1;

    while (counter != 2){
        cout<<"Enter 1 for search and type 2 for exit"<<endl;
        cin>>counter;

        if(counter == 1){
            cout<<"Enter number to Search: "<<endl;
            cin >> toSearch;
            linearSearch(arr,size,toSearch);
        }
    }

    return 0;
}