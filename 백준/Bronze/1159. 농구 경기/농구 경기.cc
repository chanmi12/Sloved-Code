#include <iostream>
#include <string>
using namespace std;

int main(void)
{
  int n;
  cin >> n;
  int num[26] = {0,}; 
  for(int i = 0 ; i < n ; i++)
  {
    string s;
    cin >> s;
    num[s[0] - 97]++;
  }
  bool check = false;
  for(int i = 0 ; i < 26 ; i++)
  {
    if(num[i] >= 5)
    {
      cout << char(i+97);
      check = true;
    }
  }
  if(!check) cout << "PREDAJA";
  cout << endl;
}