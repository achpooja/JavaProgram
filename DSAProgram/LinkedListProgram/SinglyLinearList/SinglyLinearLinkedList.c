#include <stdio.h>
#include<stdlib.h>
struct SLL
{
    int info;
    struct SLL* next;
};

typedef struct SLL NODE;
NODE *first;

void createNode(NODE* first){
first=(NODE*)malloc(sizeof(NODE));
}


void traverse(NODE *first){
    NODE *temp;
    temp=first;
    if(first==(NODE*)NULL)
    {
        printf("List is empty.\n");
    }
    while(temp!=(NODE*)NULL)
    {
        printf("%d-->",temp->info);
        temp=temp->next;
    }
    printf("NULL\n");
}

void insertAtFirst(int item)
{
    NODE *ptr;
    ptr=(NODE*)malloc(sizeof(NODE));
    ptr->info=item; 
    if(first==(NODE*)NULL)
    {
        ptr->next=(NODE*)NULL;
        printf("\nFirst time insertion\n");
    }
    else{
        ptr->next=first;
    }
    first=ptr;
}

void insertAtLast(int item)
{
    NODE *ptr,*ptr1;
    ptr=(NODE*)malloc(sizeof(NODE));
    ptr->info=item;
    ptr->next=NULL;
    if(first==NULL){
    first=ptr;
    }
    else{
        ptr1=first;
    while(ptr1->next!=(NODE*)NULL)
    {
        ptr1=ptr1->next;
    }
    ptr1->next=ptr;
    }
}
void insertAtNth(int item,int n)
{
    NODE *ptr,*ptr1;
    ptr=(NODE*)malloc(sizeof(NODE));
    ptr->info=item;
    if(first==NULL){
    first=ptr;
    }
    else{
        ptr1=first;
        while(n>2)
        {
            ptr1=ptr1->next;
            n--;
        }
        ptr->next=ptr1->next;
        ptr1->next=ptr;
    }
}

void deleteAtFirst()
{
    NODE *ptr;
   
    ptr=first;
    first=first->next;
    free(ptr);
}

void deleteAtLast()
{
   NODE *temp,*ptr;
   temp=first;
   while(temp->next->next!=(NODE*)NULL)
   {
    temp=temp->next;
   }
   ptr=temp->next;
   temp->next=NULL;
   free(ptr);


}

void deleteNthNode(int n)
{
    NODE *ptr,*temp;
    ptr=first;
    while(n>2)
    {
        ptr=ptr->next;
        n--;
    }
    temp=ptr->next;
    ptr->next=ptr->next->next;
    free(temp);
}

int main()
{
    int choice,item,n;
    createNode(first);
    while(1)
    {
        printf("\n1.Insert at first.\n2.Insert at last.\n3InsertAsNthNode\n4.Display the list of nodes.\n5.DeleteAtFirst\n6.DeleteAtLast.\n7.DeleteNthNode\n8.Exit.\n");
         printf("Enter your choice.\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
            printf("Enter the item to insert at first.\n");
            scanf("%d",&item);
            insertAtFirst(item);
            break;

            case 2:
            printf("Enter the item to insert at last.\n");
            scanf("%d",&item);
            insertAtLast(item);
            break;

            case 3:
             printf("Enter the item to insert at nth node.\n");
            scanf("%d",&item);
            printf("Enter the nth value to insert node\n");
            scanf("%d",&n);
            insertAtNth(item,n);
            break;
            
            case 4:
            printf("**********NODE INTHE SLL ARE**********\n");
            traverse(first);
            break;

            case 5:
            deleteAtFirst();
            break;
 
            case 6:
            deleteAtLast();
            break;
             
            case 7:
             printf("Enter the nth value to delete node\n");
            scanf("%d",&n);
            deleteNthNode(n);
            break;

            case 8:
            exit(0);
            break;

            default:
            printf("Invalid Choice");
            break ;
        }
    }
    return 0;
}
