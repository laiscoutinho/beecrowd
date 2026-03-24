#include <stdio.h>
 
int main() {
    int p;
    float s,ns,r;
    scanf("%f",&s);
    if(s<=400){
        p=15;
        r=s*0.15;
        ns=s+r;}
    if(s>400 && s<=800){
        p=12;
        r=s*0.12;
        ns=s+r;}
    if(s>800 && s<=1200){
        p=10;
        r=s*0.1;
        ns=s+r;}
    if(s>1200 && s<=2000){
        p=7;
        r=s*0.07;
        ns=s+r;}
    if(s>2000){
        p=4;
        r=s*0.04;
        ns=s+r;}
    printf("Novo salario: %.2f\n",ns);
    printf("Reajuste ganho: %.2f\n",r);
    printf("Em percentual: %d %\n",p);
    return 0;
}
