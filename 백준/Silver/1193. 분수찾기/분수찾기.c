#include <stdio.h>

int main(void) {
    int i, j, k, n;
    int num, dnum;

    scanf("%d", &n);

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

    printf("%d/%d\n", num, dnum);

    return 0;
}
