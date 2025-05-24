#include <bits/stdc++.h>
using namespace std;

int main()
{
    set<int> card;
    for (int i = 0; i < 4; i++)
    {
        int tmp;
        cin >> tmp;
        card.insert(tmp);
    }
    if (card.size() == 2)
    {
        cout << "Yes" << endl;
    } else
    {
        cout << "No" << endl;
    }
}