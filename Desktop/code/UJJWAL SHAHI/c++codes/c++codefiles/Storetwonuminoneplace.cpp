#include<iostream>
using namespace std;

int main(){

     int n ;
     cout << "Enter the size of the array : ";
     cin >> n;


     int a[n];
     cout << "Enter the numbers : ";
     for(int i = 0; i < n; i++){
          cin >> a[i];
     }


     int count = 0,x,num;
     cout << "ENter the number to find occurence : ";
     cin >> x;

     for(int i = 0; i < n; i++){
          if(a[i] == x){
               count++;
               num = a[i];
          }
     }

     int answer =0;
     answer = (count*(n+1)) + num;

     cout << "Answer is : " << answer<<endl;

     int orgnum = 0, ocur = 0;

     orgnum = answer % (n+1);
     ocur = answer / (n+1);

     cout << "Extracted : "<< " number " << orgnum<< " occur " << ocur<<endl;

     return 0;
}