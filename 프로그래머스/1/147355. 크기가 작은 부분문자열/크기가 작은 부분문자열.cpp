#include <string>
#include <vector>

using namespace std;

int solution(string t, string p) {
    int answer = 0;
    string tmp;
    
    for (int i = 0 ; i <= t.length()-p.length(); i++)
    {
        for(int j = 0; j <p.length(); j++ )
        {
            tmp += t[i+j];
        }
        if ( stoll(tmp) <= stoll(p) )
                answer++;
        tmp = "";
    }
    
    return answer;
}