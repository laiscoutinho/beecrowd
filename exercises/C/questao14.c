#include <stdio.h>
#include <stdlib.h>

void preencher(int *vet,int n){
   for(int i=0; i<n; i++){
     scanf("%d", &vet[i]);
  }
}
void par_ou_impar(int *vet,int n){
  int quantidade_par = 0, quantidade_impar = 0;
  for(int i=0; i<n; i++){
    if(vet[i]%2 == 0){
      quantidade_par++;
    }
    else{
      quantidade_impar++;
    }
  } 
  printf("Pares=%d\n", quantidade_par);
  printf("Impares=%d", quantidade_impar);
}

int main(void) {
    int *vetor,n,pares,impares,quantidade;

    scanf("%d",&n);

    vetor=(int *)malloc(n*sizeof(int)); 
    preencher(vetor,n);
    par_ou_impar(vetor,n);

    free(vetor);  
    
    return 0;
}
