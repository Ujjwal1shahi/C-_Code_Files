#include<bits/stdc++.h>
using namespace std;

int main(){
     int n;
     int target, mid, start, end;

     cout << "Enter the size of the array : "<<endl;
     cin >> n;

     int a[n];

     cout << "Enter the elements of the array : "<<endl;
     for(int i = 0; i < n; i++){
          cin >> a[i];
     }

     cout << "Enter the target element : "<<endl;
     cin >> target;

     cout << "Binary Search : "<<endl;
     start = 0;
     end = n-1;

     while(start <= end){
          mid = start + (end - start)/2;

          if(a[mid] == target){
               cout << "Target present at : " << mid << endl;
               break;
          }
          else if(a[mid] < target){
               end = mid - 1;
          }
          else{
               start = mid + 1;
          }
     }
     

     return 0;
}