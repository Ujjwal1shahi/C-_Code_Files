#include<iostream>
using namespace std;

int main(){
     int n;
     int ans = INT8_MAX;

     cout <<"Enter the size of array : ";
     cin >> n;

     int arr[n];

     cout << "Enter the elements of array : ";

     for(int i = 0 ; i < n ; i++){
          cin >> arr[i];
     }

     cout << "Finding minimum element of the array "<< endl;
     for(int i = 0 ; i < 5 ; i++){
          if(ans > arr[i]){
               ans = arr[i];
          }
     }

     cout << "Smallest of the number in the array is : "<< ans << endl;
}