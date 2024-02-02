#include<iostream>
using namespace std;
// typedef struct node{
// int num;
// struct node* next;
// }*StNode;
struct node{
    int num;
    struct node* next;
}*stNode;

void createNode(int n)
{
    struct node *temp,*fNode;
    int num;
    stNode=(struct node*)malloc(sizeof(struct node));
    if(stNode==NULL)
    {
        cout<<"Empty List"<<endl;
    }
    else{
        cout<<"Enter the element for first Node"<<endl;
        cin>>num;
        stNode->num=num;
        stNode->next=NULL;
        temp=stNode;
        for(int i=2;i<=n;i++){
        fNode=(struct node *)malloc(sizeof(struct node));
        cout<<"Enter the element for node"<<endl;
        cin>> num;
        fNode->num=num;
        fNode->next=NULL;
        temp->next=fNode;
        temp=temp->next;
        }
    }
}
void display()
{
    struct node *p;
    p=stNode;
    while(p->next!=NULL)
    {
        cout<<p->num<<"-->";
        p=p->next;
    }
    cout<<"Null"<<endl;
}
int main()
{
    int num;
    cout<<"Enter the no. of node"<<endl;
    cin>>num;
    createNode(num);
    display();
    return 0;
}