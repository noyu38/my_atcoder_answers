#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> a(N);
    vector<int> b(N);
    vector<int> c(N);

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < N; j++) {
            switch (i)
            {
            case 0:
                cin >> a[i];
                break;
            case 1:
                cin >> b[i];
                break;
            case 2:
                cin >> c[i];
                break;
            }
        }
    }

}