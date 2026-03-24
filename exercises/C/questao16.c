#include <stdio.h>
#include <stdlib.h>

// matriz identidade
// diagonal principal é igual a 111111 e demais elementos da matriz são zeros

//função para imprimir a matriz
void imprimir(int **matriz, int n) {
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      printf("%d ",matriz[i][j]);
    }
    printf("\n");
  }
}

// povoando a matriz identidade
void povoar_matriz(int **matriz,int n){
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      if (i == j){
        matriz[i][j] = 1;
      }
      else{
        matriz[i][j] = 0;
      }
    }
  }
}
  
//desalocando dinamicamente
void desalocar(int **matriz, int n){
  for (int i = 0; i < n; i++) {
    free(matriz[i]); 
  }
  free(matriz);
}

int main(void) {
  int **matriz,n;
  scanf("%d", &n); 
  if (n == 0){
    printf("Vazia");
    return 0;
  }
  else{
    matriz = (int **)malloc(n * sizeof(int *));
    for (int i = 0; i < n; i++) {
      matriz[i] = (int *)malloc(n * sizeof(int));

      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          scanf("%d", &matriz[i][j]);
        }
      }
    }
  }

  povoar_matriz(matriz,n);
  imprimir(matriz, n);
  desalocar(matriz,n);

  return 0;
}
