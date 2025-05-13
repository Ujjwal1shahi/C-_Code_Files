#include <iostream>
using namespace std;

int main()
{
     int a[11] = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};

     int start = 0, end = 10;
     if (a[start] == 1 && a[end] == 1)
     {
          while (start <= end)
          {
               if (a[start] == a[end])
               {
                    cout << "Yes";
               }
               else
               {
                    cout << "No";
                    break;
               }
          }

          start = 0 end = 10;
          while (start <= end)
          {
               if (a[start + 1] - a[start] <= 1 || a[start + 1] - a[start] >= -1)
               {
                    start++;
               }
               else if (a[end - 1] - a[end] <= 1 || a[end - 1] - a[end] >= -1)
               {
                    end--;
               }
          }
     }

     return 0;
}