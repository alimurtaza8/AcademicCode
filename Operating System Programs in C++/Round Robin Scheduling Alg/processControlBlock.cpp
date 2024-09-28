#include <iostream>
#include <queue>
#include <iomanip> 
using namespace std;

// Here We Define a structure to represent the properties of each process
struct Process {
    int id;               
    int arrivalTime;      // when process is arive in ready queue
    int executionTime;    // Total time required for execution
    int remainingTime;    // Time remaining for process execution
    int startTime;        // s.t = when first quantum is start
    int finishTime;       // Time at which the process finishes execution
    int waitTime;         // w.t = start-arrival
    int turnaroundTime;   // T.T = finish - arrival
    bool stateForInterupt;
};

// Round Robin scheduling Function for Process Control block

void interuptHandler(Process processes[],int processIndex){
    int inputSignal;
    cout<<"Enter Signal For Process ID: "<<processes[processIndex].id<<endl;
    cin>>inputSignal;
    processes[processIndex].stateForInterupt = false;
    
    if(inputSignal == 1 && processes[processIndex].stateForInterupt ==  false){
        processes[processIndex].stateForInterupt =  true;
        cout<<"Signal received"<<endl;
        cout<<"Estate changed Interupt Resouce Allocated"<<endl;
    }
    else{
        processes[processIndex].stateForInterupt = false;
        cout<<"Signal received"<<endl;
        cout<<"Estate Not Changed Process Not wanted Resouce Allocated"<<endl;
    }
}

void roundRobinScheduling(Process processes[], int numberOfProcess, int quantum) {
    queue<int> readyQueue;  // Here We use a built in queue for storing process indices
    int currentTime = 0;    // For tracking overall system time in all steps
    int completed = 0;      // varivable to count number of process completed or not

    // We Set Here a remaining time of each process to its execution time
    for (int i = 0; i < numberOfProcess; i++) {
        processes[i].remainingTime = processes[i].executionTime;
        processes[i].startTime = -1;  // Set start time to -1 assuming its not start yet
    }

    // Adding all process indices in the ready queue
    for (int i = 0; i < numberOfProcess; i++) {
        readyQueue.push(i);
    }

    // Loop until all processes are completed
    while (completed < numberOfProcess) {
        int i = readyQueue.front();  // Taking first index of process which is in first at ready queue
        readyQueue.pop();

        // Check to If Process is not completed its ex time or Complete it 
        if (processes[i].remainingTime > 0) {
            // If the process is starting for the first time set its start time
            if (processes[i].startTime == -1) {
                processes[i].startTime = currentTime;
            }
            interuptHandler(processes,i); // For Interupt handling

            // Run the process for its quantum time or remaining time whichever is smaller
            // Like min(quantum=2,remainingTime=1) than min function return 1 because its smaler
            int minTime = min(quantum, processes[i].remainingTime);
            processes[i].remainingTime -= minTime; 
            currentTime += minTime;
            cout<<"Process ID: "<<processes[i].id<<endl;
            cout<<"Process remainingTime: "<<processes[i].remainingTime<<endl;

            // If the process is complete then set its finish time
            if (processes[i].remainingTime == 0) {
                processes[i].finishTime = currentTime;
                processes[i].turnaroundTime = processes[i].finishTime - processes[i].arrivalTime;
                processes[i].waitTime = processes[i].startTime - processes[i].arrivalTime;
                completed++;
            cout<<"Process: "<<processes[i].id<<" Completed....................................................."<<endl;
            cout << setw(10) << "ID"
            << setw(15) << "Arrival Time"
            << setw(15) << "Execution Time"
            << setw(15) << "Start Time"
            << setw(15) << "Finish Time"
            << setw(15) << "Wait Time"
            << setw(15) << "Turnaround Time" << endl;
            
            cout << setw(10) << processes[i].id
             << setw(15) << processes[i].arrivalTime
             << setw(15) << processes[i].executionTime
             << setw(15) << processes[i].startTime
             << setw(15) << processes[i].finishTime
             << setw(15) << processes[i].waitTime
             << setw(15) << processes[i].turnaroundTime << endl;
            } 
            else {
                readyQueue.push(i); // If Process is not finish than add them back to readyQueue
            }
        }
    }
}

void displayProcessInfo(Process processes[], int numberOfProcess) {
    cout<<".........................................................................................."<<endl;
    cout<< "Final Table For Process Control Block" <<endl;
    cout << setw(10) << "ID"
         << setw(15) << "Arrival Time"
         << setw(15) << "Execution Time"
         << setw(15) << "Start Time"
         << setw(15) << "Finish Time"
         << setw(15) << "Wait Time"
         << setw(15) << "Turnaround Time" << endl;

    for (int i = 0; i < numberOfProcess; i++) {
        cout << setw(10) << processes[i].id
             << setw(15) << processes[i].arrivalTime
             << setw(15) << processes[i].executionTime
             << setw(15) << processes[i].startTime
             << setw(15) << processes[i].finishTime
             << setw(15) << processes[i].waitTime
             << setw(15) << processes[i].turnaroundTime << endl;
    }
}

int main() {
    int numberOfProcess, quantum;

    cout << "Enter the number of processes: ";
    cin >> numberOfProcess;

    Process processes[numberOfProcess]; 

    for (int i = 0; i < numberOfProcess; i++) {
        processes[i].id = i + 1;  // Process ID is i+1 = 0+1 = 1
        cout << "Enter execution time for process " << i + 1 << ": ";
        cin >> processes[i].executionTime;
        processes[i].arrivalTime = i;
    }

    cout << "Enter quantum time: ";
    cin >> quantum;

    roundRobinScheduling(processes, numberOfProcess, quantum);

    displayProcessInfo(processes, numberOfProcess);

    return 0;
}
