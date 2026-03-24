#include "TADLivro.h"
#include <stdio.h>
#include <stdlib.h>

struct livro{
  char *nome;
  char *isbn;
  float preco,avaliacao;
  char *editora;
};


plivro aloca(int qtd){
  plivro ponteiro;
  ponteiro = (plivro)malloc(qtd*sizeof(tlivro));
  if(ponteiro!=NULL){
    for(int i=0;i<qtd;i++){
      ponteiro[i].nome = (char *)malloc(50*sizeof(char));
      ponteiro[i].editora = (char *)malloc(30*sizeof(char));
      ponteiro[i].isbn = (char *)malloc(13*sizeof(char));
    }
  }
  return ponteiro;
}


void limparBuffer(){
int caracter;
  while((caracter = fgetc(stdin)) != EOF && caracter != '\n'){}
  // eof end of file
}

void ler(plivro livro,int vezes){
  if(livro!=NULL){
  for(int i=0;i<vezes;i++){
    limparBuffer();
    scanf("%[^\n]s",livro[i].nome);
    limparBuffer();
    scanf("%[^\n]s",livro[i].isbn);
    scanf("%f",&livro[i].preco);
    scanf("%f",&livro[i].avaliacao);
    limparBuffer();
    scanf("%[^\n]s]",livro[i].editora);
  }
  }
}

void imprimir(plivro livro,int vezes){
  if(vezes==0){
    printf("[Nenhum registro lido]");
  }
  else{
    if(livro!=NULL){
      for(int i=0;i<vezes;i++){
          printf("[Registro %d]\n",i+1);
          printf("Nome: %s\n",livro[i].nome);
          printf("ISBN: %s\n",livro[i].isbn);
          printf("Preço: R$ %.2f\n",livro[i].preco);
          printf("Avaliação: %.1f\n",livro[i].avaliacao);
          printf("Editora: %s\n",livro[i].editora);
      }
    }
  }
}

void desaloca(plivro livro,int vezes){
  if(livro != NULL){
    for(int i=0;i<vezes;i++){
      free(livro[i].nome);
      free(livro[i].editora);
      free(livro[i].isbn);
    }
    free(livro);
  }
}
