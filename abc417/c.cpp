#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
    ll n;
    cin >> n;
    vector<ll> a(n + 1);
    unordered_map<ll, ll> b;
    ll result = 0;
    for (ll i = 1; i <= n; i++) {
        cin >> a[i];
        b[i + a[i]]++;
    }
    for (ll j = 1; j <= n; j++) {
        if (b.find(j - a[j]) != b.end()) {
            result += b[j - a[j]];
        }
    }

    cout << result << endl;
    return 0;
}