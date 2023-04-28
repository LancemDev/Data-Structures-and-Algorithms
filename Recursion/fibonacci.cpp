#include <iostream>

using namespace std;

int fibonacci(int n){
    return n<=1 ? n : fibonacci(n-1) + fibonacci(n-2);
}

int main(){
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    cout<<"Fibonacci of the "<<n<<"th number is "<<fibonacci(n)<<endl;

    return 0;
}