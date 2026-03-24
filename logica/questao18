#include <stdio.h>
#include <stdlib.h>

typedef struct livro tlivro,*plivro;
struct livro{
  char *nome;
  char *isbn;
  float preco,avaliacao;
  char *editora;
};

plivro aloca(int qtd);
void limparBuffer();
void ler(plivro livro,int vezes);
void imprimir(plivro livro,int vezes);
void desaloca(plivro livro,int vezes);

plivro aloca(int qtd){
  plivro ponteiro;
  ponteiro = (plivro *)malloc(qtd*sizeof(tlivro));
  if(ponteiro!=NULL){
    for(int i=0;i<qtd;i++){
      ponteiro[i].nome = (char *)malloc(50*sizeof(char));
      ponteiro[i].editora = (char *)malloc(30*sizeof(char));
      ponteiro[i].isbn = (char *)malloc(13*sizeof(char));
    }
  }
  return ponteiro;
}

void ler(plivro livro,int vezes){
  if(livro!=NULL){
      for(int i=0;i<vezes;i++){
        //ler texto nao poe o & (%s)
        //fgets diz o tamanho maximo de uma string o gets nao
        //scanf("%[^\n]s",livro[i].nome);
    
        limparBuffer();
        fgets(livro[i].nome,50,stdin);
        fgets(livro[i].isbn,13,stdin);
        scanf("%f",&livro[i].preco);
        scanf("%f",&livro[i].avaliacao);
        limparBuffer();
        fgets(livro[i].editora,30,stdin);
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
          printf("Nome: %s",livro[i].nome);
          printf("ISBN: %s",livro[i].isbn);
          printf("Preço: R$ %.2f\n",livro[i].preco);
          printf("Avaliação: %.1f\n",livro[i].avaliacao);
          printf("Editora: %s",livro[i].editora);
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

void limparBuffer(){
int caracter;
  while((caracter = fgetc(stdin)) != EOF && caracter != '\n');
  // eof end of file
}

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
