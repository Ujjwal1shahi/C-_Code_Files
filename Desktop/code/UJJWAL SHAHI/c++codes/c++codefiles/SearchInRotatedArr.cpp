#include<iostream>
#include<vector>
using namespace std;

class R_arr_search{
     public:
     void search(vector<int>&a , int target){
          int mid , start = 0, end = a.size()-1 ,ans = -1;

          while(start <= end){
               mid = start + (end - start)/2;

               if(a[mid] == target){
                    cout << "Present at index : " << mid;
                    break;
               }
               else if(a[0] <= a[mid]){
                    if(a[start] <= target && a[mid] >= target){
                         end = mid - 1;
                    }
                    else{
                         start = mid + 1;
                    }
               }
               else{
                    if(a[mid] <= target && a[end] >= target){
                         start = mid + 1;
                    }
                    else{
                         end = mid - 1;
                    }
               }
          }
     }
};

int main(){
     vector<int>a;
     int n, target;

     cout << "Emter the size of the array : ";
     cin >> n;

     a.resize(n);

     cout << "Enter the elements of the array : ";
     for(int i = 0; i < n ; i++){
          cin >> a[i];
     }

     cout << "Enter the target element ";
     cin >> target;

     R_arr_search r;
     r.search(a,target);


     return 0;
}