#include<iostream>
using namespace std;
#define max 4

class Queue
{
    int rear=-1,front=-1,q[max];

    public:
    void enqueue()
    { int element;
        if(rear==max-1)
        {
            cout<<"Queue is full"<<endl;
        }
        else{
            if(front==-1)
            front++;
            cout<<"Enter element to enqueue"<<endl;
            cin>>element;
            rear++;
            q[rear]=element;

        }
    }

    void dequeue()
    {
        if(front==-1 || front>rear)
        {
            cout<<"Queue is empty"<<endl;
        }
        else{
            cout<<q[front]<<"is dequeued"<<endl;
            front++;
        }


    }
    void display()
    {
        if(front==-1 || front>rear)
        {
            cout<<"Queue is empty"<<endl;
        }
        else{
            cout<<"element in the queue"<<endl;
            for (int i=front; i<=rear;i++)
            {
            cout<<q[i]<<endl;
            }
        }
    }


};
int main()
{
    Queue q;
    int ch;
    do{
        cout<<"1.Emqueue\n2.Dequeue\n3.Display\n4.Exit"<<endl;
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
            break ;
            case 4:
            exit(0);
        }
    }
    while(ch!=4);
    return 0;
}