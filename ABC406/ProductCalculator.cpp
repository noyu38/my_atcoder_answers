#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, K;
    cin >> N >> K;
    long a;
    long pow = 1;
    for (long i = 0; i < (long)K; i++) {
        pow *= 10;
    }

    long limit = pow - 1;
    long result = 1;

    for (int i = 0; i < N; i++) {
        cin >> a;
        if (result > (limit / a)) {
            result = 1;
        } else {
            result *= a;
        }
    }

    cout << result << endl;
}