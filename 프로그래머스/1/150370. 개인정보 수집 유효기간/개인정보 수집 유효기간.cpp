#include <iostream>
#include <string>
#include <vector>
#include <map>
#include <sstream>
 
using namespace std;
 
map<char, int> m;
 
int dateStringToInt(string str) {
    int year = stoi(str.substr(0, 4));
    int month = stoi(str.substr(5, 2));
    int day = stoi(str.substr(8));
    return (28 * 12 * year) + (28 * (month - 1)) + day;
}
 
int calcDate(int d, int num) {
    return d + (28 * num) - 1;
}
 
vector<int> solution(string today, vector<string> terms, vector<string> privacies) {
    vector<int> answer;
 
    int td = dateStringToInt(today);
 
    for (string& t : terms) {
        istringstream iss(t);
        char cmd;
        int num;
        iss >> cmd >> num;
        m[cmd] = num;
    }
 
    for (int i = 0; i < privacies.size(); i++) {
        istringstream iss(privacies[i]);
        string s;
        char cmd;
        iss >> s >> cmd;
 
        int d = dateStringToInt(s);
        int expired = calcDate(d, m[cmd]);
        if (expired < td) answer.push_back(i + 1);
    }
 
    return answer;
}
 