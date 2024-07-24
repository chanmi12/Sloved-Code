#include <string>
#include <vector>

using namespace std;

vector<int> solution(int k, vector<int> score) {
  vector<int> answer;
	vector<int> change;

	for (int i = 0; i < k; i++)
		change.push_back(-1);
	
	for (int i = 0; i < score.size(); i++)
	{
		int t = score[i];
		int min = 9999;
		for (int j = 0; j < change.size(); j++)
		{
			if (change[j] < t)
			{
				int temp = change[j];
				change[j] = t;
				t = temp;
			}

			if (change[j] > -1 && min > change[j])
				min = change[j];
		}

		answer.push_back(min);
	}

	return answer;
}