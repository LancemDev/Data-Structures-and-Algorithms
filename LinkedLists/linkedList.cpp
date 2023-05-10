#include <iostream>

using namespace std;

struct Student{
    int AdmNo;
    string name;
};

int main(){
    struct Student S[50];
    int n;
    cout<<"Enter the number of students: ";
    cin>>n;
    for(int i=0; i<n; i++){
        cout<<"Enter the name of student "<<i+1<<": ";
        cin>>S[i].name;
        cout<<"Enter the admission number of student "<<i+1<<": ";
        cin>>S[i].AdmNo;
    }

    return 0;
}
