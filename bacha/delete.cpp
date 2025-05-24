#include <bits/stdc++.h>
using namespace std;

int main() {
    string S;
    cin >> S;
    string T = "";
    for (char c : S) {
        if (c != '.') {
            T += c;
        }
    }
    cout << T << endl;
}