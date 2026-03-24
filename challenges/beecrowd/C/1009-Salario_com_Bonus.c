#include<stdio.h>
int main(){
    char nome;
    double salario,vendas,comissao;
    scanf("%s",&nome);
    scanf("%lf",&salario);
    scanf("%lf",&vendas);
    comissao=salario+(vendas*0.15);
    printf("TOTAL = R$ %.2lf\n",comissao);
    return 0;
}
