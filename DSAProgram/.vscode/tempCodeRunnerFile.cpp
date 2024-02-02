
#include<iostream>
using namespace std;

void insert(int arr[],int n,int pos,int ele)
{
    for(int i=n-1;i>=pos;i--)
    {
        arr[i+1]=arr[i];
        arr[i]=ele;
    }
}
void remove(int arr[],int n,int pos)
{ 
for(int i=pos-1;i<n-1;i++)
{
    arr[i]=arr[i+1];
    
}
}
int main()
{
    int arr[100],n,pos,ele,dpos;
    cout<<"Enter the size of the array:"<<endl;
    cin>>n;
    cout<<"Enter the elements:"<<endl;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }
    
    cout<<"\nEnter the position to insert:"<<endl;
    cin>>pos;
    cout<<"Enter the element to be inserted:"<<endl;
    cin>>ele;
    cout<<"Before Insertion: "<<endl;
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
     cout<<endl;

     insert(arr,n,pos,ele);
     n++;
     cout<<"After Insertion: "<<endl;
     for(int i=0;i<n;i++)
     {
         cout<<arr[i]<<" ";
        
     }
     cout<<endl;
     cout<<"Enter the position to delete: "<<endl;
     cin>>dpos;
    
     remove(arr,n,dpos);
     cout<<"\nAfter Deletion: "<<endl;
     for(int i=0;i<n-1;i++)
     {
         cout<<arr[i]<<" ";
     }
     
    return 0;

}