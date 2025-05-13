#include<iostream>
#include<cmath>

using namespace std;

int main(){
     int n;

     cout << "Enter the size of the array : " << endl;
     cin >> n;

     int a[n];

     cout << "Enter the number in array : " << endl;

     for(int i = 0; i < n ; i++){
          cin >> a[i];
     }

     for(int i = n-2 ; i >= 0 ; i--){
          bool swapped = 0;
          for(int j = 0; j <= i; j++){
               if(a[j] > a[j+1]){
                    swap(a[j],a[j+1]);
                    swapped = 1;
               }
          }

          if(swapped == 0){
               break;
          }
     }

     cout << "Sorted array : " << endl;
     for(int i = 0; i < n ; i++){
          cout << a[i]<< " ";
     }
     return 0;
}