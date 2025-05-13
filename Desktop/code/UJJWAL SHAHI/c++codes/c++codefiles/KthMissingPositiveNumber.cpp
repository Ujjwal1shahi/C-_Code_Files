#include<iostream>
#include<vector>
using namespace std;

class Kth_number{
     public:
     void search(vector<int>&a , int knum){
          int mid, start = 0, end = a.size()-1, ans = -1;

          while(start <= end){
               mid = start + (end - start)/2;

               if((a[mid] - mid - 1) >= knum){
                    ans = mid;
                    end = mid - 1;
               }
               else{
                    start = mid + 1;
               }
          }

          cout << "Kth Missing Positive Number is : " << (ans + knum) << endl;
     }
};

int main(){
     vector<int>a;
     int knum,n;

     cout << "Enter the size of array : ";
     cin >> n;

     a.resize(n);

     cout << "Enter the elements of the array : ";
     for(int i = 0 ; i < n ; i++){
          cin >> a[i];
     }

     cout << "Enter the kth position : ";
     cin >> knum;

     Kth_number k;
     k.search(a, knum);

     return 0;
}