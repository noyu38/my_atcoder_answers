#include <bits/stdc++.h>
using namespace std;

int main() {
    char X;
    cin >> X;
    string s;
    cin >> s;
    string ans = "";

    for (char c : s) {
        if (c != X) {
            ans += c;
        }
    }

    cout << ans << endl;
}