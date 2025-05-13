#include<iostream>
#include<cmath>
using namespace std;

int main(){
     int n;
     cout << "Enter the size of array : "<<endl;
     cin >> n;

     int a[n], largest,smallest;

     cout << "Enter the elements of the array : "<<endl;
     for(int i = 0 ; i < n ; i++){
          cin >> a[i];
     }

     cout << "Selection Sort : "<< endl;

     //Shortest First
     for(int i = 0 ; i < n ; i++){
          smallest = i;
          for(int j = i+1; j < n ; j++){
               if(a[smallest] > a[j]){
                    smallest = j;
               }
          }
          swap(a[i], a[smallest]);
     }

     //Greatest First
     // for(int i = 0; i < n; i++){
     //      largest = i;
     //      for(int j = i+1 ; j < n ; j++){
     //           if(a[j] > a[largest]){
     //                largest = j;
     //           }
     //      }

     //      swap(a[i], a[largest]);
     // }

     for(int i = 0; i < n; i++){
          cout << a[i] << " ";
     }

     return 0;

}