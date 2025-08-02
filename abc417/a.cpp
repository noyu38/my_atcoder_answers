#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int a, b;
    cin >> a >> b;
    string s;
    cin >> s;

    string subS = s.substr(a, n - a - b);
    cout << subS << endl;
}