#include <iostream>
using namespace std;

namespace college
{
    class Student
    {
    private:
        string Studentname;
        int studentId;

    public:
        Student() : Studentname("Null"), studentId(0)
        {
        }
        Student(string studentName, int studentId) : Studentname(studentName), studentId(studentId)
        {
        }
        void setStudentName(string name)
        {
            this->Studentname = name;
        }
        string getStudentName()
        {
            return Studentname;
        }
        void displayStudentDetails()
        {
            cout<<"---------- Student Details ------------"<<endl;
            cout << "Student Id: " << studentId << endl;
            cout << "Student Name: " << Studentname << endl;
        }
    };

    class Teacher
    {
    private:
        string teacherName;
        int teacherId;

    public:
        Teacher() : teacherName("Null"), teacherId(0)
        {
        }
        Teacher(string teacherName, int teacherId) : teacherName(teacherName), teacherId(teacherId)
        {
        }
        void setTeacherName(string name)
        {
            this->teacherName = name;
        }
        string getTeacherName()
        {
            return teacherName;
        }
        void displayTeacherDetails()
        {
            cout<<"---------- Teacher Details ------------"<<endl;
            cout << "Teacher Id: " << teacherId << endl;
            cout << "Teacher Name: " << teacherName << endl;
        }
    };

}

int main()
{
    using namespace college;
    Student s1;
    s1.displayStudentDetails();

    Student s2("Himanshu",0001);
    s2.displayStudentDetails();

    s2.setStudentName("Rahul");
    s2.displayStudentDetails();


    Teacher t1;
    t1.displayTeacherDetails();

    Teacher t2("Onkar",1000);
    t2.displayTeacherDetails();

    t2.setTeacherName("Anurag");
    t2.displayTeacherDetails();
    
    
    return 0;
}

