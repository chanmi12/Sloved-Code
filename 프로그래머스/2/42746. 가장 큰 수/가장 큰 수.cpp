#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool cmp(string &a, string &b){
    return a+b > b+a;
}

string solution(vector<int> numbers) {
    string answer = "";
    vector<string> vec;
    string str = "";
    
    for(int i = 0; i < numbers.size(); ++i)
        vec.push_back(to_string(numbers[i]));
    sort(vec.begin(), vec.end(), cmp);
    for (int i = 0; i < vec.size(); ++i)
        answer += vec[i];
    for (int i = 0; i < vec.size(); ++i)
        str += "0";
    if (str == answer)
        answer = "0";
         
    return answer;
}
