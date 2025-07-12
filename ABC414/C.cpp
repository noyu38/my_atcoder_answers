#include <bits/stdc++.h>
using namespace std;
using ll = long long;

int main() {
    ll a, n;
    cin >> a >> n;
    ll ans = 0;
    for (ll i = 1; true; i++) {
        // 奇数桁の回文
        string si = to_string(i);
        string tempS = si;
        tempS.pop_back();
        reverse(tempS.begin(), tempS.end());
        ll result = stoll(si + tempS);
        cout << result << endl;
        if (result > n) {
            break;
        }
        string str = "";
        ll temp = result;
        while (temp) {
            str.push_back('0' + result % a);
            temp /= a;
        }
        string reverseStr = str;
        reverse(str.begin(), str.end());
        if (reverseStr != str) {
            continue;
        }
        ans += i;
    }
    for (ll i = 1; true; i++) {
        // 偶数桁の回文
        string si = to_string(i);
        string tempS = si;
        reverse(tempS.begin(), tempS.end());
        ll result = stoll(si + tempS);
        cout << result << endl;
        if (result > n) {
            break;
        }
        string str = "";
        ll temp = result;
        while (temp) {
            str.push_back('0' + result % a);
            temp /= a;
        }
        string reverseStr = str;
        reverse(str.begin(), str.end());
        if (reverseStr != str) {
            continue;
        }
        ans += i;
    }
    cout << ans << endl;
    return 0;
}