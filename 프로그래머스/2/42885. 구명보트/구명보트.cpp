#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> people, int limit) {
    int answer = 0;
    int x = 0; 
    int y = people.size() - 1; 
    
    sort(people.rbegin(), people.rend());
    
    while(x <= y){
        if(people[x] + people[y] <= limit){
            x++;
            y--;
            answer++; 
        }
        else{
            x++; 
            answer++;
        }
    }
    return answer;
}
