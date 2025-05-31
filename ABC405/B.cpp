#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    vector<int> A;
    for (int i = 0; i < N; i++) {
        int tmp;
        cin >> tmp;
        A.push_back(tmp);
    }
    bool isContain = true;
    int count = 0;
    while (true) {
        for (int i = 1; i <= M; i++) {
            auto ite = find(A.begin(), A.end(), i);

            // iが含まれていない
            if (ite == A.end()) {
                isContain = false;
                break;
            }
        }
        if (!isContain) {
            break;
        }
        A.pop_back();
        count++;
    }
    cout << count << endl;
}