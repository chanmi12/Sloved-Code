#include <iostream>
#include <string>
#include <stack>
using namespace std;
 
 
int main()
{
    int count;
    cin >> count;
    stack<int> stack; 
    string str; 
    int num;
    while (count--) 
    {
        cin >> str;
        if (str == "push") 
        {
            cin >> num;
            stack.push(num);
        }
        else if (str == "top") 
        {
            if (stack.empty() == 1)
            {
                cout << -1 << endl;
            }
            else 
            {
                cout << stack.top() << endl;
            }
        }
        else if (str == "size")
        {
            cout << stack.size() << endl;
        }
        else if (str == "empty")
        {
            if (stack.empty() == 1)
            {
                cout << 1 << endl;
            }
            else
            {
                cout << 0 << endl;
            }
        }
        else if (str == "pop")
        {
            if (stack.empty() == 1)
            {
                cout << -1 << endl;
            }
            else
            {
                cout << stack.top() << endl;
                stack.pop();
            }
        }
    }
}
