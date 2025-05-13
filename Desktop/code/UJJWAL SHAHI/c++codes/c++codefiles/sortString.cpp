#include<iostream>
#include<vector>
#include<string>
using namespace std;

class strsort{
     public:

     void sorting(string s){
          vector<int>alpha(26,0);

          for(int i = 0; i < s.size(); i++){
               alpha[s[i]-'a']++;
          }

          string ans;

          for(int i = 0; i < 26; i++){
               char c = 'a'+i;

               while(alpha[i]){
                    ans = ans + c;
                    alpha[i]--;
               }
          }

          cout <<endl << "Sorted string is : ";

          for(int i = 0; i < ans.size();i++){
               cout << ans[i];
          }
     }
};

int main(){
     string s;
     s = "edac";

     cout << "String is : ";
     for(int i = 0; i < s.size(); i++){
          cout << s[i];
     }

     strsort s1;
     s1.sorting(s);
                              
     return 0;
}