#include <stdio.h>

//1172 - substituição de um vetor

int vetor[10];
int main() {
    for(int i=0;i<10;i++){
        scanf("%d",&vetor[i]);
        if(vetor[i]<=0){vetor[i]=1;}
        else{vetor[i]=vetor[i];}}
    for(int i=0;i<10;i++){
        printf("X[%d] = %d\n",i,vetor[i]);}
    return 0;
}
