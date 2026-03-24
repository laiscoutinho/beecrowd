#include <stdio.h>
#include <stdlib.h>

void preencherVetor(float *vetor, int qtdElementos) {
  for (int i = 0; i < qtdElementos; i++) {
    scanf("%f", &vetor[i]);
  }
}

void compararAlturas(float *vetor, int qtdElementos, float *maior, float *menor, float *somaAlturas) {
  for (int i = 0; i < qtdElementos; i++) {
    *somaAlturas += vetor[i];
    if (i == 0) {
      *maior = vetor[i];
      *menor = vetor[i];
    } 
    else if (vetor[i] > *maior) {
      *maior = vetor[i];
    } 
    else if (vetor[i] < *menor) {
      *menor = vetor[i];
    }
  }
}

void exibirInformacoes(float maior, float menor, float somaAlturas, int qtdElementos) {
  float media = 0;
  if (qtdElementos != 0) {
    media = somaAlturas / qtdElementos;
  }

  printf("Maior: %.2f\n", maior);
  printf("Menor: %.2f\n", menor);
  printf("Media: %.2f", media);
}

int main(void) {

  float *vetor, maior = 0, menor = 0, somaAlturas = 0;
  int qtdElementos;

  printf("Digite a quantidade de elementos do vetor: ");
  scanf("%d", &qtdElementos);
  vetor = (float *)(malloc(qtdElementos * sizeof(float)));

  preencherVetor(vetor, qtdElementos);
  compararAlturas(vetor, qtdElementos, &maior, &menor, &somaAlturas);
  exibirInformacoes(maior, menor, somaAlturas, qtdElementos);
  free(vetor);
  return 0;
}
