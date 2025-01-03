#include <iostream>
using namespace std;

struct stud
{
    int SID;
    stud *next;
};
struct course
{
    int CID;
    course *next;
    stud *studstart;
};
course *head = NULL;

void courseinsert(int data)
{
    course *ptr = new course;
    ptr->CID = data;
    ptr->next = NULL;
    ptr->studstart = NULL;
    if (head == NULL)
    {
        head = ptr;
    }
    else
    {
        course *curr = head;
        while (curr->next != NULL)
        {
            curr = curr->next;
        }
        curr->next = ptr;
    }
}
void studinsert(int data)
{
    int index;
    index=data%10;
    stud *ptr = new stud;
    ptr->SID = data;
    ptr->next = NULL;
    course *temp = head;
    if (temp == NULL)
    {
        cout << "list is empty" << endl;
    }
    else
    {
        while (temp->CID != index)
        {
            temp = temp->next;
        }
        cout << "course found " << endl;
        if (temp->studstart == NULL)
        {
            temp->studstart = ptr;
        }
        else
        {
            stud *curr = temp->studstart;
            while (curr->next != NULL)
            {
                curr = curr->next;
            }
            curr->next = ptr;
        }
    }
}
void Delete(int tosearch)
{
    int cdata;
    cout << "Enter course in which u want to delete student" << endl;
    cin >> cdata;
    course *curr = head;
    if (curr == NULL)
    {
        cout << "not found";
        return;
    }
    else
    {
        while (curr != NULL)
        {

            if (curr->CID == cdata)
            {
                if (curr->studstart == nullptr)
                {
                    cout << "no students in this course" << endl;
                    return;
                }
                if (curr->studstart->SID == tosearch)
                {
                    stud *temp = curr->studstart;
                    curr->studstart = curr->studstart->next;
                    delete temp;
                }
                else
                {
                    stud *currstu = curr->studstart->next;
                    stud *prev = curr->studstart;
                    while (currstu != NULL)
                    {
                        if (currstu->SID == tosearch)
                        {
                            prev->next = currstu->next;
                            delete currstu;
                            break;
                        }
                        else
                        {
                            currstu = currstu->next;
                            prev = prev->next;
                        }
                    }
                }
            }
            curr = curr->next;
        }
    }
}

void print()
    {
        course *curr = head;
        while (curr != NULL)
        {
            cout << curr->CID << ": ";
            stud *std = curr->studstart;
            while (std != NULL)
            {
                cout << std->SID << " ";
                std = std->next;
            }
            cout << endl;
            curr = curr->next;
        }
    }
//     void searchcourse(course **head,int tosearch){
//     if(*head==NULL){
//         cout<<"empty list"<<endl;
//     }
//     else{
//         bool flag=false;
//         course *curr=*head;
//         while(curr!=NULL){
//             if(curr->coursecode==tosearch){
//                 cout<<"found"<<endl;
//                 flag=true;
//                 break;
//             }
//             else{
//                 curr=curr->next;
//             }
//         }
//         if(flag==true){
//             cout<<"course found"<<endl;
//         }
//         else{
//             cout<<"course didn't found"<<endl;
//         }
        
//     }
// }
// void searchstudent(int data){
//     if(*head==NULL){
//         cout<<"empty list"<<endl;
//     }
//     else{
//         int tosearch:
//         tosearch=data%10;
//         bool flag=false;
//         bool flag1=false;
//         course *curr=*head;
//         while(curr!=NULL){
//             node *studentcurr=curr->student;
//             while(studentcurr!=NULL){
//                 if(studentcurr->id==tosearch){
//                 flag=true;
//                 break;
//             }
//             else{
//                 studentcurr=studentcurr->next;
//             }
//             }
//             if(flag==true){
//                 cout<<curr->coursecode<<endl;
//                 break;
//             }
//             else{
//            curr=curr->next;}
//         }
//         if(flag==true){
//             cout<<"student found"<<endl;
//         }
//         else{
//             cout<<"student didn't found"<<endl;
//         }
        
//     }
// }

    int main()
    {

        for (int i=0; i<10; i++){
            courseinsert(i);
        }

        int a = 1;
        while (a != 5)
        {
            cout << "enter 1 for search  and 2 for inserting student 3 for print 4 for delete: " << endl;
            cin >> a;
            //  if (a == 1)
            //  {
            //      int data;
            //      cout << "enter course id" << endl;
            //      cin >> data;
            //      searchstudent(data);
             //}
           if (a == 2)
            {
                int data;
                cout << "enter student id";
                cin >> data;
                studinsert(data);
            }
            else if (a == 3)
            {
                print();
            }
            else if (a == 4)
            {
                int tosearch;
                cout << "Enter a student to delete" << endl;
                cin >> tosearch;
                Delete(tosearch);
            }
        }
        return 0;
    }