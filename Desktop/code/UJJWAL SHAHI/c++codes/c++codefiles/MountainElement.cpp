#include<iostream>
#include<vector>
using namespace std;

class Mountain{
     public:
     void search(vector<int>&a){
          int mid , start = 0, end = a.size()-1;

          while(start <= end){
               mid = start + (end - start)/2;

               if(a[mid] > a[mid - 1] && a[mid] > a[mid + 1]){
                    cout << "peek element is at index : "<< mid;
                    break;
               }
               else if(a[mid] > a[mid - 1]){
                    start = mid + 1;
               }
               else{
                    end = mid - 1;
               }
          }
     }
};


int main(){
     vector<int>a;
     int n;

     cout << "Enter the size of the array : ";
     cin >> n;

     cout << "Enter the elements of array : ";
     a.resize(n);

     for(int i = 0; i < n ; i++){
          cin >> a[i];
     }

     Mountain m;
     m.search(a);

     return 0;
}