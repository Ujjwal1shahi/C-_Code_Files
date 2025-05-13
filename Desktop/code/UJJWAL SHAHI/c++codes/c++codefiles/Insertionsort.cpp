#include<bits/stdc++.h>
using namespace std;

int main(){
     int n;
     cout << "Enter the size of Array : "<<endl;
     cin >> n;

     int a[n];

     cout << "Enter the elements of the Array : "<<endl;

     for(int i = 0; i < n ; i++){
          cin >> a[i];
     }

     cout << "Insertion Sort"<<endl;

     //Greatest First
     for(int i = 1; i < n ; i++){
          for(int j = n-1; j > 0 ; j--){
               if(a[j] > a[j-1]){
                    swap(a[j],a[j-1]);
               }
               else{
                    break;
               }
          }
     }

     //Least First
     for(int i = 1; i < n ; i++){
          for(int j = n-1; j > 0 ; j--){
               if(a[j] < a[j-1]){
                    swap(a[j],a[j-1]);
               }
               else{
                    break;
               }
          }
     }

     for(int i = 0; i<n ; i++){
          cout << a[i] << " ";
     }

     return 0;
}