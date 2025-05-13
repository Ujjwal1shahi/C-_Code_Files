#include<iostream>
#include<vector>
using namespace std;

int main(){
     vector<int>a;

     for(int i = 0; i < a.size() ; i++){
          a.push_back(i);
     }

     cout << "size of the array : "<< a.size() << "capacity of the array : " << a.capacity() <<endl;
     cout << "Deleted element : " << a.pop_back();

     cout << "First element of the array : "<<a.front() << endl << "Last element : "<<a.back()<<endl;
     cout << "sorting the aaray : " << sort(a.begin(), a.end()) <<endl;

     cout << "Reverse of the array : ";
     for(int i = a.rbegin() ; i >= a.rend() ; i--){
          cout << a[i] << " ";
     }



     return 0;     
}