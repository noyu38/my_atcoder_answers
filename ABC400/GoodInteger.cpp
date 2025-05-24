#include <bits/stdc++.h>
using namespace std;

int main()
{
    long N;
    cin >> N;
    long a = 2;
    long b = 1;
    // int count = 0;
    set<int> s;

    while (a <= N) {
        b = 1;
        // if (a > N) {
        //     break;
        // }
        while (N / (b * b) >= a) {
            // if (N / (b * b) < a)
            // {
            //     break;
            // }
            s.insert(a * b * b);
            b++;
        }
        a *= 2;
    }

    cout << s.size() << endl;
    return 0;
}