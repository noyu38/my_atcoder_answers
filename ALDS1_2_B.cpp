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

    int minj;
    int count = 0;
    bool toSwap = 0;
    for (int i = 0; i < N; i++)
    {
        toSwap = 0;
        minj = i;
        for (int j = i; j < N; j++)
        {
            if (A[j] < A[minj])
            {
                minj = j;
                toSwap = 1;
            }
        }
        if (toSwap)
        {
            swap(A[i], A[minj]);
            count++;
        }
    }

    for (int i = 0; i < N; i++)
    {
        if (i != 0)
            cout << " ";

        cout << A[i];
    }
    cout << endl
         << count << endl;
}