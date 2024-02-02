#include<iostream>
using namespace std;

struct Poly
{
int coe;
int exp;
Poly *next;
};
void insert(Poly ** head,int coe,int exp)
{
    Poly* newNode=new Poly;
    newNode->coe=coe;
    newNode->exp=exp;
    newNode->next=(*head);
    (*head)=newNode;
}

Poly * addPoly(Poly * first,Poly * second)
{
    Poly * result=NULL;
    Poly * temp1=first;
    Poly * temp2=second;

    while(temp1!=NULL && temp2!=NULL)
    {
        if(temp1->exp > temp2->exp)
        {
            insert(&result,temp1->coe,temp1->exp);
            temp1=temp1->next;
        }
        else if(temp1->exp < temp2->exp)
        {
            insert(&result,temp2->coe,temp2->exp);
             temp2=temp2->next;
        }
        else{
            insert(&result,temp1->coe+temp2->coe,temp1->exp);
            temp1=temp1->next;
            temp2=temp2->next;
        }
    }
    return result;
}
void printPoly(Poly * head)
{
    while(head!=NULL)
    {
        cout<<head->coe<<"x^"<<head->exp<<"+";
        head=head->next;
    }
    cout<<endl;
}

int main()
{
    Poly * first =NULL;
    Poly *second=NULL;
    Poly *result=NULL;

    insert(&first,3,2);
    insert(&first,2,1);
    insert(&first,1,0);

    insert(&second,5,2);
    insert(&second,4,1);
    insert(&second,3,0);

    cout<<"first polynomial"<<endl;
    printPoly(first);
    cout<<"second polynomial"<<endl;
    printPoly(second);

    result=addPoly(first,second);
    cout<<"result"<<endl;
    printPoly(result);

    return 0;
}