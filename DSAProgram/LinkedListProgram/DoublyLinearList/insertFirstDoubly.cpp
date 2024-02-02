#include <stdio.h>
#include<stdlib.h>
struct SLL
{
    int info;
    struct SLL* next,*prev;
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
    // printf("NULL\n");
}
void insertAtFirst(int item)
{
 NODE *ptr;
 ptr=(NODE*)malloc(sizeof(NODE));

    if(first==(NODE*)NULL)
    {
       ptr->next = NULL;  
       ptr->prev=NULL; 
       ptr->info=item;
       first=ptr;

    }
    else{
          ptr->info=item;  
       ptr->prev=NULL;  
       ptr->next = first;  
       first->prev=ptr;  
       first=ptr;  
    }
   

}
int main()
{
    int choice,item,n;
    createNode(first);
    while(1)
    {
         printf("\n1.Insert at first.\n2.Display the list of nodes.\n3.Exit.\n");
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
            printf("**********NODE INTHE SLL ARE**********\n");
            traverse(first);
            break;

             case 3:
            exit(0);
            break;

            default:
            printf("Invalid Choice");
            break ;
        } 
    }
    return 0;
}       