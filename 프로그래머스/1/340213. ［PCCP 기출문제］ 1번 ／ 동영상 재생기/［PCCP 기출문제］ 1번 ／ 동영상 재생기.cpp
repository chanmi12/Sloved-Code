#include <string>
#include <vector>
#include <sstream>
#include <iomanip>
using namespace std;

int timeToSec(const string& timeStr) {
    int mm = stoi(timeStr.substr(0, 2));
    int ss = stoi(timeStr.substr(3, 2));
    return mm * 60 + ss;
}

string secToTime(int seconds) {
    int mm = seconds / 60;
    int ss = seconds % 60;
    ostringstream oss;
    oss << setw(2) << setfill('0') << mm << ":" << setw(2) << setfill('0') << ss;
    return oss.str();
}

string solution(string video_len, string pos, string op_start, string op_end, vector<string> commands) {
    int videoTime = timeToSec(video_len);
    int cur = timeToSec(pos);
    int opStart = timeToSec(op_start);
    int opEnd = timeToSec(op_end);

    if (opStart <= cur && cur <= opEnd) {
        cur = opEnd;
    }

    for (const string& cmd : commands) {
        if (cmd == "prev") {
            cur = max(0, cur - 10);
        } else if (cmd == "next") {
            cur = min(videoTime, cur + 10);
        }

        if (opStart <= cur && cur <= opEnd) {
            cur = opEnd;
        }
    }

    return secToTime(cur);
}
