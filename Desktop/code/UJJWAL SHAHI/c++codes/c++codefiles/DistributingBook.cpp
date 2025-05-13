#include<iostream>
#include<vector>
using namespace std;

class Book_distr{
     public:
     void distribute(vector<int>&a , int m){

          if(k > a.size()){
               cout << "Distribution cannot be possible : " << -1 <<endl;
          }

          int start = 0, end = 0, mid, ans = 0;

          for(int i = 0; i < a.size() ; i++){
               start = max(start , a[i]);
               end = end + a[i];
          }

          while(start <= end){
               mid  = start + (end - start)/2;

               int pages = 0, student = 1;

               for(int i = 0; i < a.size() ; i++){
                    pages = pages + a[i];

                    if(pages > mid){
                         student++;
                         pages = pages + a[i];
                    }
               }

               if(student <= m){
                    ans = mid;
                    end = mid - 1;
               }
               else{
                    start = mid + 1;
               }
          }

          cout << "Answer is : " <<ans <<endl;
     }
};


int main(){
     vector<int>a;
     int m,n;

     cout << "Enter the size of the array : ";
     cin >> n;

     a.resize(n);

     cout << "Enter the values in array : ";
     for(int i = 0 ; i < n ; i++){
          cin >> a[i];
     }

     cout << "Enter the no. of student : ";
     cin >> m;

     Book_distr b;
     b.distribute(a,m);

     return 0;
}