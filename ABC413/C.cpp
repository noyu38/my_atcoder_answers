#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
    int Q;
    cin >> Q;
    queue<pair<ll, ll>> queue;

    for (int i = 0; i < Q; i++) {
        int type;
        cin >> type;
        if (type == 1) {
            ll c, x;
            cin >> c >> x;
            queue.emplace(c, x);
        } else {
            ll k;
            cin >> k;
            ll ans = 0;
            while (!queue.empty() && queue.front().first <= k) {
                ans += queue.front().first * queue.front().second;
                k -= queue.front().first;
                queue.pop();
            }
            if (k != 0) {
                queue.front().first -= k;
                ans += k * queue.front().second;
            }
            cout << ans << endl;
        }
    }
}