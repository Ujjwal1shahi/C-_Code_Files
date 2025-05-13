#include<bits/stdc++.h>
using namespace std;

class Student{
     public:
     int roll;
     int age;
     
     Student(){
          age = 200;
          roll = 300;
     }

     Student(int age , int roll){
          this->age = age;
          this->roll = roll;
     }

     ~Student(){
          cout << "Deconstructur called"<<endl;
     }
};

int main(){

     // object created statically
     Student s1(19,28);
     cout << s1.age <<" "<< s1.roll<<endl;

     s1.roll = 100;
     s1.age = 17;

     cout << s1.age <<" "<< s1.roll<<endl;

     Student s2;
     cout << s2.age <<" "<<s2.roll<<endl;

     // object created dynamically

     Student *s3 = new Student;
     s3->age = 100;
     s3->roll = 1001;

     cout << s3->age << " " << s3->roll << endl;

     Student *s4 = new Student(2210,78328);
     cout << s4->age << " " << s4->roll << endl;

     return 0;
}