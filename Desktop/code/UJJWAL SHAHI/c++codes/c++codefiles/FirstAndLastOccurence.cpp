#include<iostream>
#include<vector>
using namespace std;

class Occur
{
public:
     int search(vector<int> &a, int target)
     {
          int start = 0, mid, end = a.size() - 1, first = -1, last = -1;

          // First Occurence
          while (start <= end)
          {

               mid = start + (end - start) / 2;

               if (a[mid] == target)
               {
                    first = mid;
                    end = mid - 1;
               }
               else if (a[mid] > target)
               {
                    end = mid - 1;
               }
               else
               {
                    start = mid + 1;
               }
          }

          start = 0;
          end = a.size() - 1;

          // Last Occurence

          while (start <= end)
          {

               mid = start + (end - start) / 2;

               if (a[mid] == target)
               {
                    last = mid;
                    start = mid + 1;
               }
               else if (a[mid] > target)
               {
                    end = mid - 1;
               }
               else
               {
                    start = mid + 1;
               }
          }

          cout << "First occurence is : " << first << endl;
          cout << "Last occurence is : " << last << endl;

          return 1;
     }
};

int main()
{
     vector<int> a;
     int n, target, input;

     cout << "Enter the number of elements: ";
     cin >> n;

     cout << "Enter the elements of the array: ";
     a.resize(n);
     for (int i = 0; i < n; i++)
     {
          cin >> a[i];
     }

     cout << "Enter the value of target element : ";
     cin >> target;

     Occur o;
     o.search(a, target);

     return 0;
}