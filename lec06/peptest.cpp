#include <iostream>
using namespace std;
int main(){
    int n;
    cin>> n;
    
    int arr[n];
    for(int i=0; i<n; i++){
        cin>> arr[i];
    }
     int max= INT_MIN;

        for(int i=0; i<sizeof(arr); i++){
        
            for(int j=i; j<sizeof(arr); j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
                if(sum>max){
                        max=sum;
                    }
            
            }
        }
        cout << max;
    return 0;
}

