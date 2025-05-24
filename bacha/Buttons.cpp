#include <bits/stdc++.h>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;

    if (a > b && a + (a - 1) >= a + b) {
        cout << a + (a - 1) << endl;
        return 0;
    } else if (a > b && a + (a - 1) < a + b) {
        cout << a + b << endl;
        return 0;
    } else if (a < b && b + (b - 1) >= a + b) {
        cout << b + (b - 1) << endl;
        return 0;
    } else if (a < b && b + (b - 1) < a + b) {
        cout << a + b << endl;
        return 0;
    } else {
        cout << a + b << endl;
        return 0;
    }
}