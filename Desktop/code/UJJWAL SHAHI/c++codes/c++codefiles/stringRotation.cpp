#include <iostream>
#include <string>
using namespace std;

class Str
{
public:
     void rotateclck(string &s)
     {
          char c = s[s.size() - 1];
          int index = s.size() - 2;

          while (index >= 0)
          {
               s[index + 1] = s[index];
               index--;
          }
          s[0] = c;
     }

     void rotateanticlck(string &s)
     {
          char c = s[0];
          int index = 1;

          while (index < s.size())
          {
               s[index - 1] = s[index];
               index++;
          }
          s[s.size() - 1] = c;
     }
};

int main()
{

     string s1, s2;

     Str s;

     if (s1.size() != s2.size())
     {
          return 0;
     }

     string clck, anticlck;

     clck = s1;

     s.rotateclck(clck);
     s.rotateclck(clck);

     if (clck == s2)
     {
          return 1;
     }

     anticlck = s1;

     s.rotateanticlck(anticlck);
     s.rotateanticlck(anticlck);

     if (anticlck == s2)
     {
          return 1;
     }

     return 0;
}