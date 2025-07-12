#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
    int N;
    cin >> N;
    vector<ll> A;
    for (int i = 0; i < N; i++) {
        int tmp;
        cin >> tmp;
        A.push_back(tmp);
    }
    vector<ll> s(N + 1, 0);
    for (int i = 0; i < N; i++) {
        s[i + 1] = s[i] + A[i];
    }
    ll sum = 0;
    for (int k = 1; k <= N; k++) {
        for (int i = 0; i <= N - k; i++) {
            ll tmp = s[i + k] - s[i];
            if (tmp > sum) {
                sum = tmp;
            }
        }
        cout << sum << endl;
    }

}