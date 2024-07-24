#include <string>
#include <vector>
using namespace std;

bool solution(int x) {
    bool answer = true;
    int sum = 0;
    int init = x;	
    
    while(x > 0){
        sum += x % 10;
        x = x / 10;
    }
    
    if(init % sum == 0){
        answer = true;
    }
    else
        answer = false;
    return answer;
}
