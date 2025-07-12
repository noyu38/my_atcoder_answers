#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;
    set<int> A;

    for (int i = 0; i < N; i++) {
        int unko;
        cin >> unko;
        A.insert(unko);
    }
    int count = 0;
    for (int x : A) {
        count++;
    }
    bool first = true;
    for (const auto& element : A) {
        if (!first) {
            cout << " ";
        } else {
            cout << count << endl;
        }
        cout << element;
        first = false;
    }

    cout << endl;
}