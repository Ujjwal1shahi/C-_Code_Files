#include <iostream>
using namespace std;

void trailing_zero(int n)
{
     int x = n;
     int count = 0;

     if (x < 5)
     {
          cout << "Number of trailing zeros in factorial : " << 0 << endl;
          return;
     }
     else
     {
          while (x >= 5)
          {
               x = x / 5;
               count = count + x;
          }
     }

     cout << "Number of trailing zeros in factorial : " << count << endl;
}

int main()
{

     int a;

     cout << "Enter the number : ";
     cin >> a;
     trailing_zero(a);

     return 0;
}