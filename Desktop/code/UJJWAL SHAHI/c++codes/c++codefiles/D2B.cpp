#include <iostream>
using namespace std;

int main()
{
     int num, ans = 0, rem, p = 1;

     cout << "Enter the Decimal number : ";
     cin >> num;

     if (num == 0)
     {
          cout << "Binary : " << num;
     }
     else
     {
          while (num > 0)
          {
               rem = num % 2;
               num = num / 2;
               ans = ans + (rem*p);
               p=p*10;
          }
     }

     cout << "Your Binary Number is : " << ans;

     return 0;
}