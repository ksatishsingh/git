#include<iostream>
#include<limits.h>
using namespace std;

int main(){
    int rowWiseSum=0;
    int maxi=INT_MIN;
    int minimum=INT_MAX;
    int arr[3][3]={
                {4,9,3},
                {6,8,1},
                {0,4,7}
                };
    for (int i=0;i<3;i++){
        for (int j = 0; j <3; j++)
        {
            if(arr[i][j]>maxi)
                maxi=arr[i][j];
            
        }
    } 

    cout <<"maximum number"<<maxi<<endl;

    for (int i=0;i<3;i++){
        for (int j = 0; j <3; j++)
        {
            if(arr[i][j]<minimum)
                minimum=arr[i][j];
            
        }
    } 

    cout <<"minimum number"<<minimum<<endl;
}