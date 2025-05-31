#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> A;
    long tmpSum = 0;
    for (int i = 0; i < N; i++) {
        int tmp;
        cin >> tmp;
        A.push_back(tmp);
        if (i >= 1) {
            tmpSum += A.at(i);
        }
    }

    long result = 0;
    for (int i = 0; i < N - 1; i++) {
        result += A[i] * tmpSum;
        tmpSum -= A[i + 1];
    }

    cout << result << endl;
}