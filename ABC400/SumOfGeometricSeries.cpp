#include <bits/stdc++.h>
using namespace std;

int main() {
    long N, M;
    cin >> N >> M;
    long limit = pow(10, 9);
    long X = 0;
    for (int i = 0; i <= M; i++) {
        X += pow(N, i);
        if (X > limit) {
            cout << "inf" << endl;
            return 0;
        }
    }
    cout << X << endl;
    return 0;
}