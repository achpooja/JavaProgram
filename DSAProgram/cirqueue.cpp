#include<iostream>
#include<stdlib.h>

using namespace std;

#define max 4

class CQueue
{
    int rear,front,c[max];

    public:
    CQueue()
      {
        rear=-1;
        front=-1;
      }
      void enqueue()
      {
        int item;
        cout<<"Enter element"<<endl;
        cin>>item;

        
        // if (rear==-1 && front==-1){
        //       front=0;
        //       rear=0;
        //       c[rear]=item;
        //    }
        // else
        //  if((rear+1)%max==front)
        // { 
        //   cout<<"Queue is full"<<endl;
        // }
        // else
        // {
          
        //        rear=(rear+1)%max;
        //         c[rear]=item;
        // }

        if((front==0 && rear==max-1)||
            (rear==(front-1)%(max-1)))
            {
              cout<<"Queue is full"<<endl;
            }
            else if(front==-1)
            {
              front=rear=0;
              c[rear]=item;
            }
            else if(rear==max-1 && front!=0)
            {
              rear=0;
              c[rear]=item;
            }
            else
            {
              rear=rear+1;
              c[rear]=item;
            }
        
      }

      void dequeue()
      {
       
        // if((rear==-1)&&(front==-1))
        // {
        //     cout<<"Queue is empty"<<endl;
        // }
        // else if(front==rear){
        //    int item=c[front];
        //         rear=-1;
        //         front=-1;
        //     }
        //   else{
        //         int item=c[front];
        //         front=(front+1)%max;
        //     }

        if(front==-1)
         {
          cout<<"Queue is empty"<<endl;
         }
         int item=c[front];
         c[front]=-1;
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
         cout<<item<<"is enqueued"<<endl;

      }

      void display()
      {
        
      //   if(front==-1 && rear==-1)
      //   {
      //     cout<<"Queue is empty"<<endl;
      //   }
      //   else{
      //   cout<<"The queue is: "<<endl;
      //   for(int i=front;i<=rear;(i+1)%max)
      //   {
      //       cout<<c[i]<<endl;
      //   }

       
      // }

      if(front==-1)
      {
        cout<<"Queue is Empty"<<endl;
        return;
      }
      cout<<"Elements in the Circular queue are:"<<endl;
      if(rear>=front)
      {
        for(int i=front;i<=rear;i++)
        cout<<c[i]<<endl;
      }
      else{
        for(int i=front;i<max;i++)
        cout<<c[i]<<endl;
        for(int i=0;i<=rear;i++)
        cout<<c[i]<<endl;
      }
      }

};
     int main()
      {
        CQueue q;
        int ch;
        do
        {
            cout<<"\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit"<<endl;
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
           
        } while (ch!=4);
        return 0;
      }

