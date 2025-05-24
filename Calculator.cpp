#include <bits/stdc++.h>
using namespace std;

int main()
{
    string S;
    cin >> S;
    int count = 0;

    int pointer = 0;
    while (pointer < S.length())
    {
        if (S.at(pointer) == 0 && pointer + 1 < S.length())
        {
            if (S.at(pointer + 1) == 0)
            {
                count++;
                pointer++;
            }
            else
            {
                count++;
            }
        }
        else
        {
            count++;
        }
        pointer++;
    }

    cout << count << endl;
    return 0;
}