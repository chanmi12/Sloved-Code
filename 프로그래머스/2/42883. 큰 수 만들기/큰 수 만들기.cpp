#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string number, int k) {
    string answer = "";
    int select = 0;
    int ans_i = 0;
    int len_i = number.length() - k; 
    
    while (answer.length() < len_i) {
        answer += "/";
        for (int i = select; i <= k; i++) {
            if (answer[ans_i] < number[i]) {
                answer[ans_i] = number[i];
                select = i + 1; 
            }
        }
        k++;
        ans_i++;
    }
    
    return answer;
}