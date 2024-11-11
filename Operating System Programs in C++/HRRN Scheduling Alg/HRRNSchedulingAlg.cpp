// HRRN (Highest Response Ratio Next) Scheduling
#include <iostream>
#include <iomanip>
using namespace std;

struct Process {
    int id;                 // Process ID
    int arrivalTime;        // Time of arrival into the system
    int executionTime;          // Total time needed for execution
    int remainingTime;      // Time remaining for execution (not needed in HRRN, but kept for consistency)
    int waitingTime;        // Waiting time for the process
    int turnaroundTime;     // Turnaround time for the process
    int finishTime;     // Time at which process finishes execution
    bool isComplete;        // Flag to check if the process is completed
};

// Function to handle Highest Response Ratio Next (HRRN) Scheduling
void hrrnScheduling(Process processes[], int numberOfProcess) {
    int currentTime = 0;          // Tracks the current time in the system
    int completed = 0;            // Counts the number of completed processes

    // Initialize the completion flag for all processes
    for (int i = 0; i < numberOfProcess; i++) {
        processes[i].isComplete = false;
    }

    // Loop until all processes are completed
    while (completed < numberOfProcess) {
        int selectedProcessIndex = -1;
        float maxResponseRatio = -1.0;

        // Find the process with the highest response ratio that has arrived and is not complete
        for (int i = 0; i < numberOfProcess; i++) {
            if (processes[i].arrivalTime <= currentTime && !processes[i].isComplete) {
                int waitingTime = currentTime - processes[i].arrivalTime;
                float responseRatio = (waitingTime + processes[i].executionTime) / (float)processes[i].executionTime;

                // Select process with the highest response ratio
                if (responseRatio > maxResponseRatio) {
                    maxResponseRatio = responseRatio;
                    selectedProcessIndex = i;
                }
            }
        }

        // If a process is selected, execute it
        if (selectedProcessIndex != -1) {
            Process &p = processes[selectedProcessIndex];
            p.waitingTime = currentTime - p.arrivalTime;
            currentTime += p.executionTime;
            p.finishTime = currentTime;
            p.turnaroundTime = p.finishTime - p.arrivalTime;
            p.isComplete = true;
            completed++;

            cout << "Process ID: " << p.id << " executed." << endl;
            cout << "Process waitingTime: " << p.waitingTime << endl;
            cout << "Process turnaroundTime: " << p.turnaroundTime << endl;
            cout << "-------------------------------------------------" << endl;
        } else {
            // If no process is ready, increment the current time (simulate CPU idle time)
            currentTime++;
        }
    }
}

void displayProcessInfo(Process processes[], int numberOfProcess) {
    cout << "................................................................................." << endl;
    cout << "Final Table For Process Control Block" << endl;
    cout << setw(10) << "ID"
         << setw(15) << "Arrival Time"
         << setw(15) << "execution Time"
         << setw(15) << "Completion Time"
         << setw(15) << "Waiting Time"
         << setw(15) << "Turnaround Time" << endl;

    for (int i = 0; i < numberOfProcess; i++) {
        cout << setw(10) << processes[i].id
             << setw(15) << processes[i].arrivalTime
             << setw(15) << processes[i].executionTime
             << setw(15) << processes[i].finishTime
             << setw(15) << processes[i].waitingTime
             << setw(15) << processes[i].turnaroundTime << endl;
    }
}

int main() {
    int numberOfProcess;

    cout << "Enter the number of processes: ";
    cin >> numberOfProcess;

    Process processes[numberOfProcess];

    for (int i = 0; i < numberOfProcess; i++) {
        processes[i].id = i + 1;  // Process ID is i+1 for consistency
        cout << "Enter the arrival time for process " << processes[i].id << ": ";
        cin >> processes[i].arrivalTime;
        cout << "Enter the execution time for process " << processes[i].id << ": ";
        cin >> processes[i].executionTime;
        processes[i].remainingTime = processes[i].executionTime; 
    }

    hrrnScheduling(processes, numberOfProcess);

    displayProcessInfo(processes, numberOfProcess);

    return 0;
}

