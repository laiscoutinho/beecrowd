#include <stdio.h>

int numero, maior=0, posicao, i;

int main(){
    for(i=1; i <= 10; i++){
        printf("digite um numero: ");
        scanf("%d", &numero);
        if(maior==0){
            maior=numero;
            posicao = i;
        } else {
            if (numero > maior){
                numero = maior;
                posicao = i; }
            }
    }
    printf("O maior valor lido foi : %d\n", maior);
    printf("A sua posicao e: %d\n", i);
    return 0;
}
