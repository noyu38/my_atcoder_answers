#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, m;
    cin >> n >> m;
    vector<int> a(n);
    vector<int> b(m);

    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    for (int i = 0; i < m; i++)
    {
        cin >> b[i];
    }
    for (int i = 0; i < m; i++)
    {
        auto it = find(a.begin(), a.end(), b[i]);
        if (it != a.end())
        {
            a.erase(it);
        }
    }

    if (a.size() != 0)
    {
        for (int i : a)
        {
            cout << i << " ";
        }
        cout << endl;
    }
    return 0;
}