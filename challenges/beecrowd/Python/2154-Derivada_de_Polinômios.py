while True:
    try:
        t = input()
        if t==0: break
        funcao = input().strip() # remove espaco em branco
        termos = funcao.split(" + ")
        resultado = [] # armazena os termos da derivada
        
        for termo in termos:
            c, e = map(int, termo.split('x')) # le os numeros que estao entre o xrange
            newC = c * e
            newE = e - 1
            
             # adc separando por x denovo
            if newE == 0: continue 
            elif newE == 1: resultado.append(f"{newC}x")
            else: resultado.append(f"{newC}x{newE}")
        
        print(" + ".join(resultado)) # junta tudo denovo
        
    except EOFError: break
