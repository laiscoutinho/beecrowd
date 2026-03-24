import sys

def colunaCorresponde(letras):
    soma = 0
    for letra in letras:
        soma = soma * 26 + (ord(letra.upper()) - ord('A') + 1)
    return soma if soma <= 16384 else "Essa coluna nao existe Tobias!"

entrada = sys.stdin.read().strip()
for letras in entrada.splitlines():
    print(colunaCorresponde(letras))
