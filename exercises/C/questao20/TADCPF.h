#ifndef __TADcpf__h
#define __TADcpf__h

typedef struct CPF tCPF, *pCPF;

pCPF aloca_cpf();
void limparBuffer();
void ler_cpf(pCPF numero);
void exibir_cpf(pCPF numero);
void validar_cpf(pCPF numero);
void desalocar_cpf(pCPF numero);

#endif
