#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;
    vector<int> a(s.size());
    bool result = true;

    if (s.size() == 1) {
        cout << "Yes" << endl;
        return 0;
    }

    for (int i = 0; i < s.size(); i++) {
        a[i] = s.at(i) - '0';
    }
    for (int i = 0; i < s.size() - 1; i++) {
        if (a[i] <= a[i + 1])
            result = false;
    }
    if (result) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }
}