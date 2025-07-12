#include <bits/stdc++.h>
using namespace std;

int main() {
    int d, n;
    cin >> d >> n;
    vector<int> l(n);
    vector<int> r(n);

    for (int i = 0; i < n; i++) {
        cin >> l[i] >> r[i];
    }
    // いもす法を使ってみる
    vector<int> imosu(d, 0);
    for (int i = 0; i < n; i++) {
        imosu[l[i] - 1] += 1;
        if (r[i] < d) {
            imosu[r[i]] -= 1;
        }
    }

    vector<int> result(d, 0);
    result[0] = imosu[0];
    for (int i = 1; i < d; i++) {
        result[i] = result[i - 1] + imosu[i];
    }
    for (int i = 0; i < d; i++) {
        cout << result[i] << endl;
    }
    return 0;
    // for (int i = 0; i < n; i++) {
    //     for (int j = l[i] - 1; j < r[i]; j++) {
    //         imosu[j]++;
    //     }
    // }

    // for (int i = 0; i < d; i++) {
    //     cout << imosu[i] << endl;
    // }
}