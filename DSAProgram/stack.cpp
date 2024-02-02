#include<iostream>
#include<stdlib.h>

using namespace std;

#define size 4

class Stak
{
    int tos=-1 ,stack[size];
    public:

    // Stak()
    // {
    //     tos=-1;
    // }
    
    void push()
    {
        int item;
        // cout<<"Enter the element to push"<<endl;
        // cin>>item;
     if(tos==size-1)
    {
        cout<<"Stack is full"<<endl;
    }
 
    else{
     cout<<"Enter the element to push"<<endl;
        cin>>item;
        tos++;
        stack[tos]=item;
    }
    }

    int pop()

    { 
        int item;
        if(tos==-1)
        {
            cout<<"Stack is Empty"<<endl;
        }
        
        
            item=stack[tos];
            tos--;
        cout<<"the element that was popped:"<<endl<<item<<endl;
    }

    void display()
    {
        if(tos==-1)
        {
            cout<<"Stack is Empty"<<endl;
        }
    
        else{
        cout<<"Elements in the stack are:"<<endl;
        for(int i=0; i<=tos; i++)
        {
        cout<<stack[i]<<endl;
        }
        }
    }
};   

    int main()
    {
      Stak s;
      int ch;
      do
      {
      cout<<"\n1.PUSH\n2.POP\n3.DISPLAY\n4.EXIT"<<endl;
      cout<<"Enter your choice"<<endl;
      cin >> ch;

      switch(ch)
      {
        case 1:
        s.push();
        break;
        case 2:
        s.pop();
        break;
        case 3:
        s.display();
        break;
        case 4:
        exit(0);
        
      }
      

      } while (ch != 4);
      return 0;
      
    }
