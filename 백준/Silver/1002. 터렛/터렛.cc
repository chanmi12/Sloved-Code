#include <iostream>

using namespace std;

int main() {
	int a;
	int x1, y1, z1, x2, y2, z2;
	int d, c1, c2;
	cin >> a;

	for (int i = 0; i < a; i++) {
		cin >> x1 >> y1 >> z1 >> x2 >> y2 >> z2;
		d = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		c1 = (z1 - z2) * (z1 - z2);
		c2 = (z1 + z2) * (z1 + z2);

		if (d == 0) {
			if (c1 == 0)
				cout << "-1" << '\n';
			else
				cout << "0" << '\n';
		}
		else if (d == c1 || d == c2)
			cout << "1" << '\n';
		else if (c1 < d && d < c2)
			cout << "2" << '\n';
		else
			cout << "0" << '\n';
	}
}