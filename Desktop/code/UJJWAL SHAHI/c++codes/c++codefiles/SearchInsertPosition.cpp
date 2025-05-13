#include<iostream>
#include<vector>

using namespace std;

class Position{
     public:
     void search(vector<int>&a , int target){
          int mid, start = 0 , end = a.size()-1 , index = a.size();

          while(start <= end){

               mid = start + (end - start)/2;

               if(a[mid] == target){
                    index = mid;
                    break;
               }
               else if(a[mid] > target){
                    index = mid;
                    end = mid - 1;
               }
               else{
                    start = end + 1;
               }
          }

          cout << "Index is : " << index << endl;
     }
};

int main(){
     vector<int>a;
     int target,n;

     cout << "Enter the size of the array : ";
     cin >> n;

     cout << "Enter the values : ";
     a.resize(n);
     for(int i = 0; i < n ; i++){
          cin >> a[i];
     }

     cout << "Enter the target value : ";
     cin >> target;

     Position p;
     p.search(a,target);

     return 0;
}