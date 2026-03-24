#include <stdio.h>

int main(void) {
  int n;
  scanf("%d", &n);
  int maior = 0, menor = 0;
  float volumeDias[n], media=0, total = 0, maiorv ,menorv;
  
  for(int i=0; i<n; i++) {
    scanf("%f", &volumeDias[i]);
    if (i==0) {
      maior=1;
      menor=1;
      maiorv=volumeDias[i];
      menorv=volumeDias[i]; 
    }
    else {
      if (volumeDias[i] > maiorv){
        maior = i+1;
        maiorv = volumeDias[i]; }
      if (volumeDias[i] < menorv){
        menor = i+1;
        menorv = volumeDias[i]; }
    }
    total += volumeDias[i];
    media = total/n;
  }
  printf("Dia com maior volume: %d\n", maior);
  printf("Dia com menor volume: %d\n", menor);
  printf("Volume medio: %.2f\n", media);
  printf("Valor total : %.2f\n", total);

  return 0;
}
