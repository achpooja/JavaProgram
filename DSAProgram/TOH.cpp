#include<iostream>
using namespace std;

int TOH(int n,char source,char temp,char des)
{
    if(n==1)
    {
        cout<<"Move disk "<<n<<" "<<source<<" to "<<des<<endl;
    
    return 0;
    }
   TOH(n-1,source,des,temp);
   cout<<"Move disk "<<n<<" "<<source<<" to "<<des<<endl;
   TOH(n-1,temp,source,des);
}

int main()
{
 TOH(3,'A','C','B');
 return 0;
}