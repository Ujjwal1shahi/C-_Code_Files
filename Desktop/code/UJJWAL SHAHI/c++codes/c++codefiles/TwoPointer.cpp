#include<iostream>
using namespace std;

void seperate(int a[]){
     int start = 0, end = 6;

     while(start <= end){
          if(a[start] == 0){
               start++;
          }
          else{
               if(a[end] == 0){
                    swap(a[start], a[end]);
                    start++;
                    end--;
               }
               else{
                    end--;
               }
          }
     }
}

int main(){
     int arr[7];

     cout << "Enter the elements of the array : ";
     for(int i = 0 ; i < 7; i++){
          cin >> arr[i];
     }

     seperate(arr);

     for(int i = 0; i < 7 ; i++){
          cout << arr[i] << " ";
     }

     return 0;
}