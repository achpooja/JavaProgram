#include <stdio.h>
#include <stdlib.h>
struct SLL
{
    int info;
    struct SLL *next;
};

typedef struct SLL NODE;
NODE *first;

void createNode(NODE *first)
{
    first = (NODE *)malloc(sizeof(NODE));
}

void traverse(NODE *first)
{
    NODE *ptr;
    ptr = first;
    if (first == NULL)
    {
        printf("\nList is empty");
    }
    else
    {
        printf("\n The elements in the list are \n");

        while (ptr->next != first)
        {

            printf("%d\n", ptr->info);
            ptr = ptr->next;
        }
        printf("%d\n", ptr->info);
    }
}

void insertAtFirst(int item)
{

    NODE *ptr, *temp;
    ptr = (NODE *)malloc(sizeof(NODE));
    ptr->info = item;
    if (first == NULL)
    {
        first = ptr;
        ptr->next = first;
    }
    else
    {

        temp = first;
        while (temp->next != first)
        {
            temp = temp->next;
        }

        ptr->next = first;
        temp->next = ptr;

        first = ptr;
    }
}

void insertAtLast(int item)
{
    NODE *ptr, *temp;
    ptr = (NODE *)malloc(sizeof(NODE));
    ptr->info = item;
    if (first == NULL)
    {
        first = ptr;
        ptr->next = first;
    }
    else
    {

        temp = first;
        while (temp->next != first)
        {
            temp = temp->next;
        }

        ptr->next = first;
        temp->next = ptr;

        // first = ptr;
    }
}

void insertAtNth(int item, int n)
{
    NODE *ptr, *temp;
    ptr = (NODE *)malloc(sizeof(NODE));
    ptr->info = item;
    if (first == NULL)
    {
        first = ptr;
        ptr->next = first;
    }
    else
    {

        temp = first;
        while (n>2)
        {
            temp = temp->next;
            n--;
        }

        ptr->next = temp->next;
        temp->next=ptr;
        
    }
}

int main()
{
    int choice, item, n;
    createNode(first);
    while (1)
    {
        printf("\n1.Insert at first.\n2.Insert at last.\n3InsertAsNthNode\n4.Display the list of nodes.\n8.Exit.\n");
        printf("Enter your choice.\n");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Enter the item to insert at first.\n");
            scanf("%d", &item);
            insertAtFirst(item);
            break;

        case 2:
            printf("Enter the item to insert at last.\n");
            scanf("%d", &item);
            insertAtLast(item);
            break;

        case 3:
            printf("Enter the item to insert at nth node.\n");
            scanf("%d", &item);
            printf("Enter the nth value to insert node\n");
            scanf("%d", &n);
            insertAtNth(item, n);
            break;

        case 4:
            printf("**********NODE INTHE SLL ARE**********\n");
            traverse(first);
            break;

        case 8:
            exit(0);
            break;

        default:
            printf("Invalid Choice");
            break;
        }
    }
    return 0;
}
