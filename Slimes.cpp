#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
    ll A, B, K;
    cin >> A >> B >> K;
    int count = 0;
    while (A < B) {
        A *= K;
        count++;
    }
    cout << count << endl;
}