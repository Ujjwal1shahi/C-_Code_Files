#include<iostream>
#include<vector>
using namespace std;

class BSin2DArr{
     public:


     void s1(vector<vector<int>>&matrix, int M, int N, int x){
          int start = 0, end = (N*M)-1;

          while(start <= end){
               int mid = start + (end - start)/2;
               int rowmid = mid/M;
               int colmid = mid%M;

               if(matrix[rowmid][colmid] == x){
                    cout << "Found : " << x << " at " << rowmid << " " << colmid <<end;
                    return;
               }
               else if(matrix[rowmid][colmid] < x){
                    start = mid + 1;
               }
               else{
                    end = mid - 1;
               }
          }
     }

     void search(vector<vector<int>>&matrix , int M, int N, int x){
          for(int i = 0; i < N; i++){
               if(matrix[i][0] <= x && x <= matrix[i][M-1]){

                    int start = 0, end = M-1;
                    while(start <= end){
                         int mid = start + (end - start)/2;

                         if(matrix[i][mid] == x){
                              cout << "Found : " << x << " at " << i << " " << j <<end;
                              return; 
                         }
                         else if(matrix[i][mid] < x){
                              start = mid + 1;
                         }
                         else{
                              end = mid - 1;
                         }
                    }
               }
          }

          for(int i = 0; i < N; i++){
               for(int j = 0; j < M; j++){
                    cout << matrix[i][j] << " ";
               }
          }
     }
};


int main(){
     int M,N,x;
     cout << "Enter the value of row : ";
     cin >> N;

     cout << "Enter the value of col : ";
     cin >> M;

     vector<vector<int>> matrix(N , vector<int>(M));

     cout << "Enter the elements of the array : ";

     for(int i = 0; i < N; i++){
          for(int j = 0 ; j < M; j++){
               cin >> matrix[i][j];
          }
     }

     cout << "Enter the element to find : ";
     cin >> x;


     BSin2DArr b;
     b.search(matrix, M, N, x);

     return 0;
}