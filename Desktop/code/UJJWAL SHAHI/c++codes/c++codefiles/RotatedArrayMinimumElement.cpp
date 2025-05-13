#include<iostream>
#include<vector>
using namespace std;

class R_Arr_minimum{
     public:
     void search(vector<int>&a){
          int mid, start = 0, end = a.size()-1, ans = 0;

          while(start <= end){
               mid = start + (end - start)/2;

               if(a[mid] >= a[0]){
                    start = mid + 1;
               }
               else{
                    ans = a[mid];
                    end = mid - 1;
               }
          }

          cout << "Answer is : " << ans;
     }
};

int main(){
     vector<int>a;
     int n;

     cout << "Enter the size of the array : ";
     cin >> n;

     cout << "Enter the elements of the array : ";
     a.resize(n);

     for(int i = 0; i < n ; i++){
          cin >> a[i];
     }

     R_Arr_minimum r;
     r.search(a);

     return 0;
}