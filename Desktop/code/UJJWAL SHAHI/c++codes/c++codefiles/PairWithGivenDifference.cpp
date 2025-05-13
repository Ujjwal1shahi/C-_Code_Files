#include <iostream>
#include <vector>
#include <bits/stdc++.h>
using namespace std;

class PWGD
{
public:
     void search(vector<int> &a, int difference)
     {
          int start, end, mid, x;
          sort(a.begin(), a.end());

          for (int i = 0; i < a.size(); i++)
          {
               x = difference + a[i];

               start = i + 1;
               end = a.size() - 1;

               while (start <= end)
               {
                    mid = start + (end - start) / 2;

                    if (x == a[mid])
                    {
                         cout << "Founded : " << a[i] << " " << a[mid] << endl;
                         break;
                    }
                    else if (x < a[mid])
                    {
                         start = mid + 1;
                    }
                    else
                    {
                         end = mid - 1;
                    }
               }
          }
     }

     // Two Pointer approach
     void search2(vector<int>&a, int d){
          int start = 0, end = 1;

          while(end < a.size()){
               if((a[end] - a[start]) == d){
                    cout << "FOund" << a[end] << " " << a[start];
               }
               else if((a[end] - a[start]) < d){
                    end++;
               }
               else{
                    start++;
               }
          }
     }
};

int main()
{
     vector<int> a;
     int n, diff;

     cout << "Enter the size of the array : ";
     cin >> n;

     a.resize(n);

     cout << "Enter the element of the array : ";
     for (int i = 0; i < a.size(); i++)
     {
          cin >> a[i];
     }

     cout << "Enter the difference : ";
     cin >> diff;

     PWGD p;
     p.search(a, diff);

     return 0;
}