#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
    int N, Q;
    cin >> N >> Q;
    vector<int> a(N);

    for (int i = 0; i < N; i++) {
        cin >> a[i];
    }
    vector<ll> s(N + 1, 0);
    for (int i = 0; i < N; i++) {
        s[i + 1] = s[i] + a[i];
    }
    vector<int> l(Q);
    vector<int> r(Q);
    for (int i = 0; i < Q; i++) {
        cin >> l[i];
        cin >> r[i];
    }
    for (int i = 0; i < Q; i++) {
        // printf("%d\n", l[i]);
        // printf("%lld, %lld\n", s[r[i]], s[l[i]]);
        cout << s[r[i]] - s[l[i] - 1] << endl;
    }
}