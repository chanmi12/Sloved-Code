#include <iostream>
using namespace std;

int a, b=0, c=0;
int p[500001];
int main(){
  cin >> a;
  for(int i=0; i<a; i++){
    cin >> p[i];
    b = b + p[i];
    c ++;
  }
  cout << b-(c-1);
}

