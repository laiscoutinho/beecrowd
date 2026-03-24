<h1 align="center">Desenvolvendo Lógica de Programação em C</h1>



<div align="center">
  <strong>🚀 Exemplos de exercicios e desafios de lógica computacional 📚</strong>
</div>

<div align="center">
  <p>Um repositório com ideias de exercicios para praticar C e lógica! 🎉</p>
  <p>Aqui você encontrará informações de cada projeto, a visao/proposta geral desse repositorio e muito mais.</p>
  <p>Explore, colabore e divirta-se! 😄</p>
</div>

## 📖 Índice

- [Visão Geral](#visão-geral)
- [Questões](#questões)
- [Contribuição](#contribuição)
- [Licença](#licença)

## 🔭 Visão Geral

Esse repositorio foi criado com o objetivo de ajudar outras pessoas que queiram ingressar na área de tecnologia e desejam praticar seus conhecimentos iniciais em Lógica Para Programação, aqui terá a descrição de cada questao, e a resolução estará nesse repositorio referente ao numero da questao, todas em linguagem C.
<br>
Isso é um compilado de algumas das atividades que foram desenvolvidas na plataforma Replit, durante o meu 2 semestre da faculdade de Ciências da Computação, no Instituto Federal do Ceará, semestre 2023.2

## 💻 Questões

- <strong>Questão 1 - Maior Elemento:</strong> <br> Descobrir o maior valor lido e sua respectiva posição.
  
- <strong>Questão 2 - Matriz Elementos maior e menor:</strong> <br> Cria uma matriz e o preenche. Ao fim, mostra o maior e o menor valor entre os elementos, e sua respectiva posição.

- <strong>Questão 3 - Controle de estoque em vetores:</strong> <br> Preencha um vetor com as vendas de um determinado setor, em certos dias N. Ao fim, mostrar o dia com maior venda, menor venda, volume medio de vendas, e valor total vendido.

- <strong>Questão 4 - Vetores:</strong> <br> Você é um desenvolvedor trabalhando em um sistema de controle de estoque para uma loja de eletrônicos. A loja vende produtos como smartphones, laptops e tablets. O gerente sempre está interessado em saber dados sobre o volume das vendas no final do dia. <br> Sua tarefa neste exercício é ler o volume (em reais R$) de N dias de venda para então descobrir (a) o dia que mais vendeu, (b) o dia que menos vendeu, (c) a média de vendas no intervalo de N dias e (d) o valor total das vendas em todo o intervalo. <br> Obs: seu algoritmo não deve mostrar mensagens de interação com o usuário, pois os testes serão realizados automaticamente por um outro algoritmo de teste. Sendo assim, o usuário do seu algoritmo será um "robô". <br> Etapas: 1. Leia o número de dias; 2. Para cada dia, leia o volume das vendas; 3. Mostre para o gerente os dados solicitados.
  
- <strong>Questão 5 - Matrizes:</strong> <br> Você é um desenvolvedor trabalhando em um sistema que gerencia uma agenda de atendimentos para um consultório odontológico. O gerente precisa monitorar os horários vagos da agenda para tentar encaixar pacientes. Ao mesmo tempo, ele precisa saber a distribuição dos atendimentos especialistas em cada dia para melhor organizar o revesamento dos profissionais.  <br>Sua missão é escrever um programa capaz de ler uma matriz de tamanho fixo para representar os atendimentos de segunda à sábado.  <br>As marcações dos atendimentos consideram que cada atendimento demora 1 hora, limitado a 6 horas por dia.  <br>A estrutura deve armazenar qual a especialidade agendada.  <br>Os especialistas possíveis são:  <br>1.Clinico geral  <br>2. Odontopediatra  <br>3. Ortodontista  <br>4. Endodontista  <br>5. Periodontista  <br>6. stomatologista  <br>7. Protesista  <br>8. Cirugiao bucomaxilofacial  <br>9. Dentistica  <br>Restauradora O valor zero (0) representa que há um horário vago na agenda. Obs: seu algoritmo não deve mostrar mensagens de interação com o usuário, pois os testes serão realizados automaticamente por um outro algoritmo de teste. Sendo assim, o usuário do seu algoritmo será um "robô".  <br>Etapas: Leia a agenda completa Leia um dia específico da semana Mostre a quantidade de horários vagos total na agenda  <br>Mostre a quantidade de horários vagos na agenda para o dia lido  <br>Mostre, para cada especialidade, o volume total na agenda  <br>Mostre, para cada especialidade, o volume total para o dia lido  <br>Obs: o algoritmo não precisa validar as quantidades. Os testes foram gerados com agendas ALEATÓRIAS

- <strong>Questão 6 - Modularização:</strong> <br> Escreva um programa que, por meio de uma função, retorne a soma dos números inteiros que existem entre n1 e n2 (inclusive), ambos informados pelo usuário. A função deve funcionar inclusive se o valor de n2 for menor que n1. Leia n1 e n2 no programa principal e passe-os como parâmetro para a função.

- <strong>Questão 7 - Matriz Transposta Modularizada:</strong> <br> Declare uma matriz 2x3 no bloco principal. Depois escreva funções para: Ler a matriz 2x3 (a matriz é repassada como parâmetro) Gerar e devolver sua transposta (matriz 3x2)  <br>Exibir uma matrize recebida como parâmetro, o final, chame as funções no bloco principal de modo que o resultado seja como no exemplo demonstrado.

- <strong>Questão 8 - MDC Recursivo:</strong> <br> Tremblay-Bunt] Um algoritmo muito conhecido para determinar o maior divisor comum de dois números inteiros é o algoritmo de Euclides.  <br>A função maior divisor comum é definida como segue: MDC(M,N) = MDC(N,M) se N > M M se N = 0 MDC(N, M mod N) se N > 0  <br>Implemente um algoritmo com uma função recursiva para calcular o MDC dos valores de M e N (lidos pelo teclado).

- <strong>Questão 9 - Soma Recursiva:</strong> <br> Escreva uma função recursiva que calcule a soma dos dígitos de um inteiro positivo n.

- <strong> Questão 10 - Exponenciação Recursiva: </strong><br> Sendo xn = x * x(n-1), faça um algoritmo que utilize uma função recursiva para calcular a potência de um número qualquer (recebido como parâmetro).  <br>Receba como parâmetro da função os valores de x e n.

- <strong> Questão 11 - Vetor Dinâmico:</strong> <br> Crie um programa modularizado capaz de alocar dinamicamente um vetor de números reais de tamanho n definidos durante a execução do programa.  <br>Nesse vetor, serão armazenados a altura de n pessoas e que deverão ser lidos pelo teclado.  <br>Ao final, o programa deve imprimir a maior, a menor e a média das alturas. Obs: precisão de 2 casas decimais.

- </trong> Questão 12 - Inversao Dinamica:</strong> <br> Escreva um programa capaz de alocar dinamicamente valores inteiros positivos.  <br>O programa deve ler um número inteiro positivo n e em seguida n números inteiros.  <br>Imprima esses n números em ordem invertida. Não esqueça de desalocar a memória usada.

- <strong>Questão 13 - Soma Dinamica:</strong> <br> Crie um programa que aloca dinamicamente um vetor de inteiros de tamanho n (informado pelo usuário).  <br>Todos os n números devem ser inseridos pelo usuário, um a um.  <br>Ao final, o programa deve calcular e imprimir a soma de todos os valores.

- <strong>Questão 14 - Pares e Impares:</strong><br> Faça um programa que aloque memória para n inteiros inseridos pelo usuário.  <br>Em seguida, mostre quantos dos números são pares e quantos são ímpares.

- <strong> Questão 15 - Matriz Dinamica: </strong><br> Construa um programa modularizado que: Aloque dinamicamente uma matriz quadrada de ordem n x n (linha por coluna) (n lido pelo teclado)  <br>Leia os valores para preencher a matriz  <br>Multiplique os valores da diagonal principal.  <br>Mostre o valor da multiplicação Desaloque a memória alocada para a matriz

- <strong>Questão 16 - Matriz Identidade: </strong><br> Crie um programa modularizado para: Alocar uma matriz de dimensão nxn, em que n é determinado pelo usuário.  <br>Povoar a matriz gerada de modo que ela torne-se uma matriz identidade (matriz quadrada em que os elementos da diagonal principal são iguais a 1 e os demais elementos são iguais a 0)  <br>Mostrar a matriz resultante Desalocar a memória utilizada

- <strong>Questão 17 - Histograma: </strong><br> Faça um programa modularizado que leia e construa a seguinte tabela de histogramas:  <br>Elemento Valor Histograma A 4 ∗∗∗∗ B 2 ∗∗ C 8 ∗∗∗∗∗∗∗∗ D 12 ∗∗∗∗∗∗∗∗∗∗∗∗ E 1 ∗ Soma 27 ***************************  <br>A quantidade de elementos (n) deve ser lida no programa principal.  <br>A quantidade de elementos será o parâmetro para uma alocação dinâmica do histograma.  <br>Dica: Use um vetor de ponteiros.  <br>Ao final, sua estrutura deve permitir o cálculo da soma dos valores para exibir o histograma da soma (veja a saída esperada no caso de teste).  <br>Dica: faça funções para cada "mini problema".  <br>Obs: Todas as impressões devem ser feitas em função(ões) específica(s) para impressão na tela. Jamais dentro da função que constrói ou lê dados.  <br>A(s) função(ões) para impressão devem receber a estrutura de dados como parâmetro para então percorrer e imprimir os dados.

- <strong>Questão 18 - Struct Livro: </strong><br> Defina um ponteiro para uma struct capaz de armazenar dados sobre um livro. O registro contém os seguintes dados: nome, ISBN, preco, avaliacao e editora.  <br>Usando este registro faça: Uma função que aloque o(s) livro(s) e devolva um ponteiro para o bloco de livro(s).  <br>Obs: a função deve receber a quantidade de livros a ser alocada. Uma função que leia do teclado os dados do livro (receba o livro como parâmetro).  <br>Uma função que mostre os dados do livro lido.  <br>Uma função que desaloque os dados do livro lido.  <br>Inicialmente, a primeira leitura deve informar quantos livros serão inseridos. Em seguida, a leitura de cada livro deve seguir a mesma ordem dos campos acima descritos.

- <strong>Questão 19 - TAD Livro:</strong> <br> Reescreva o algoritmo construído anteriormente criando um Tipo Abstrato de Dados chamado TADLivro.  <br>Obs: criei os arquivos das estruturas para o TAD para que você migre seu código anterior no formado do tipo abstrado.

- <strong>Questão 20 - TAD CPF:</strong> <br> O Cadastro Nacional de Pessoal Física (CPF) é um número que identifica de forma única um brasileiro e lhe assegura direitos enquanto cidadão. Ele é composto por 11 dígitos, sendo que os dois últimos correspondem ao dígito verificador.  <br>Crie um T.A.D chamado CPF contendo uma estrutura capaz de manipular esse tipo abstrato. Nele, insira as seguintes funcionalidades:  <br>Ler um CPF Exibir o CPF (respeitando a formatação xxx.xxx.xxx-xx)  <br>Validar um CPF (para isso, calcule o dígito verificar do número gerado).  <br>Dica como calcular o dígito verificador: https://campuscode.com.br/conteudos/o-calculo-do-digito-verificador-do-cpf-e-do-cnpj  <br>Seu programa deve ler como comandos de entrada e seus respectivos valores (separados por espaços).  <br>Os comandos possíveis são: -l : o programa irá ler um CPF (apenas números) -e : exibe o CPF lido usando a formatação para exibição -v : valida ou invalida o CPF lido

## 🤝 Contribuição

Em alguns exercicios citados, durante o meu semestre, foi realizado com a participação de mais algumas pessoas: <br>
Nos exercicios 12, 13, 14, 15, 16, minha colega Claudia colaborou com o desenvolvimento. <br>
Nos exericios 11 e 17, foi com minha colega Rosana. <br> <br>
Obrigada pelo apoio!!
