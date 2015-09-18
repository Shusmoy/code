#include<iostream>
using namespace std;
int main()
{
    long long int n,d,i,j,num,c=0;
    cin>>n;
    cin>>d;
    long long int a[n];
    for(i=0;i<n;i++)
        cin>>a[i];
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                num=a[i]-a[j];
                if(num<=d)
                    c=c+2;
            }
            else
            {
                num=a[j]-a[i];
                if(num<=d)
                    c=c+2;
            }
        }
    }
    cout<<c;
    return 0;
}
