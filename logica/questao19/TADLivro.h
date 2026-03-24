#ifndef __TADLivro__h
#define __TADLivro__h

typedef struct livro tlivro,*plivro;

plivro aloca(int qtd);
void limparBuffer();
void ler(plivro livro,int vezes);
void imprimir(plivro livro,int vezes);
void desaloca(plivro livro,int vezes);


#endif