#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;
    long long count = 0;

    // vector<int> a(s.length());
    vector<int> a;
    a.reserve(s.length());

    for (char c : s) {
        a.push_back(c - '0');
    }
    int x = 0;

    // for (int i = s.length() - 1; i >= 1; i--) {
    //     count += a[i];
    //     for (int j = i - 1; j >= 0; j--) {
    //         a[j] = (a[j] + 10 - a[i]) % 10;
    //     }
    // }

    for (int i = s.length() - 1; i >= 0; i--) {
        count += (a[i] + 10 - (x % 10)) % 10;
        x += (a[i] + 10 - (x % 10)) % 10;
    }

    // count += a[0];
    cout << count + s.length() << endl;
}