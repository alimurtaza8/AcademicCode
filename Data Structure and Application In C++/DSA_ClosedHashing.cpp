#include <iostream>
using namespace std;

void linearProbing(int hashTable[], int size, int key){
    int index = key % size;
    int i = 0;

    while(hashTable[index] != -1){
        index = (key+i) % size;
        i++;
        if(i == size){
            cout<<"list is full"<<endl;
            return;
        }
    }
    hashTable[index] = key;
}
void quadraticProbing(int hashTable[], int size, int key){
    int index = key % size;
    int i = 0;

    while(hashTable[index] != -1){
        index = (key + (i*i)) % size;
        i++;
        if(i == size){
            linearProbing(hashTable,size,key);
            return;
        }
        if(i >= size){
            cout<<"List is full"<<endl;
            return;
        }
    }
    hashTable[index] = key;
}

void linearProbSearch(int hashTable[], int size , int toSearch){
    int index = toSearch % size;
    bool flage = false;

    while(hashTable[index] != -1){
        if(hashTable[index] == toSearch){
            cout<<"Found";
            flage = true;
            break;    
        }
        index = (index + 1) % size; 
        if (index == toSearch % size) { 
            break; 
        }
    }
    if(flage == false){
        cout<<"Not found"<<endl;
    }
}

void quadProbingSearch(int hashTable[], int size , int toSearch){
    int index = toSearch % size;
    bool flag = false;
    int i = 0;

    while(hashTable[index] != -1){
        if(hashTable[index] == toSearch){
            cout<<"found at "<<index<<endl;
            flag = true;
            break;
        }
        index = (index + i*i) % size;
        i++;

        if(i >= size){
            break;
        }
    }

    if(flag == false){
        cout<<"Not found"<<endl;
    }
    cout<<"ith times "<<i<<endl;
}


void linearProbSearchDelete(int hashTable[], int size , int toSearch){
    int index = toSearch % size;
    bool flage = false;

    while(hashTable[toSearch] != -1){
        if(hashTable[index] == toSearch){
            hashTable[index] = -1;
            flage = true;
            break;    
        }
        index = (index + 1) % size; 
        if (index == toSearch % size) { 
            break; 
        }
    }
    if(flage == false){
        cout<<"Not found"<<endl;
    }
}

void print(int hashTable[], int size){
    for(int i=0; i<size; i++){
        cout<<i<<" "<<hashTable[i]<<endl;
    }
}

int main(){
    
    int size = 10;
    int hashTable[size];

    for(int i=0; i<size; i++){
        hashTable[i] = -1;
    }
    
    int userCounter = 1;
    int user;
    while(userCounter != 7){
        cout<<"1 for linearProb\n2 for print\n3 for quadProbing\n4 for linearProbSearch\n5 for linearProbSearchDelete: \n6 for quadricSearch\n7 for exit";
        cin>>userCounter;

        if(userCounter == 1){
            cout<<"Enter number to linearProb: ";
            cin>>user;
            linearProbing(hashTable,size,user);
        }
        else if(userCounter == 2){
            print(hashTable,size);
        }
        else if(userCounter == 3){
            cout<<"Enter number for quadricProb: ";
            cin>>user;
            quadraticProbing(hashTable, size, user);
        }
        else if(userCounter == 4){
            cout<<"Enter number for search: ";
            cin>>user;
            linearProbSearch(hashTable,size,user);
        }
        else if(userCounter == 5){
            cout<<"Enter number for delete: ";
            cin>>user;
            linearProbSearchDelete(hashTable,size,user);
        }
        else if(userCounter == 6){
            cout<<"Enter number for Quadsearch: ";
            cin>>user;
            quadProbingSearch(hashTable,size,user);
        }
    }

    return 0;
}