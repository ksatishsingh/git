#include<iostream>

using namespace std;

int main(){
    int rowWiseSum=0;
    int arr[3][3]={
                {4,9,3},
                {6,8,1},
                {0,4,7}
                };
    for (int j=0;j<3;j++){
        for (int i = 0; i <3; i++)
        {
            rowWiseSum = rowWiseSum+arr[i][j];
            
        }
        cout<<rowWiseSum;
        cout<<endl;
        rowWiseSum=0;
    } 
}