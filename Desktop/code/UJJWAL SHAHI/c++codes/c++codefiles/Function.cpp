#include <iostream>
#include <cmath>
using namespace std;

int factorial(int n)
{
     int ans = 1;

     for (int i = 1; i <= n; i++)
     {
          ans = ans * i;
     }

     return ans;
}

// Default Parameter
int fact(int n = 2)
{
     int ans = 1;

     for (int i = 1; i <= n; i++)
     {
          ans = ans * i;
     }

     return ans;
}

// Pass By Value
void increase(int n)
{
     ++n;
}

// Pass By Reference
void inc(int &n)
{
     ++n;
}

// Function Overloading

void Swap(int &n, int &m)
{
     int t;

     t = n;
     n = m;
     m = t;
}
void Swap(float &n, float &m)
{
     float t;

     t = n;
     n = m;
     m = t;
}

// changing the case of characters

char convert(char name)
{
     char ans = name - 'a' + 'A';
     return ans;
}

// Armstrong number

void Armstrong(int n)
{
     int x = n;
     int count = 0;

     while (x)
     {
          count++;
          x = x / 10;
     }

     int ans = 0,z=0, a;
     x = n;

     while (x)
     {
          a = x%10;
          x = x/10;
          z = round(pow(a, count));
          ans = ans + z;
     }

     if(n == ans){
          cout << "It is an Armstrong Number"<<endl;
     }
     else{
          cout << "It is not an Armstrong Number"<<endl;
     }
}

// Boolean function

bool is_rectangle(int a, int b, int c, int d){
     if(( a==b && c==d) || (a==c && b==d) || (a==d || c==b)){
          return 1;
     }
     else{
          return 0;
     }
}

// Bishop total steps

int bishop(int x , int y){
     int count = 0;

     count += min(8-x,8-y);
     count += min(8-x,y-1);
     count += min(x-1,8-y);
     count += min(x-1,y-1);

     return count;
}

int main()
{

     int a, b = 1, c = 3, d = 1;
     float f1 = 3.14, f2 = 32.32;
     // char c;

     cout << "Enter the number : ";
     cin >> a;

     // cout << "Factoraial of " << a << " is : " << factorial(a) << endl;
     // cout << "Factoraial of is : " << fact() << endl;

     // increase(a);
     // cout << "Number is : " << a << endl;
     // inc(a);
     // cout << "Increased Number is : " << a << endl;

     // cout << "Swapped number : " << endl;
     // Swap(a, b);
     // cout << a << " " << b << endl;

     // cout << "Swapped number : " << endl;
     // Swap(f1, f2);
     // cout << f1 << " " << f2 << endl;

     // cout << "Enter the character : ";
     // cin >> c;

     // cout << "Changed case : " << convert(c)<<endl;

     // Armstrong(a);
     cout << is_rectangle(a,b,c,d)<< endl;

     return 0;
}