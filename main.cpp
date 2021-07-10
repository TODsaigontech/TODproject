#include <bits/stdc++.h>

using namespace std;

int main()
{
    //freopen("Prime3.INP","r",stdin);
    //freopen("Prime3.OUT","w",stdout);
    int k = 0;
    long n;
    cin>>n;
    bool arr[n*n*100];
    long arr_result[n];
    for(int i = 2; i < n*n*100; i++)
        arr[i] = true;
    for (int i = 2; i <= ceil(sqrt(n*n*10)); i++) {
        if (arr[i]) {
            int j = i * i;
            while (j < n*n*100) {
                arr[j] = false;
                j += i;
            }
        }
    }
    for(int i = 2; i < n*n*100 - 1; i++){
         if(arr[i]){
            float j_1 = 0;
            float h_1 = 0;
            for(int j = i-1; j >= 2; j--){
                if(arr[j]){
                    j_1 = j;
                    break;
                }
            }
            for(int h = i+ 1; i < n*n*100; h++){
                if(arr[h]){
                    h_1 = h;
                    break;
                }
            }
            if(i == (j_1 + h_1)/2){
                arr_result[k] = i;
                if(k == n - 1)
                    break;
                k++;
            }
         }
    }
    cout<<arr_result[n - 1];
    return 0;
}
