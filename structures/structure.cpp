#include <iostream>

using namespace std;

struct Students{
    string name;
    int age;
    int roll;
};

int main(){
    Students student[80];
    int n;

    cout<<"Enter number of students:"<<endl;
    cin>>n;

    for(int i=0; i<n; i++){
        cout << "Enter name: ";
        cin >> student[i].name;
        cout << "Enter age: ";
        cin >> student[i].age;
        cout << "Enter roll: ";
        cin >> student[i].roll;
        cout<<endl;
    }

    for(int i=0; i<n; i++){
        cout << "Name: " << student[i].name << endl;
        cout << "Age: " << student[i].age << endl;
        cout << "Roll: " << student[i].roll << endl;
        cout<<endl;
    }

}