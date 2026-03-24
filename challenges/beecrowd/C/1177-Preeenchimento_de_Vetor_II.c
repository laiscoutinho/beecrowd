#include <stdio.h>

//1177 - preenchimento de um vetor

int vetor[1000];
int T,n;
int main(){
    scanf("%d",&T);
    if(T>=2 && T<=50){
        for(int i=0;i<1000;i++){
            vetor[i]=n;
            if(n==T-1){n=0;}
            else{n++;}}
        for(int i=0;i<1000;i++){
            printf("N[%d] = %d\n", i, vetor[i]);}}
    return 0;
}
