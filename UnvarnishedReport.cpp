#include <bits/stdc++.h>
using namespace std;

int main() {
    string S;
    string T;

    cin >> S >> T;
    // bool incorrect = false;

    int length;
    if (S.length() > T.length()) {
        length = T.length();
    } else {
        length = S.length();
    }

    int wrongIndex = 0;

    for (int i = 0; i < length; i++) {
        if (S.at(i) != T.at(i))
        {
            wrongIndex = i + 1;
            break;
        }
    }

    if (S.length() > length || T.length() > length) {
        wrongIndex = length + 1;
    }

    cout << wrongIndex << endl;
}