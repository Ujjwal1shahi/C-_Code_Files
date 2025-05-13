#include<iostream>
using namespace std;

int main(){
     int num, ans = 0, mul = 1, rem;
     int ans1 = 0, mul1 = 1, rem1;
     
     cout << "Enter a Binary Number : ";
     cin >> num;

     if(num == 0 || num == 1){
          cout << "Octal : " << num;
     }
     else{
          while(num > 0){
               rem = num % 10;
               num /= 10;
               ans = ans + (rem * mul);
               mul *= 2;
          }

          while (ans > 0){
               rem1 = ans % 10;
               ans /= 10;
               ans1 = ans1 + (rem1 * mul1);
               mul1 *= 8;
          }
          
     }

     cout << "Octal : " << ans1;

     return 0;
}