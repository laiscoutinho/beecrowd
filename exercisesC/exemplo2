#include <stdio.h>
#define linha 2
#define coluna 4

int matriz[linha][coluna];
int maior, menor, pmai, pmaj, pmei, pmej;

int main()
{
    for(int i=0;i<linha;i++){
        for (int j=0;j<coluna;j++){
            printf("digite um valor pra matriz[%d][%d]: ",i, j);
            scanf("%d", &matriz[i][j]);
            if(matriz[i][j]==matriz[0][0]){
                maior=matriz[i][j];
                menor=matriz[i][j];
                pmai = i;
                pmaj = j;
                pmei = i;
                pmej = j;
            } else {
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                    pmai = i;
                    pmaj = j;
                }
                if(matriz[i][j]<menor){
                    menor = matriz[i][j];
                    pmei = i;
                    pmej = j;
                }
            }
        }
    }
    for(int i=0;i<linha;i++){
        for(int j=0;j<coluna;j++){
            printf("\n maior elemento foi: %d e sua posica foi [%d],[%d]\n", maior, pmai, pmaj);
            printf("o menor elemento foi: %d e sua posicao foi [%d],[%d]\n", menor, pmei, pmej);
        }
    }
    
    
    
    return 0;
}
