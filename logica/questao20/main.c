#include <stdio.h>
#include <string.h>
#include "TADcpf.h"

int main() {
  pCPF numero = aloca_cpf();
  char comando[3];

  while(1){
    scanf("%s",comando);
    if(strcmp(comando, "-l")==0){
      ler_cpf(numero);
    } else if(strcmp(comando, "-e")==0){
      exibir_cpf(numero);
    } else if(strcmp(comando, "-v")==0){
      validar_cpf(numero);
    }else{
      
    }
  }

  for(int i=0;i<3;i++){
    scanf("%2s",comando);
    limparBuffer();
    if(comando[1] == 'l'){
      ler_cpf(numero);
    } else if(comando[1] == 'e'){
      exibir_cpf(numero);
    } else if(comando[1] == 'v'){
      validar_cpf(numero);
    }
  }
  
  desalocar_cpf(numero);
  return 0;
}