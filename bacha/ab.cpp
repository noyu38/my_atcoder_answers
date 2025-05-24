#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    string s;
    cin >> N >> s;
    bool result = false;

    for (int i = 0; i < N - 1; i++) {
        if ((s[i] == 'a' && s[i + 1] == 'b') || (s[i] == 'b' && s[i + 1] == 'a')) {
            result = true;
        }
    }

    if (result) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }
}