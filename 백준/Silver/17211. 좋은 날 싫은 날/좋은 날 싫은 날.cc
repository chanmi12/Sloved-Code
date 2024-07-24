#include <iostream>
#include <vector>
#include <cmath>

using namespace std;

#define MAX_DAYS 105

int main() {
    int days, initialMood;
    cin >> days >> initialMood;
    
    double sunnyToSunny, sunnyToRainy, rainyToSunny, rainyToRainy;
    cin >> sunnyToSunny >> sunnyToRainy >> rainyToSunny >> rainyToRainy;
    
    vector<double> sunnyProbabilities(MAX_DAYS, 0);
    vector<double> rainyProbabilities(MAX_DAYS, 0);
    
    if (initialMood == 1) { 
        sunnyProbabilities[1] = rainyToSunny;
        rainyProbabilities[1] = rainyToRainy;
    } else { 
        sunnyProbabilities[1] = sunnyToSunny;
        rainyProbabilities[1] = sunnyToRainy;
    }
    
    for (int i = 2; i <= days; ++i) {
        sunnyProbabilities[i] = sunnyProbabilities[i - 1] * sunnyToSunny + rainyProbabilities[i - 1] * rainyToSunny;
        rainyProbabilities[i] = sunnyProbabilities[i - 1] * sunnyToRainy + rainyProbabilities[i - 1] * rainyToRainy;
    }
    
    double finalSunnyProbability = sunnyProbabilities[days] * 1000;
    double finalRainyProbability = rainyProbabilities[days] * 1000;
    
    cout << static_cast<int>(finalSunnyProbability + 0.5) << endl;
    cout << static_cast<int>(finalRainyProbability + 0.5) << endl;
    
    return 0;
}
