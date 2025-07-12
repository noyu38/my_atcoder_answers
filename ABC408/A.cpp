#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, S;
    cin >> N >> S;
    vector<int> T;
    for (int i = 0; i < N; i++) {
        int tmp;
        cin >> tmp;
        T.push_back(tmp);
    }

    if (T[0] > S) {
        cout << "No" << endl;
        return 0;
    }
    for (int i = 0; i < N - 1; i++) {
        if (T[i + 1] - T[i] > S) {
            cout << "No" << endl;
            return 0;
        }
    }

    cout << "Yes" << endl;
    return 0;

}