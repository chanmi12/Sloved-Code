#include <string>

using namespace std;

bool solution(string s) {

    if(s.size()!=4 && s.size()!=6){
        return false;
    }
    
    for(char c:s){
        if(isdigit(c)==false)
            return false;
    }
        
    return true;
}