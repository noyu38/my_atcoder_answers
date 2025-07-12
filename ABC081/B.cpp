#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> A;
    for (int i = 0; i < N; i++) {
        int tmp;
        cin >> tmp;
        A.push_back(tmp);
    }
    int count = 0;
    bool a = true;
    while (a) {
        for (int i = 0; i < N; i++) {
            if (A[i] % 2 == 0) {
                A[i] = A[i] / 2;
            } else {
                a = false;
                break;
            }
        }
        if (a) count++;
    }
    cout << count << endl;
}