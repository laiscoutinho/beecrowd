import sys
from collections import Counter

# ENTRADA
# le ate o EOF e divide as linhas da entrada numa lista
entrada = sys.stdin.read().strip().splitlines()

# Processa cada linha de entrada
for i, linha in enumerate(entrada):
    # CONTA FREQUENCIA CARACTER
    freq = Counter(linha)
    
    # ORDENACAO -  Merge Sort + Insertion Sort
    ordenacao = sorted(freq.items(), key=lambda x: (x[1], -ord(x[0])))
    
    # SAIDA
    for char, count in ordenacao:
        print(f"{ord(char)} {count}")
    # QUEBRA DE LINHA ENTRE AS ENTRADAS
    if i < len(entrada) - 1:
        print()
