#include<bits/stdc++.h>
using namespace std;

class Student{
     int roll;
     string name;

     public:
     Student(int x , string y){
          roll = x;
          name = y;

          cout << roll << " " << name;
     }

     void display(){
          cout << name << " " << roll;
     }
};

int main(){
     Student *s = new Student(123, "hello");
     (*s).display();
     return 0;
}