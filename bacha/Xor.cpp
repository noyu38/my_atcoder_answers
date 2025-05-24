#include <bits/stdc++.h>
using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    vector<int> A(N);
    vector<int> B(M);
    int limit = (N <= M) ? M : N;
    set<int> ans;


    for (int i = 0; i < N; i++) {
        cin >> A[i];
    }
    for (int i = 0; i < M; i++) {
        cin >> B[i];
    }
    for (int i = 0; i < limit; i++) {
        if (i >= N) {
            ans.insert(B[i]);
        } else if (i >= M) {
            ans.insert(A[i]);
        } else if (A[i] != B[i]) {
            ans.insert(A[i]);
            ans.insert(B[i]);
        }
    }
    for (auto it = ans.begin(); it != ans.end(); ++it) {
        cout << *it << " ";
    }
    cout << endl;
}
