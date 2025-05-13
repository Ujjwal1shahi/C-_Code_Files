#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

class Vector_2D_operations{
     public:
     void waves(vector<vector<int>>&a, int n, int m){

          cout << "Wave pattern : ";

          for(int j = 0; j < m ; j++){
               if(j%2 == 0){
                    for(int i = 0; i < n; i++){
                         cout << a[i][j] << " ";
                         cout <<endl;
                    }
               }
               else{
                    for(int i = n-1 ; i >= 0; i--){
                         cout << a[i][j] <<" ";
                         cout <<endl;
                    }
               }
          }
          cout << endl;
     }
};


int main(){
     int m,n;

     cout << "Enter the row : ";
     cin >> n;

     cout << "Enter the col : ";
     cin >> m;

     vector<vector<int>>a(n,vector<int>(m));

     cout << "Enter the elements of the array : ";
     for(int i = 0; i < n ; i++)
     for(int j = 0 ; j < m; j++)
     cin >> a[i][j];

     Vector_2D_operations v;
     v.waves(a,n,m);

     return 0;
}