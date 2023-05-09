#include <iostream>

using namespace std;

class Node{
    public:
        int data;
        Node* next;
};

class CircularLinkedList{
    public:
    CircularLinkedList(){
        head = nullptr;
    }

    //Insert at the beginning of the list
    void insert(int value){
        Node* newNode = new Node();
        newNode->data = value;
        newNode->next = head;
        if(head == nullptr){
            head = newNode;
            newNode->next = head;
        }
        else{
            Node* temp = head;
            while(temp->next != head){
                temp = temp->next;
            }
            temp->next = newNode;
            head = newNode;
        }
    }

    //Deleting a node from the list
    void remove(int value){
        if (head == nullptr){
            cout << "List is empty" << endl;
            return;
        }

        Node * temp = head;
        do{
            cout<<temp->data<<" ";
            temp = temp->next;
        } while (temp != head);
    }

    //Transverse the list and print the values
    void display(){
        if (head == nullptr){
            cout << "List is empty" << endl;
            return;
        }

        Node * temp = head;
        do{
            cout<<temp->data<<" ";
            temp = temp->next;
        } while (temp != head);
    }

    private:
    Node* head;
};

int main(){
    CircularLinkedList myList;
    myList.insert(5);
    myList.insert(10);
    myList.insert(15);
    myList.insert(20);
    myList.remove(10);
    myList.display();

    return 0;
}