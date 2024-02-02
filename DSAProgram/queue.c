#include <stdio.h>

# define SIZE 4
int arr[SIZE];
int Rear = - 1;
int Front = - 1;
void enqueue()
{
    int item;
    if (Rear == SIZE - 1)
       printf("Queue is full \n");
    else
    {
        if (Front == - 1)
      
        Front = 0;
        printf("Element to be inserted in the Queue\n : ");
        scanf("%d", &item);
        Rear = Rear + 1;
        arr[Rear] = item;
    }
} 
void dequeue()
{
    if (Front == - 1 || Front > Rear)
    {
        printf("Underflow \n");
        return ;
    }
    else
    {
        printf("Element deleted from the Queue: %d\n", arr[Front]);
        Front = Front + 1;
    }
} 

void show()
{
    
     if (Front == - 1 || Front >Rear)
     {
         printf("Empty Queue \n");
     }
     else
     {
         printf("Queue: \n");
     for (int i = Front; i <= Rear; i++)
        printf("%d ",arr[i]);
       printf("\n");
    }
}


 int main()
{
    int ch;
    while (1)
    {
        printf("1.Enqueue Operation\n");
        printf("2.Dequeue Operation\n");
        printf("3.Display the Queue\n");
        printf("4.Exit\n");
        printf("Enter your choice : ");
        scanf("%d", &ch);
        switch (ch)
        {
            case 1:
            enqueue();
            break;
            case 2:
            dequeue();
            break;
            case 3:
            show();
            break;
            case 4:
            exit(0);
            default:
            printf("Incorrect choice \n");
        } 
    } 
   
    return 0;
} 
 

 

 
