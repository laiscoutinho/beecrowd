#include "TADLivro.h"
#include <stdio.h>

int main(void) {
  plivro l;
  int qtd=0;
  scanf("%d",&qtd);
  l= aloca(qtd);
  ler(l,qtd);
  imprimir(l,qtd);
  desaloca(l,qtd);

  return 0;
}