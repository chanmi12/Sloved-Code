#include <iostream>

using namespace std;

int main(){	
	int n;
	int cnt = 0;
	string str;
	cin >> n;

	for(int i=0; i<n; i++){
		cin >> str;
		int size = str.length();
		bool jud = true;
		
		for(int j=0; j<size; j++){
			for(int k=0; k<j; k++){
				if(str[j] != str[j-1] && str[j] == str[k]){
					jud = false;
					break;			
				}				
			}
		}
		if(jud) cnt++;
	}
	
	cout << cnt;

    return 0;
}
