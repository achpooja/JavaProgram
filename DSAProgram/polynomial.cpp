// Simple C++ program to add two polynomials

#include<iostream>
using namespace std;
#include<stdlib.h>
// Node structure for linked list
struct Node {
    int coefficient;
    int exponent;
    Node* next;
};

// Function to insert a new node in the linked list
void insert(Node** head, int coefficient, int exponent) {
    Node* newNode = new Node;
    newNode->coefficient = coefficient;
    newNode->exponent = exponent;
    newNode->next = (*head);
    (*head) = newNode;
}

// Function to add two polynomials using linked list
Node* addPolynomial(Node* first, Node* second) {
    Node* result = NULL;
    Node* temp1 = first, *temp2 = second;
    while (temp1 != NULL && temp2 != NULL) {
        if (temp1->exponent > temp2->exponent) {
            insert(&result, temp1->coefficient, temp1->exponent);
            temp1 = temp1->next;
        }
        else if (temp1->exponent < temp2->exponent) {
            insert(&result, temp2->coefficient, temp2->exponent);
            temp2 = temp2->next;
        }
        else {
            insert(&result, temp1->coefficient + temp2->coefficient, temp1->exponent);
            temp1 = temp1->next;
            temp2 = temp2->next;
        }
    }
    // while (temp1 != NULL) {
    //     insert(&result, temp1->coefficient, temp1->exponent);
    //     temp1 = temp1->next;
    // }
    // while (temp2 != NULL) {
    //     insert(&result, temp2->coefficient, temp2->exponent);
    //     temp2 = temp2->next;
    // }
     return result;
}

// Function to print the polynomial
void printPolynomial(Node* head) {
    while (head != NULL) {
        cout << head->coefficient << "x^" << head->exponent << " + ";
        head = head->next;
    }
    cout << endl;
}

int main() {
    Node* first = NULL;
    Node* second = NULL;
    Node* result = NULL;

    // Inserting values in the first polynomial
    insert(&first, 3, 2);
    insert(&first, 2, 1);
    insert(&first, 1, 0);

    // Inserting values in the second polynomial
    insert(&second, 5, 2);
    insert(&second, 4, 1);
    insert(&second, 3, 0);

    cout << "First polynomial: ";
    printPolynomial(first);
    cout << "Second polynomial: ";
    printPolynomial(second);

    // Adding the two polynomials
    result = addPolynomial(first, second);
    cout << "Result: ";
    printPolynomial(result);

    return 0;
}
