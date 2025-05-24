#include <bits/stdc++.h>
using namespace std;

int main() {
    int X, Y;
    cin >> X >> Y;
    double count = 0;

    for (int a = 1; a <= 6; a++) {
        for (int b = 1; b <= 6; b++) {
            if (a + b >= X || abs(a - b) >= Y) {
                count = count + 1.0;
            }
        }
    }

    cout << fixed << setprecision(10) << count / 36.0 << endl;
}