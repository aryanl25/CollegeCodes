#include <iostream>
using namespace std;

int main()
{   
    int n,i,j,k;
    cout<<"Enter no. of rows for the palindromic sequence pyramid ";
    cin>>n;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n-i;j++)
        {
            cout<<"  ";
        }
        for(k=i;k>=1;k--)
        {
            cout<<k<<" ";
        }
        for(k=2;k<=i;k++)
        {
            cout<<k<<" ";
        }
        cout<<endl;

    }


    return 0;
}
