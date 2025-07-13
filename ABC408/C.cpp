#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
    int n, m;
    cin >> n >> m;
    vector<int> l(m);
    vector<int> r(m);

    for (int i = 0; i < m; i++) {
        cin >> l[i] >> r[i];
    }
    vector<int> imosu(n, 0);
    for (int i = 0; i < m; i++) {
        imosu[l[i] - 1]++;
        if (r[i] < n) {
            imosu[r[i]]--;
        }
    }

    vector<ll> guardians(n, 0);
    guardians[0] = imosu[0];
    for (int i = 1; i < n; i++) {
        guardians[i] = guardians[i - 1] + imosu[i];
    }
    // for (int i = 0; i < n; i++) {
    //     cout << guardians[i] << endl;
    // }
    auto result = min_element(guardians.begin(), guardians.end());
    cout << *result << endl;

    return 0;
}