#include<iostream>
using namespace std;
#define max 4

class Stack
{
    int tos=-1,stk[max];
    public:
    void push()
    {
        int element;
        if(tos==max-1)
        {
            cout<<"Stack is full!"<<endl;
        }
        else{
            cout<<"Enter element to push:"<<endl;
            cin>>element;
            tos++;
            stk[tos]=element;

        }
    }

    void pop()
    {
        int element;
        if(tos==-1)
        {
            cout<<"Stack is empty!"<<endl;
        }
        element=stk[tos];
        tos--;
        cout<<element<<"is popped!"<<endl;
    }

    void display()
    {
        if(tos==-1)
        {
            cout<<"Stack is empty!"<<endl;
        }
        else{
            cout<<"Element in the stack are:"<<endl;
            for(int i=0; i<=tos; i++)
            {
                cout<<stk[i]<<endl;
            }
        }
    }
};
    int main()
    {
        int ch;
        Stack s;
        do{
            cout<<"1.Push\n2.Pop\n3.Display\n4.Exit"<<endl;
            cout<<"Enter your choice"<<endl;
            cin>>ch;

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
        }
        while(ch!=4);
        return 0;

    }
