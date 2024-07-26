#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(){
    vector<char> vec;
    string str;
    cin >> str;
    
    for(int i = 0; i < str.size(); i++){
        vec.push_back(str[i]);
    }
    sort(vec.begin(), vec.end());
    for(int i = vec.size() - 1;  i >= 0; i--){
        cout << vec[i];
    }
}