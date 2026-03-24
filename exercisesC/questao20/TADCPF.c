#include "TADcpf.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct CPF tCPF, *pCPF;
struct CPF{
  char cpf[12];
};

pCPF aloca_cpf(){
  pCPF numero = (pCPF) malloc(sizeof(tCPF));
  return numero;
}

void limparBuffer(){
  int caracter;
  while((caracter = fgetc(stdin)) != EOF && caracter != '\n'){}
}

void ler_cpf(pCPF numero){
  if(numero != NULL){
    scanf("%11s",numero->cpf);
    limparBuffer();
  }
}

void exibir_cpf(pCPF numero){
   if(numero != NULL){
     for(int i=0;i<11;i++){
       printf("%c",numero->cpf[i]);
       if(i == 2 || i == 5) printf(".");
       if(i == 8) printf("-");
     }
     printf("\n");
   }
}

void validar_cpf(pCPF numero){
  int r=0,v1=0,m=1,s=0;
  int v2=0;
  int inteiro[11];
  //converter char apara int
  for(int i=0;i<11;i++){
    inteiro[i]=numero->cpf[i] - '0';
  }
  //1 numero
  //multiplicar os indices
  for(int i=0;i<9;i++){
    m=inteiro[i]*(10-i);
    s+=m;
  }
  //processo de resto
  r=s%11;
  if(r<=11) v1=11-r;
  else v1=r-11;
  if(v1>=10) v1=0;
  if(inteiro[9] == v1){
    //2 numero
    s=0,m=1,r=0;
    //multiplicar os indices
    for(int i=0;i<10;i++){
        m=inteiro[i]*(11-i);
        s+=m;
    }
    //processo do resto
    r=s%11;
    if(r<=11) v2=11-r;
    else v2=r-11;
    if(v2>=10) v2=0;
    if(inteiro[10] == v2) printf("CPF Valido\n");
  } 
  else printf("CPF Invalido\n");
}

void desalocar_cpf(pCPF numero){
  free(numero);
}