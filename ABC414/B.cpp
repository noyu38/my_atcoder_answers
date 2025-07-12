#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
    int n;
    cin >> n;
    vector<string> c(n);
    vector<ll> l(n);
    string s = "";
    for (int i = 0; i < n; i++) {
        cin >> c[i] >> l[i];
    }
    for (int i = 0; i < n; i++) {
        if (l[i] > 100) {
            cout << "Too Long" << endl;
            return 0;
        }
        for (int j = 0; j < l[i]; j++) {
            s += c[i];
        }
        if (s.length() > 100) {
            cout << "Too Long" << endl;
            return 0;
        }
    }
    cout << s << endl;
    return 0;
}