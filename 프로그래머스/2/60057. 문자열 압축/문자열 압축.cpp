#include <string>
#include <vector>
using namespace std;
 
int solution(string s) {
    int len = s.size();
    int answer = len;
 
    int n = len / 2;
 
 
    for (int i = 1; i <= n; i++) {
 
        string result = "";
 
        string str = s.substr(0, i);
 
        int cnt = 1;
 
        for (int j = i; j <= len; j += i) {
            if (str == s.substr(j, i)) {
                cnt += 1;
            }
            else {
                if (cnt == 1) {
                    result += str;
                }
                else {
                    result += (to_string(cnt) + str);
                }
 
                str = s.substr(j, i);
                cnt = 1;
            }
 
        }
 
        if ((len%i) != 0) {
            result += s.substr((len / i)*i);
        }
 
        if (answer > result.size()) answer = result.size();
    }
 
 
    return answer;
}
