#include<iostream>
using namespace std;
#define max 4
class CirQue
{
int rear=-1,front=-1,q[max];
public :
void enqueue()
{
    int element;
    cout<<"Enter the element to enqueue: "<<endl;
    cin>>element;

    if((front==0  && rear==max-1) || (rear==(front-1)%(max-1)))
    {
        cout<<"Queue is full"<<endl;
    }
    else if(front==-1)
    {
        front=0;
        rear=0;
        q[rear]=element;
    }
    else if(rear==max-1 && front!=0)
    {
        rear=0;
        q[rear]=element;
    }
    else{
        rear++;
        q[rear]=element;
    }

}
void dequeue()
{
    if(front==-1)
    {
        cout<<"Queue is empty"<<endl;
    }
 
        int element=q[front];
        q[front]=-1;
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else if(front==max-1)
        {
            front=0;

        }
        else{
            front++;
        }
        cout<<element<<"is dequeued"<<endl;
    
}
void display()
{
    if(front==-1)
    {
        cout<<"Queue is empty"<<endl;
        return;
    }
    
        cout<<"Elements in the queue:"<<endl;
    if(rear>=front)
    {
        for(int i=front;i<=rear;i++)
        
            cout<<q[i]<<endl;
        
    }
    else{
        for(int i=front;i<max;i++)
        
            cout<<q[i]<<endl;
        
        for(int i=0;i<=rear;i++)
        
            cout<<q[i]<<endl;
        
    }
    
    }
};
int main()
{
    int ch ;
    CirQue q;
     do{
    cout<<"1.Enqueue\n2.Dequeue\n3.Display\n4.exit"<<endl;
    cout<<"Enter your choice"<<endl;
    cin>>ch;

    switch(ch)
    {
        case 1:
        q.enqueue();
        break;
        case 2:
        q.dequeue();
        break;
        case 3:
        q.display();
        break;
        case 4:
        exit(0);
    }
     }
     while(ch!=4);
     return 0;
}