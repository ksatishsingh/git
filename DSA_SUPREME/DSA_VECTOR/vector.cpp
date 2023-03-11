#include<iostream>

using namespace std;

int main(){
    int arr[3][3]={
                    {4,9,3},
                    {6,8,1},
                    {0,4,7}
                    };
    for (int i=0;i<3;i++){
        for (int j = 0; j <3; j++)
        {
            cout << arr[i][j] << ' ';
        }

        cout<<endl;
        
    }

}