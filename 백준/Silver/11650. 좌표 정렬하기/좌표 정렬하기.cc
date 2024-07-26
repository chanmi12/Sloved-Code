#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct Point {	
	int x, y;
};

bool boolFunction(Point &a, Point &b) {	
	if (a.x < b.x) {
		return true;
	}
	else if (a.x == b.x) {
		return (a.y < b.y);
	}
	else 
		return false;
}

int main() {
	int n;
	cin >> n;
	vector <Point> p(n);
	for (int i=0; i<n; i++) {	
		cin >> p[i].x >> p[i].y;
	}
	sort(p.begin(), p.end(), boolFunction);	
	for (int i=0; i<p.size(); i++) {	
		cout << p[i].x << " " << p[i].y << '\n';
	}
	return 0;
}