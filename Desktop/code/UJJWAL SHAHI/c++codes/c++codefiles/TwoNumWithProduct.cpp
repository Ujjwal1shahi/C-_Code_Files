#include<iostream>
#include<vector>
#include<bits/stdc++.h>
using namespace std;

class Two_n_p{
     public:

     void product1(vector<int>&a , int product){
          int start,end,mid,x;

          sort(a.begin() , a.end());
          
          for(int i = 0; i < a.size() ; i++){
               x = product/a[i];

               start = i + 1;
               end = a.size()-1;

               while(start <= end){
                    mid = start + (end - start)/2;

                    if(x == a[mid]){
                         cout << "Found : "<<a[mid]<<" "<<x<<endl;
                    }
                    else if(x < a[mid]){
                         start = mid + 1;
                    }
                    else{
                         end = mid - 1;
                    }
               }
          }
     }


     //Two Pointer approach

     void product(vector<int>&a, int product){
          int start = 0, end = a.size()-1;

          sort(a.begin(), a.end());

          while(start < end){
               if((a[start]*a[end]) == product){
                    cout << "Product found : "<< a[start]<<" "<<a[end]<<endl;
                    break;
               }
               else if((a[start]*a[end]) < product){
                    start++;
               }
               else{
                    end--;
               }
          }
     }
};


int main(){
     vector<int>a;
     int n,prod;

     cout << "Emter the size o fthe array : ";
     cin >> n;

     a.resize(n);

     cout << "Enter the elements of the array : ";
     for(int i = 0 ; i < n ; i++){
          cin >> a[i];
     }

     cout << "Enter the product to find : ";
     cin >> prod;

     Two_n_p p;
     p.product(a,prod);

     return 0;
}