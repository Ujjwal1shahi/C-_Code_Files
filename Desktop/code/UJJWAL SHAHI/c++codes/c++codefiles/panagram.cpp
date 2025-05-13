#include<iostream>
#include<vector>
#include<string>
using namespace std;

class pg{
     public:

     void panagrm(string &s){
          vector<bool>alpha(26,0);

          for(int i = 0; i < s.size(); i++){
               alpha[s[i]-'a'] = 1;
          }

          for(int i = 0 ; i < 26; i++){
               if(alpha[i] == 0){
                    return;
               }
          }

          cout << "Success";
     }
};


int main(){

     string s;
     s = "thequickbrownfoxjumpsoverthelazydog";
     pg p;
     p.panagrm(s);


     return 0;
}