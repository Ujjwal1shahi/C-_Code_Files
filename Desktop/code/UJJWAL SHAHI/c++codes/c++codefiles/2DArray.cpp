#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class TWOD_Array{
     public:
     //index of maximum sum of the row 
     void sumMax(int a[][4], int col, int row){
          int total,sum = INT_MIN, index = -1;

          for(int i = 0; i < row; i++){
               total = 0;
               for(int j = 0 ; j < col; j++){
                    total = total + a[i][j];

                    if(total > sum){
                         sum = total;
                         index = i;
                    }
               }
          }

          cout << "Index is: " << index << " SUM is: " << sum << endl;
     }

     void reverseRow(int a[][4], int row, int col){
          for(int i = 0; i < row; i++){
               int start = 0, end = col - 1;

               while(start < end){
                    swap(a[i][start], a[i][end]);
                    start++;
                    end--;
               }
          }

          for(int i = 0 ; i < row ; i++){
               for(int j = 0; j < col; j++){
                    cout << a[i][j] << " ";
               }
          }
     }

     void diagonalSum(int a[][4], int row, int col){
          int rowsum = 0, colsum = 0;

          for(int i = 0; i < row; i++){
               rowsum = rwosum + a[i][i];
          }
          cout << "SUM of diagonal : " << rowsum;

          for(int j = col-1; j >= 0; j++){
               colsum = colsum + a[i][j];
               i++;
          }
          cout << "SUM of diagonal : " << colsum;
     }
};

int main(){
     int a[4][4];

     cout << "Enter the elements in array : ";
     for(int i = 0; i < 4; i++){
          for(int j = 0; j < 4; j++){
               cin >> a[i][j];
          }
     }

     TWOD_Array t;
     t.sumMax(a,4,4);
     t.reverseRow(a,4,4);
     t.diagonalSum(a,4,4);

     return 0;
}