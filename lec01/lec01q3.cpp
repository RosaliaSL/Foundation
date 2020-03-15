//if else statements

#include <iostream>
using namespace std;
int main(){
    int marks;
    cout<< "Enter your marks:"<< endl;
    cin>> marks;

    if(marks>90){
           cout<<"Excellent";
           }
        else if(marks >80 && marks <=90){
            cout<<"Very Good";
        }
        else if(marks >70 && marks <= 80){
            cout<< "Good";
        }
        else if(marks>60 && marks <=70){
            cout<<"Avg";
        }
        else{
            cout<<"poor";
        }
    

return 0;
}