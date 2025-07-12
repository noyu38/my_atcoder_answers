#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, l, r;
    cin >> n >> l >> r;
    vector<int> x(n);
    vector<int> y(n);
    int count = 0;
    for (int i = 0; i < n; i++) {
        cin >> x[i] >> y[i];
        if (x[i] <= l && y[i] >= r) {
            count++;
        }
    }
    cout << count << endl;

}