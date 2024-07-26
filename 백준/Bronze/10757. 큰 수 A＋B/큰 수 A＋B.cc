#include <algorithm>
#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    string num1, num2;
    cin >> num1 >> num2;

    int maxLen = max(num1.size(), num2.size());
    vector<int> result;
    bool jud = false;
    int i, sum;

    for (i = 0; i < maxLen; ++i) {
        sum = jud;
        jud = false;

        if (i < num1.size()) sum += num1[num1.size() - i - 1] - '0';
        if (i < num2.size()) sum += num2[num2.size() - i - 1] - '0';

        if (sum >= 10) {
            jud = true;
            sum -= 10;
        }

        result.insert(result.begin(), sum); 
    }

    if (jud) result.insert(result.begin(), 1);

    for (int i = 0; i < result.size(); ++i) cout << result[i];
}
