#include <iostream>
#include <vector>
using namespace std;

class PrefixSuffixSum{
     public:
     void Psum(vector<int>&a){
          vector<int>prefix(a.size());

          prefix[0] = a[0];

          for(int i = 1; i < a.size(); i++){
               prefix[i] = prefix[i-1] + a[i];
          }

          cout << "Prefix Sum : ";
          for(int i = 0; i < prefix.size(); i++){
               cout << prefix[i] <<" ";
          }

          cout << endl;
     }

     void Ssum(vector<int>&a){
          vector<int>sufix(a.size());

          sufix[sufix.size()-1] = a[a.size()-1];

          for(int i = a.size()-2; i >= 0 ; i--){
               sufix[i] = sufix[i+1] + a[i];
          }

          cout << "Suffix Sum : ";
          for(int i = 0; i < sufix.size(); i++){
               cout << sufix[i] <<" ";
          }

          cout << endl;
     }
};

int main(){
     int n;

     cout << "Enter the size of array : ";
     cin >> n;
     vector<int>a(n);

     cout << "Enter the elements : ";
     for(int i = 0 ; i < n ; i++){
          cin >> a[i];
     }

     PrefixSuffixSum s;
     s.Psum(a);
     s.Ssum(a);

     return 0;
}