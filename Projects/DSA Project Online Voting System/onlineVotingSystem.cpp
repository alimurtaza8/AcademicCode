#include <iostream>
#include <string>
using namespace std;

struct VoterNode {
    int data;
    bool hasVoted;
    VoterNode* next;
};

VoterNode* head = NULL;
void insertVoter(int data) {
    VoterNode* ptr = new VoterNode;
    ptr->data = data;
    ptr->hasVoted = false;
    ptr->next = NULL;

    if (head == NULL) {
        head = ptr;
    } else {
        ptr->next = head;
        head = ptr;
    }
}

VoterNode* search(int data) {
    VoterNode* ptr = head;
    while (ptr != NULL) {
        if (ptr->data == data) {
            return ptr;
        }
        ptr = ptr->next;
    }
    return NULL;
}

void printVoters() {
    VoterNode* ptr = head;
    while (ptr != NULL) {
        if(ptr->hasVoted){
            cout << ptr->data << " (voted)" << ", ";
        }
        else {
            cout << ptr->data << ", ";
        }
        ptr = ptr->next;
    }
    cout << endl;
}

struct Candidate {
    string name;
    int votes;
};

Candidate candidates[100];  
int candidateCount = 0;

void addCandidate(string name) {
    candidates[candidateCount].name = name;
    candidates[candidateCount].votes = 0;
    candidateCount++;
}

void vote(string candidate) {
    for (int i = 0; i < candidateCount; i++) {
        if (candidates[i].name == candidate) {
            candidates[i].votes++;
            return;
        }
    }
}

int getVotes(string candidate) {
    for (int i = 0; i < candidateCount; i++) {
        if (candidates[i].name == candidate) {
            return candidates[i].votes;
        }
    }
    return 0;
}

void printResults() {
    cout << "Voting Results:" << endl;
    for (int i = 0; i < candidateCount; i++) {
        cout << candidates[i].name << ": " << candidates[i].votes << " votes" << endl;
    }
}

struct CandidateBSTNode {
    string data;
    CandidateBSTNode* left;
    CandidateBSTNode* right;
};

CandidateBSTNode* root = NULL;

CandidateBSTNode* insert(CandidateBSTNode* root, string data) {
    if (root == NULL) {
        root = new CandidateBSTNode;
        root->data = data;
        root->left = NULL;
        root->right = NULL;
        addCandidate(data);  
        return root;
    }

    if (data < root->data) {
        root->left = insert(root->left, data);
    } else {
        root->right = insert(root->right, data);
    }
    return root;
}

bool searchCandidate(CandidateBSTNode* root, string candidate) {
    if (root == NULL) {
        return false;
    } else if (root->data == candidate) {
        return true;
    } else if (candidate < root->data) {
        return searchCandidate(root->left, candidate);
    } else {
        return searchCandidate(root->right, candidate);
    }
}

void printCandidates(CandidateBSTNode* root) {
    if (root == NULL) {
        return;
    }
    printCandidates(root->left);
    cout << root->data << " ";
    printCandidates(root->right);
}

struct QueueLL {
    int data;
    QueueLL* next;
};

QueueLL* qHead = NULL;
QueueLL* qRare = NULL;

bool isEmpty() {
    return qHead == NULL && qRare == NULL;
}

void enQueue(int value) {
    QueueLL* newNode = new QueueLL;
    newNode->data = value;
    newNode->next = NULL;

    if (isEmpty()) {
        qHead = newNode;
        qRare = newNode;
        newNode->next = NULL;
        return;
    } else {
        qRare->next = newNode;
        qRare = newNode;
    }
}

void deQueue() {
    if (isEmpty()) {
        cout << "Queue is empty" << endl;
        return;
    }

    if (qHead == qRare) {
        qHead = NULL;
        qRare = NULL;
        return;
    }

    QueueLL* temp = qHead;
    qHead = qHead->next;
    delete temp;
}

int front() {
    if (isEmpty()) {
        cout << "Queue is empty" << endl;
        return -1;
    }
    return qHead->data;
}

int main() {
    int userCounter = 1;
    int user;
    string candidate;
    int voterID;

    cout << "Welcome to the Online Voting System!" << endl;

    while (userCounter != 9) {
        cout << "\n1. Add Voter\n2. Print Voters\n3. Add Candidate\n4. Print Candidates\n5. Vote\n6. Print Results\n7. Enqueue Voter\n8. Dequeue Voter\n9. Exit" << endl;
        cin >> userCounter;

        switch (userCounter) {
            case 1:
                cout << "Enter Voter ID: ";
                cin >> voterID;
                if (!search(voterID)) {
                    insertVoter(voterID);
                    cout << "Voter added successfully!" << endl;
                } else {
                    cout << "Voter ID already exists!" << endl;
                }
                break;
            case 2:
                cout << "Voters: ";
                printVoters();
                break;
            case 3:
                cout << "Enter Candidate Name: ";
                cin >> candidate;
                root = insert(root, candidate);
                cout << "Candidate added successfully!" << endl;
                break;
            case 4:
                cout << "Candidates: ";
                printCandidates(root);
                break;
            case 5: {
                cout << "Enter Voter ID: ";
                cin >> voterID;
                VoterNode* voterNode = search(voterID);
                if (voterNode != NULL) {
                    if (voterNode->hasVoted) {
                        cout << "You are a duplicate voter. Vote not allowed." << endl;
                    } else {
                        cout << "Enter Candidate Name: ";
                        cin >> candidate;
                        if (searchCandidate(root, candidate)) {
                            vote(candidate);
                            voterNode->hasVoted = true;
                            cout << "Vote cast successfully!" << endl;
                        } else {
                            cout << "Candidate not found!" << endl;
                        }
                    }
                } else {
                    cout << "Voter ID not found!" << endl;
                }
                break;
            }
            case 6:
                printResults();
                break;
            case 7:
                cout << "Enter Voter ID: ";
                cin >> voterID;
                enQueue(voterID);
                cout << "Voter enqueued successfully!" << endl;
                break;
            case 8:
                if (!isEmpty()) {
                    cout << "Dequeued Voter ID: " << front() << endl;
                    deQueue();
                } else {
                    cout << "Queue is empty!" << endl;
                }
                break;
            case 9:
                cout << "Exiting the system. Goodbye!" << endl;
                break;
            default:
                cout << "Invalid option. Please try again." << endl;
                break;
        }
    }

    return 0;
}
