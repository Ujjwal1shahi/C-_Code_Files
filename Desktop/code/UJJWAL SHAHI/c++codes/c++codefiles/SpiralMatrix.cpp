#include <iostream>
using namespace std;

class Spiral
{
public:
     void rotate(int a[][6], int row, int col)
     {
          int top = 0, right = 5, left = 0, bottom = 5;

          while (top <= bottom && left <= right)
          {

               for (int i = left; i <= right; i++)
               {
                    cout << a[top][i] << " ";
               }
               top++;

               for (int i = top; i <= bottom; i++)
               {
                    cout << a[i][right] << " ";
               }
               right--;

               if (top <= bottom)
               {
                    for (int i = right; i >= left; i--)
                    {
                         cout << a[bottom][i] << " ";
                    }
                    bottom--;
               }

               if (left <= right)
               {
                    for (int i = bottom; i >= top; i--)
                    {
                         cout << a[i][left] << " ";
                    }
                    left++;
               }
          }
     }
};