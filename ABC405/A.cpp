#include <bits/stdc++.h>
using namespace std;

int main() {
    int R, X;
    cin >> R >> X;

    if (((1600 <= R && R <= 2999) && X == 1) || ((1200 <= R && R <= 2399) && X == 2)) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }
}