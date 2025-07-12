#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
    int n, q;
    cin >> n >> q;
    vector<int> a(n);
    vector<ll> s(n + 1, 0);
    vector<int> l(q);
    vector<int> r(q);

    for (int i = 0; i < n; i++) {
        cin >> a[i];
        s[i + 1] = s[i] + a[i];
    }
    
    for (int i = 0; i < q; i++) {
        cin >> l[i] >> r[i];
    }
    for (int i = 0; i < q; i++) {
        cout << s[r[i]] - s[l[i] - 1] << endl;
    }
    return 0;
}