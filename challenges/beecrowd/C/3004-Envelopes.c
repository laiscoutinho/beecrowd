#include <stdio.h>

int main(){
    int n;
    scanf("%d", &n);
    if(n>=1 || n<=20){
        for(int i=0;i<n;i++){
            int a,b,c,d;
            scanf("%d %d %d %d", &a, &b,&c,&d);
            if((a < c && b < d) || (a < d && b < c)) printf("S\n");
            else printf("N\n");
        }   
    }

    return 0;
}
