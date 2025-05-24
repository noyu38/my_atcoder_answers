#include <bits/stdc++.h>
using namespace std;

bool isPrime(int x)
{
    if (x == 2)
        return true;

    if (x < 2 || x % 2 == 0)
        return false;

    int i = 3;
    while (i <= sqrt(x))
    {
        if (x % i == 0)
            return false;

        i = i + 2;
    }
    return true;
}

int main()
{
    int n;
    cin >> n;

    vector<int> num(n);
    int count = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> num[i];
        if (isPrime(num[i]))
            count++;
    }
    cout << count << endl;
    return 0;
}
