#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<string> S(N);
    set<string> set;
    for (int i = 0; i < N; i++) {
        cin >> S[i];
    }
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            if (j != i) {
                string sum = S[i] + S[j];
                set.insert(sum);
            }
        }
    }
    int result = set.size();
    cout << result << endl;
}