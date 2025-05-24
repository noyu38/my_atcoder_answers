#include <bits/stdc++.h>
using namespace std;

int main()
{
    string S;
    cin >> S;
    if (S.substr(S.length() - 3) == "san")
    {
        cout << "Yes";
    }
    else
    {
        cout << "No";
    }
}