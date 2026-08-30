#include <iostream>
using namespace std;

class Student
{
private:
    int rollNo;
    int marks;

public:
    Student() : rollNo(0), marks(marks)
    {
    }
    Student(int rollNo, int marks) : rollNo(rollNo), marks(marks)
    {
    }
    int getMarks(void)
    {
        return marks;
    }
    void acceptStudentDetails()
    {
        cout << "Enter Student Roll no:";
        cin >> rollNo;
        cout << "Enter the Student Marks:";
        cin >> marks;
    }
    void displayStudentRecord()
    {
        cout << "Student rollNo is: " << rollNo<<endl;
        cout << "Student Mark is: " << marks<< endl;
    }
};

int main()
{
    int num;
    cout << "Enter the number of Students: ";
    cin >> num;

    Student *arr = new Student[num];

    for (int i = 0; i < num; i++)
    {
        cout<<"Enter Student Detail of "<<i+1<<" is: "<<endl;
        arr[i].acceptStudentDetails();
    }

    cout << "---------- All Students Details---------" << endl;
    for (int i = 0; i < num; i++)
    {

        cout<<"Student "<<i+1<<" is: "<<endl;
        arr[i].displayStudentRecord();
    }

    
    int maxMarks = arr[0].getMarks();
    for (int i = 1; i < num; i++)
    {
        if (arr[i].getMarks() > maxMarks)
        {
            maxMarks = arr[i].getMarks();
        }
    }
    cout << "---------------------------------------" << endl;
    cout << "Highest marks is: " << maxMarks << endl;

    delete[] arr; //to avoid memory leakage
    arr = NULL;  // to avoid dangling pointer 

    return 0;
}
