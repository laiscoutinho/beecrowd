#include <stdio.h>
 
int main(){
    int codigo1,peca1,codigo2,peca2;
    float valor1,valor2,total;
    scanf("%d%d%f",&codigo1,&peca1,&valor1);
    scanf("%d%d%f",&codigo2,&peca2,&valor2);
    total=peca1*valor1+peca2*valor2;
    printf("VALOR A PAGAR: R$ %.2f\n",total);
    return 0;
}
