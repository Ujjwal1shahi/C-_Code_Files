#include <iostream>
#include <vector>
using namespace std;

void search(vector<int> &a, int sum)
{
     int start, end, mid, x;
     sort(a.begin(), a.end());

     for (int i = 0; i < a.size(); i++)
     {
          x = sum - a[i];

          start = i + 1;
          end = a.size() - 1;

          while (start <= end)
          {
               mid = start + (end - start) / 2;

               if (x == a[mid])
               {
                    cout << "element : " << a[i] << " " << a[mid] << endl;
                    break;
               }
               else if (x < a[mid])
               {
                    end = mid - 1;
               }
               else
               {
                    start = mid + 1;
               }
          }
     }

     // Two Pointer approach
     void search(vector<int> & a, int sum)
     {
          int start = 0, end = a.size() - 1;

          while (start < end)
          {
               if (a[start] + a[end] == sum)
               {
                    cout << "answer : " << start << " " << end;
               }
               else if (a[start] + a[end] < sum)
               {
                    start++;
               }
               else
               {
                    end--;
               }
          }
     }
};
int main()
{
     vector<int> a;
     int sum, n;

     cout << "Enter the size of the array : ";
     cin >> n;

     a.resize(n);

     cout << "Enter the elements of the array : ";
     for (int i = 0; i < n; i++)
     {
          cin >> a[i];
     }

     cout << "Enter the sum : ";
     cin >> sum;

     search(a, sum);

     return 0;
}