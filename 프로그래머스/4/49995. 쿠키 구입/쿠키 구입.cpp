#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int sum[2001];
int solution(vector<int> cookie) {
    int answer = 0;
    for (int i = 0; i < cookie.size(); ++i)
        sum[i+1] = sum[i] + cookie[i];
    for(int j = 1; j < cookie.size(); ++j) {
        int c = sum[j];
        for(int x = j+1; x <= cookie.size(); ++x) {
            int y = sum[x] - c;
            if(answer >= y || y > c) continue;
            for(int l = 0; l < j; ++l)
                if(y == c - sum[l]) {
                    answer = max(answer, y);
                    break;
                }
        }
    }
    return answer;
}