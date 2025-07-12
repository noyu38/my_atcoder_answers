#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;
    vector<int> a(n);
    vector<int> b(m);

    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    for (int i = 0; i < m; i++) {
        cin >> b[i];
    }
    int result = 0;
    for (int i = 0; i < m; i++) {
        result += a[b[i] - 1];
    }
    cout << result << endl;
    return 0;
}