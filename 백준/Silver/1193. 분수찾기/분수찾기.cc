#include <iostream>
using namespace std;

int main() {
    int i, j, k, n;
    int num, dnum;

    cin >> n;

    for (k = 1;; ++k) {
        if ((k) * (k + 1) / 2 >= n && n > (k - 1) * (k) / 2) {
            break;
        }
    }

    if (k % 2 == 0) {
        num = n - ((k - 1) * (k) / 2);
        dnum = ((k) * (k + 1) / 2) - n + 1;
    } else {
        num = ((k) * (k + 1) / 2) - n + 1;
        dnum = n - ((k - 1) * (k) / 2);
    }

    cout << num << "/" << dnum << endl;

    return 0;
}
