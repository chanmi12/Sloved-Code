#include <string>
#include <vector>

using namespace std;
int answer = 0;

void fun1(vector<int>& number, int sum, int a, int b)
{
    if(a == 3)
    {
        if(sum == 0)
        {
            answer++;
        }
        return;
    }
    
    for(int i = b; i < number.size(); i++)
    {
        fun1(number, sum + number[i], a + 1, i + 1);
    }
}

int solution(vector<int> number) {
    
    for(int i = 0; i < number.size(); i++)
    {
        fun1(number, number[i], 1, i + 1);
    }
    return answer;
}