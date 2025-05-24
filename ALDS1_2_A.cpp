#include <bits/stdc++.h>
using namespace std;

int main()
{
    int N;
    cin >> N;
    vector<int> A(N);

    for (int i = 0; i < N; i++)
    {
        cin >> A[i];
    }

    bool flag = 1;
    int count = 0;
    while (flag)
    {
        flag = 0;
        for (int i = N - 1; i >= 1; i--)
        {
            if (A[i] < A[i - 1])
            {
                swap(A[i], A[i - 1]);
                flag = 1;
                count++;
            }
        }
    }

    for (int i = 0; i < N; i++)
    {
        if (i != 0)
            cout << " ";
        cout << A[i];
    }
    cout << endl << count << endl;
}