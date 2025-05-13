#include<iostream>
using namespace std;

int main(){
     int num, rem, ans = 0, mul = 1;

     cout << "Enter the binary number : ";
     cin >> num;

     if(num == 0 || num == 1){
          cout << "Decimal : "<< num;
     }
     else{
          while(num > 0){
               rem = num % 10;
               num /= 10;
               ans = (rem*mul) + ans;
               mul *= 2;
          }
     }

     cout << "Decimal : " << ans;

     return 0;
}