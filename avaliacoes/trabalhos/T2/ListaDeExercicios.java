package avaliacoes.trabalhos.T2;

import java.util.Scanner;

import utils.IO;

import utils.VETORES;

import java.lang.Math;

public class ListaDeExercicios {

    final static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static int lerValorInteiro() {
        int valor = tecladoScanner.nextInt();
        return valor;
    }

    public static double LerValorDouble() {
        double valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static void imprimirValorInteiro(int valor) {
        imprimir("" + valor);
    }

    public static void imprimirValorDouble(double valor) {
        imprimir("" + valor);
    }

    public static char lerValorChar() {
        String entrada = tecladoScanner.next();
        return entrada.charAt(0);
    }

    public static String lerPalavra() {
        String valor = tecladoScanner.next();
        return valor;
    }

    public static void exercicios() {

        // Exercicio 01
        // ex01();
        // Exercicio 02
        // ex02();
        // Exercicio 03
        // ex03();
        // Exercicio 04
        // ex04();
        // Exercicio 05
        // ex05();
        // Exercicio 06
        // ex06();
        // Exercicio 07
         ex07();
        // Exercicio 08
        // ex08();
        // Exercicio 09
        // ex09();
        // Exercicio 10
        //ex10();
        // Exercicio 11
         //ex11();
        // Exercicio 12
        // ex12();
        // Exercicio 13
         //ex13();
        // Exercicio 14
         //ex14();
        // Exercicio 15
        // ex15();
        // Exercicio 16
        // ex16();
        // Exercicio 17
         //ex17();
        // Exercicio 18
         //ex18();
        // Exercicio 19
         //ex19();
        // Exercicio 20
         //ex20();
        // Exercicio 21
        // ex21();
        // Exercicio 22
        // ex22();
        // Exercicio 23
        // ex23();

    }

    public static void ex01() {
        estatisticaDeIdades();
    }

    public static void ex02() {
        numerosPerfeitos();
    }

    public static void ex03() {
        proximoNumeroPerfeito();
    }

    public static void ex04() {
        numerosPerfeitosNoIntervalo();
    }

    public static void ex05() {
        fibonnaci();
    }

    public static void ex06() {
        decaimentoRadioativo();
    }

    public static void ex07() {
        somaPrimosIntervalo();
    }

    public static void ex08() {
        verificarPotencia();
    }

    public static void ex09() {
        distanciaCartesiana();
    }

    public static void ex10() {
        vinteNumerosDistintos();
    }

    public static void ex11() {
        adicaoDeValorEscalar();
    }

    public static void ex12() {
        contarParEImpar();
    }

    public static void ex13() {
        separarParEImpar();
    }

    public static void ex14() {
        paresNoInicioEImparesNoFim();
    }

    public static void ex15() {
        mostrarComSeparador();
    }

    public static void ex16() {
        filtrarMaiores();
    }

    public static void ex17() {
        filtrarMenores();
    }

    public static void ex18() {
        aplicarELogico();
    }

    public static void ex19() {
        aplicarOuLogico();
    }

    public static void ex20() {
        aplicarMascara();
    }

    public static void ex21() {
        conjuntoUniao();
    }

    public static void ex22() {
        conjuntoInterseccao();
    }

    public static void ex23() {
    conjuntoDiferenca();
    }

    // EXERCICIO 01
    public static void estatisticaDeIdades() {
        int menorIdade = 999;
        int maiorIdade = 0;
        int somaIdades = 0;
        int totalPessoas = 0;
        double mediaIdades = 0;
        while (true) {
            int idade = solicitaValorInteiro("Digite uma idade (0 ou menor para finalizar)");
            if (idade <= 0) {
                imprimir("finalizando o programa");
                break;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            somaIdades = somaIdades + idade;
            totalPessoas++;
        }
        mediaIdades = (double) somaIdades / totalPessoas;

        IO.imprimir("A maior idade foi digitada foi: " + maiorIdade);
        IO.imprimir("A menor idade foi digitada foi: " + menorIdade);
        IO.imprimir("O numero de pessoas foi: " + totalPessoas);
        IO.imprimir("A media das idades foi: " + mediaIdades);

    }

    // EXERCICIO 02
    public static void numerosPerfeitos() {
        calcularNumeroPerfeitoComImput();
    }

    // EXERCICIO 03
    public static void proximoNumeroPerfeito() {
        IO.imprimirValorInteiro(calcularProximoNumeroPerfeito());
    }

    // EXERCICIO 04
    public static void numerosPerfeitosNoIntervalo() {
        int[] intervalo = intervalo(0, 0);
        int numero = intervalo[0];
        IO.imprimir("Os números perfeitos dentro do intervalo " + intervalo[0] + " até " + intervalo[1] + " são:");

        while (numero < intervalo[1]) {
            if (calcularNumeroPerfeito(numero)) {
                IO.imprimirValorInteiro(numero);

            }
            numero++;
        }
    }

    // EXERCICIO 05
    public static void fibonnaci() {
        calcularFibonacci();
    }

    // EXERCICIO 06
    public static void decaimentoRadioativo() {
        calcularDecaimentoRadioativoFormaUm(0.05, solicitarValorDouble("Digite uma massa inicial"));
    }

    // EXERCICIO 07
    public static void somaPrimosIntervalo() {
        IO.imprimirValorInteiro(somaprimos());
    }

    // EXERCICIO 08
    public static void verificarPotencia() {
        if (potN(solicitaValorInteiro("Digite um valor"), solicitaValorInteiro("Digite um valor"))) {
            IO.imprimir("Verdadeiro");
        } else {
            IO.imprimir("falso");
        }
    }

    // EXERCICIO 09
    public static void distanciaCartesiana() {
        calcularDistanciaCartesiana();
    }

    // EXERCICIO 10
    public static void vinteNumerosDistintos() {
        processarNumerosDistintos();
    }

    // EXERCICIO 11
    public static void adicaoDeValorEscalar() {
        int qtdNumerosVetor = solicitaValorInteiro("Quantos numeros o vetor terá?");
        int[] vetor = new int[qtdNumerosVetor];

        // le o valor digitado pelo usuario em cada posicao
        for (int indice = 0; indice < vetor.length; indice++) {
            vetor[indice] = solicitaValorInteiro("Digite um valor para a posicao " + (indice + 1));
        }

        int numero = solicitaValorInteiro("Digite um valor pra somar");

        // Soma o numero digitado a cada valor
        for (int indice = 0; indice < vetor.length; indice++) {
            vetor[indice] = vetor[indice] + numero;
        }

        // impprime os valores        
            VETORES.imprimirVetor(vetor);
        

    }

    // EXERCICIO 12
    public static void contarParEImpar() {
        contagemParEImpar();
    }

    // EXERCICIO 13
    public static void separarParEImpar() {
        int[] va = new int[10];
        int[] vb = new int[10];
        int contador_vb = 0;

        // receber os valores pro vetor
        for (int indice = 0; indice < va.length; indice++) {
            va[indice] = solicitaValorInteiro("Digite o " + (indice + 1) + " valor");
        }

        // organiza os numeros pares
        for (int indice = 0; indice < va.length; indice++) {
            if (va[indice] % 2 == 0) {
                vb[contador_vb] = va[indice];
                contador_vb++;
            }
        }
        // organiza os valores impares
        for (int indice = 0; indice < va.length; indice++) {
            if (va[indice] % 2 != 0) {
                vb[contador_vb] = va[indice];
                contador_vb++;
            }
        }

        // imprime vb
        IO.imprimir("\nOs valores organizados sao: ");        
        VETORES.imprimirVetor(vb);
        

    }

    // EXERCICIO 14
    public static void paresNoInicioEImparesNoFim() {
        int[] valores = new int[10];
        int contadorVetorPar = 0;
        int contadorVetorImpar = 9;

        for (int indice = 0; indice < valores.length; indice++) {
            int num = solicitaValorInteiro("Digite o " + (indice + 1) + " valor");

            if (num % 2 == 0) {
                valores[contadorVetorPar] = num;
                contadorVetorPar++;
            } else {
                valores[contadorVetorImpar] = num;
                contadorVetorImpar--;
            }
        }

        imprimir("\nOs valores organizados sao: ");

        VETORES.imprimirVetor(valores);

    }

    // EXERCICIO 15
    public static void mostrarComSeparador() {
        int qtdNumerosVetor = solicitaValorInteiro("Quantos numeros o vetor terá?");
        int[] vetor = new int[qtdNumerosVetor];

        String saida = "";

        imprimir("Digite um caractere separador");
        String separador = lerPalavra();
        separador = separador.replace("\\n", "\n"); // essa linha e pra corrigir o erro de nao pular linhas

        for (int indice = 0; indice < vetor.length; indice++) {
            if (indice > 0) {
                saida = saida + separador;
            }
            vetor[indice] = solicitaValorInteiro("Digite um valor para a posicao " + indice);
            saida = saida + vetor[indice];
        }

        imprimir(saida);

    }

    // EXERCICIO 16
    public static void filtrarMaiores() {
        int qtdNumerosVetor = solicitaValorInteiro("Quantos numeros o vetor terá?");
        int[] vetor = new int[qtdNumerosVetor];
        int contadorVetorSaida = 0;

        // le o valor digitado pelo usuario em cada posicao
        for (int indice = 0; indice < vetor.length; indice++) {
            vetor[indice] = solicitaValorInteiro("Digite um valor para a posicao " + (indice + 1));
        }

        int numero = solicitaValorInteiro("Digite um valor");

        // Contar quantos numeros maiores tem pra nao imprimir varios vazios
        for (int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] > numero) {
                contadorVetorSaida++;
            }
        }

        int[] vetorSaida = new int[contadorVetorSaida];

        int posicao = 0;
        for (int indice = 0; posicao < vetorSaida.length; indice++) {
            if (vetor[indice] > numero) {
                vetorSaida[posicao] = vetor[indice];
                posicao++;
            }
        }

        // impprime os valores
        imprimir("\nOs valores são:");
        VETORES.imprimirVetor(vetorSaida);
    }

    // EXERCICIO 17
    public static void filtrarMenores() {
        int qtdNumerosVetor = solicitaValorInteiro("Quantos numeros o vetor terá?");
        int[] vetor = new int[qtdNumerosVetor];
        int contadorVetorSaida = 0;

        // le o valor digitado pelo usuario em cada posicao
        for (int indice = 0; indice < vetor.length; indice++) {
            vetor[indice] = solicitaValorInteiro("Digite um valor para a posicao " + (indice + 1));
        }

        int numero = solicitaValorInteiro("Digite um valor");

        // Contar quantos numeros menores tem pra nao imprimir varios vazios
        for (int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] < numero) {
                contadorVetorSaida++;
            }
        }

        int[] vetorSaida = new int[contadorVetorSaida];

        int posicao = 0;
        for (int indice = 0; posicao < vetorSaida.length; indice++) {
            if (vetor[indice] < numero) {
                vetorSaida[posicao] = vetor[indice];
                posicao++;
            }
        }

        // impprime os valores
        imprimir("\nOs valores são:");
        VETORES.imprimirVetor(vetorSaida);
    }

    // EXERCICIO 18
    public static void aplicarELogico() {
        int qtdNumerosVetor = solicitaValorInteiro("Quantos numeros o vetor terá?");
        String[] vetor_v = new String[qtdNumerosVetor];
        String[] vetor_w = new String[qtdNumerosVetor];

        boolean[] resultado = new boolean[qtdNumerosVetor];

        // Leitura do vetor V
        imprimir("Digite os valores do vetor V (verdadeiro/falso):");
        for (int i = 0; i < qtdNumerosVetor; i++) {
            vetor_v[i] = lerPalavra().toLowerCase();
        }

        // Leitura do vetor W
        imprimir("Digite os valores do vetor W (verdadeiro/falso):");
        for (int i = 0; i < qtdNumerosVetor; i++) {
            vetor_w[i] = lerPalavra().toLowerCase();
        }

        // Saber se um dos dois é falso
        for (int indice = 0; indice < qtdNumerosVetor; indice++) {
            boolean v = vetor_v[indice].equals("verdadeiro");
            boolean w = vetor_w[indice].equals("verdadeiro");

            resultado[indice] = v && w;

        }

        // impprime os valores
        VETORES.imprimirVetorBool(resultado);

    }

    // EXERCICIO 19
    public static void aplicarOuLogico() {
        int qtdNumerosVetor = solicitaValorInteiro("Quantos numeros o vetor terá?");
        String[] vetor_v = new String[qtdNumerosVetor];
        String[] vetor_w = new String[qtdNumerosVetor];

        boolean[] resultado = new boolean[qtdNumerosVetor];

        // Leitura do vetor V
        imprimir("Digite os valores do vetor V (verdadeiro/falso):");
        for (int i = 0; i < qtdNumerosVetor; i++) {
            vetor_v[i] = lerPalavra().toLowerCase();
        }

        // Leitura do vetor W
        imprimir("Digite os valores do vetor W (verdadeiro/falso):");
        for (int i = 0; i < qtdNumerosVetor; i++) {
            vetor_w[i] = lerPalavra().toLowerCase(); // tolowercase serve pra converter todos os caracteres de uma
                                                     // string para minusculo
        }

        //Saber se um dos dois é verdadeiro
        for (int indice = 0; indice < qtdNumerosVetor; indice++) {
            boolean v = vetor_v[indice].equals("verdadeiro");
            boolean w = vetor_w[indice].equals("verdadeiro");

            resultado[indice] = v || w;

        }

        VETORES.imprimirVetorBool(resultado);


    }

    // EXERCICIO 20
    public static void aplicarMascara() {

        int qtdNumerosVetor = solicitaValorInteiro("Quantos numeros o vetor terá?");
        String[] vetorMascara = new String[qtdNumerosVetor];
        int[] vetorNumeros = new int[qtdNumerosVetor];
        boolean[] resultado = new boolean[qtdNumerosVetor];

        // le o valor digitado pelo usuario em cada posicao
        for (int indice = 0; indice < qtdNumerosVetor; indice++) {
            vetorNumeros[indice] = solicitaValorInteiro("Digite um valor para a posicao " + (indice + 1));
        }

        // Leitura do vetor Mascara
        imprimir("Digite os valores do vetor V (verdadeiro/falso):");
        for (int i = 0; i < qtdNumerosVetor; i++) {
            vetorMascara[i] = lerPalavra().toLowerCase();
        }

        for (int indice = 0; indice < qtdNumerosVetor; indice++) {
            boolean m = vetorMascara[indice].equals("verdadeiro");

            resultado[indice] = m;

        }

        for (int indice = 0; indice < qtdNumerosVetor; indice++) {
            if (resultado[indice]) {
                imprimirValorInteiro(vetorNumeros[indice]);
            }
        }
    }

    // EXERCICIO 21
    public static void conjuntoUniao() {
        int qtdNumerosVetor = solicitaValorInteiro("Quantos numeros o vetor terá?");
        int[] vetorUm = new int[qtdNumerosVetor];
        int[] vetorDois = new int[qtdNumerosVetor];
        int[] vetorSaida = new int[qtdNumerosVetor * 2];
        int tamanhoSaida = 0; // para controlar quantos elementos realmente foram adicionados

        // le o valor digitado pelo usuario em cada posicao
        for (int indice = 0; indice < vetorUm.length; indice++) {
            vetorUm[indice] = solicitaValorInteiro("Digite um valor para a posicao " + (indice + 1));
        }

        // le o valor digitado pelo usuario em cada posicao
        for (int indice = 0; indice < vetorDois.length; indice++) {
            vetorDois[indice] = solicitaValorInteiro("Digite um valor para a posicao " + (indice + 1));
        }

        // conferir se o valor do vetor um ja tem na saida
        for (int i = 0; i < vetorUm.length; i++) {
            if (!contem(vetorSaida, vetorUm[i], tamanhoSaida)) {
                vetorSaida[tamanhoSaida] = vetorUm[i];
                tamanhoSaida++;
            }
        }
        // conferir se o valor do vetor dois ja tem na saida
        for (int i = 0; i < vetorUm.length; i++) {
            if (!contem(vetorSaida, vetorDois[i], tamanhoSaida)) {
                vetorSaida[tamanhoSaida] = vetorDois[i];
                tamanhoSaida++;
            }
        }

        imprimir("\nOs valores são:");
        for (int indice = 0; indice < tamanhoSaida; indice++) {
            imprimirValorInteiro(vetorSaida[indice]);
        }

    }

    // EXERCICIO 22
    public static void conjuntoInterseccao() {
        int qtdNumerosVetor = solicitaValorInteiro("Quantos numeros o vetor terá?");
        int[] vetorUm = new int[qtdNumerosVetor];
        int[] vetorDois = new int[qtdNumerosVetor];
        int[] vetorSaida = new int[qtdNumerosVetor];
        int tamanhoSaida = 0;

        // Leitura do primeiro vetor
        for (int i = 0; i < vetorUm.length; i++) {
            vetorUm[i] = solicitaValorInteiro("Digite um valor para a posicao " + (i + 1));
        }

        // Leitura do segundo vetor
        for (int i = 0; i < vetorDois.length; i++) {
            vetorDois[i] = solicitaValorInteiro("Digite um valor para a posicao " + (i + 1));
        }

        // Construção do vetor de interseccao
        for (int i = 0; i < vetorUm.length; i++) {
            if (contem(vetorDois, vetorUm[i], vetorDois.length) && !contem(vetorSaida, vetorUm[i], tamanhoSaida)) {
                vetorSaida[tamanhoSaida] = vetorUm[i];
                tamanhoSaida++;
            }
        }

        imprimir("\nOs valores da interseção são:");
        for (int i = 0; i < tamanhoSaida; i++) {
            imprimirValorInteiro(vetorSaida[i]);
        }
    }

    // EXERCICIO 23
    public static void conjuntoDiferenca() {
    int qtdNumerosVetor = solicitaValorInteiro("Quantos números os vetores terão?");
    int[] vetorA = new int[qtdNumerosVetor];
    int[] vetorB = new int[qtdNumerosVetor];
    int[] vetorSaida = new int[qtdNumerosVetor];
    int tamanhoSaida = 0;

    // Leitura do vetor A
    for (int i = 0; i < vetorA.length; i++) {
        vetorA[i] = solicitaValorInteiro("Digite um valor para a posição " + (i + 1) + " do vetor A:");
    }

    // Leitura do vetor B
    for (int i = 0; i < vetorB.length; i++) {
        vetorB[i] = solicitaValorInteiro("Digite um valor para a posição " + (i + 1) + " do vetor B:");
    }

    // Construção do vetor diferença (A - B)
    for (int i = 0; i < vetorA.length; i++) {
        if (!contem(vetorB, vetorA[i], vetorB.length)) {
            vetorSaida[tamanhoSaida] = vetorA[i];
            tamanhoSaida++;
        }
    }

    // Impressão dos resultados
    imprimir("\nOs valores da diferença (A - B) são:");
    for (int i = 0; i < tamanhoSaida; i++) {
        imprimirValorInteiro(vetorSaida[i]);
    }
}
    // TODOS OS METODOS UTILIZADOS NOS EXERCICIOS:

    // PEDE E RECEBE UM VALOR INTEIRO
    public static int solicitaValorInteiro(String mensagemSolicitacao) {
        imprimir(mensagemSolicitacao);
        int valor = lerValorInteiro();
        return valor;
    }

    // RECEBE UM VALOR INTEIRO
    public static int receberInteiro() {
        return solicitaValorInteiro("Digite um valor inteiro");
    }

    // SOMA OS DIVISORES PERFEITOS
    public static int somaDivisores(int numero) {
        int soma = 0;
        for (int indice = 1; indice < numero; indice++) {
            if (numero % indice == 0) {
                soma = soma + indice;
            }
        }
        return soma;
    }

    // SOMA PARA CALCULAR SE O NUMERO É PERFEITO
    public static boolean calcularNumeroPerfeito(int numero) {
        int soma = somaDivisores(numero);
        return numero == soma;
    }

    // CALCULAR SE NUMERO DIGITADO PELO USUARIO É PERFEITO
    public static void calcularNumeroPerfeitoComImput() {
        int numero = receberInteiro();
        if (calcularNumeroPerfeito(numero)) {
            IO.imprimir("O número digitado é perfeito");
        } else {
            IO.imprimir("O número digitado NÃO é perfeito");
        }
    }

    // CALCULAR O PROXIMO NUMERO PERFEITO
    public static int calcularProximoNumeroPerfeito() {
        int numero = solicitaValorInteiro("Digite um numero inteiro");

        while (!(calcularNumeroPerfeito(numero))) {
            numero++;
        }
        return numero;
    }

    // DEFINE O INICIO E O FIM DE UM INTERVALO
    public static int[] intervalo(int inicio, int fim) {
        inicio = solicitaValorInteiro("Digite um valor de início");
        fim = solicitaValorInteiro("Digite um valor de fim");
        return new int[] { inicio, fim };
    }

    // CALCULAR FIBONNACI
    public static void calcularFibonacci() {
        int qtdNumeros = solicitaValorInteiro("Digite quantos dígitos de fibonnaci você quer");
        int qtdDidigatos = 1;
        long numero = 1;
        long ultimoNumero = 1;
        long penultimoNumero = 0;
        while (qtdNumeros >= qtdDidigatos) {
            imprimir("O " + qtdDidigatos + "º número de fibonnaci é: " + numero);
            numero = ultimoNumero + penultimoNumero;
            penultimoNumero = ultimoNumero;
            ultimoNumero = numero;
            qtdDidigatos++;
        }
    }

    // CALCULA O TEMPO QUE LEVA ATE UMA MASSA CAIR ATE UM VALOR DEFINIDO
    public static int calcularDecaimentoRadioativoFormaUm(double massaDesejada, double massaInicial) {
        int tempo = 0;
        while (massaInicial > massaDesejada) {
            massaInicial = massaInicial / 2;
            tempo = tempo + 60;
            imprimir("Após " + tempo + " segundos, a massa é igual à: " + massaInicial);
        }
        imprimir("O tempo necessario foi: " + tempo + " segundos");
        return tempo;
    }

    // PEDE E RECENE UM VALOR DOUBLE
    public static double solicitarValorDouble(String mensagemSolicitacao) {
        imprimir(mensagemSolicitacao);
        double valor = LerValorDouble();
        return valor;
    }

    // CONFERE SE O NUMERO E PRIMO
    public static boolean primo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // SOMA OS NUMEROS PRIMOS
    public static int somaprimos() {
        int soma = 0;
        int valorUm = receberInteiro();
        int valorDois = receberInteiro();
        int primeiroPrimo = 0;
        int qtdPrimos = 0;

        // ACHAR O PRIMEIRO NUMERO PRIMO DA SOMA
        for (int i = 0; qtdPrimos < valorUm; i++) {
            if (primo(i)) {
                primeiroPrimo = i;
                qtdPrimos++;
            }
        }

        for (int indice = primeiroPrimo; qtdPrimos <= valorDois; indice++) {
            if (primo(indice)) {
                soma = soma + indice;
                qtdPrimos++;
            }
        }

        return soma;
    }

    // RECEBE OS PONTOS DO PLANO CARTESIANO
    public static int[] receberPontosPlanoCartesiano() {

        int x_ponto_Um = solicitaValorInteiro("Digite o valor X do ponto 1");
        int y_ponto_Um = solicitaValorInteiro("Digite o valor Y do ponto 1");
        int x_ponto_Dois = solicitaValorInteiro("Digite o valor X do ponto 2");
        int y_ponto_Dois = solicitaValorInteiro("Digite o valor Y do ponto 2");

        return new int[] { x_ponto_Um, y_ponto_Um, x_ponto_Dois, y_ponto_Dois };
    }

    // CALCULA A DISTANCIA DOS PONTOS X E Y DO PLANO
    public static int[] calcularDistancia() {
        int[] distancia = receberPontosPlanoCartesiano();
        int distancia_x = distancia[0] - distancia[2];
        int distancia_y = distancia[1] - distancia[3];

        return new int[] { distancia_x, distancia_y };
    }

    // CALCULA A DISTANCIA ENTRE OS PONTOS
    public static void calcularDistanciaCartesiana() {
        int[] distancia = calcularDistancia();

        int x = distancia[0] * distancia[0] + distancia[1] * distancia[1];

        double distanciaTotal = Math.sqrt(x);

        imprimir("A distancia entre os pontos é " + distanciaTotal);
    }

    // VERIFICA SE UM NUMERO X É POTENCIA DE N
    public static boolean potN(int x, int n) {
        for (int indice = 0; indice < x; indice++) {
            if (Math.pow(n, indice) == x) {
                return true;
            }
        }
        return false;
    }

    // VERIFICA A QUANTIDADE DE NUMEROS DIGITADA PELO USUÁRIO
    public static int conferirQuantidaDeNumerosDigitados() {
        IO.imprimir("digite a quantidade de números que voce irá digitar");
        int qtdNum = lerValorInteiro();
        return qtdNum;
    }

    public static void contagemParEImpar() {
        int n = solicitaValorInteiro("Digite quantos números você vai informar:");
        int[] numeros = lerNumeros(n);

        int qtdPar = contarPares(numeros);
        int qtdImp = contarImpares(numeros);

        imprimir("Números pares digitados:");
        mostrarPares(numeros);

        imprimir("Quantidade de números pares: " + qtdPar);

        imprimir("Números ímpares digitados:");
        mostrarImpares(numeros);

        imprimir("Quantidade de números ímpares: " + qtdImp);
    }

    // le os valores pro array
    public static int[] lerNumeros(int n) {
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = solicitaValorInteiro("Digite o " + (i + 1) + "º número:");
        }
        return numeros;
    }

    // CONFERE SE O NUMERO É PAR OU ÍMPAR
    public static int contarPares(int[] numeros) {
        int cont = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }

    // CONFERE SE O NUMERO E IMPAR
    public static int contarImpares(int[] numeros) {
        int cont = 0;
        for (int num : numeros) {
            if (num % 2 != 0) {
                cont++;
            }
        }
        return cont;
    }

    // IMPRIME OS NUMEROS PARES
    public static void mostrarPares(int[] numeros) {
        for (int num : numeros) {
            if (num % 2 == 0) {
                imprimir("" + num);
            }
        }
    }

    // IMPRIME OS NUMEROS IMPARES
    public static void mostrarImpares(int[] numeros) {
        for (int num : numeros) {
            if (num % 2 != 0) {
                imprimir("" + num);
            }
        }
    }

    // CONFERE VALOR LOGICO
    public static boolean conferirLogico(String texto) {
        if (texto == "verdadeiro") {
            return true;
        } else {
            return false;
        }
    }

    // CONFERE SE UM NUMERO JA ESTA DENTRO DO VETOR
    public static boolean contem(int[] vetor, int valor, int tamanhoAtual) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    // CONFERE SE O NUMERO NAO TEM
    public static void processarNumerosDistintos() {
        int qtd = 0;
        int[] vetorNumeros = new int[20];

        while (qtd < 20) {
            int num = receberInteiro();
            if (!contem(vetorNumeros, num, 20)) {
                vetorNumeros[qtd] = num;
                qtd++;
            } else {
                imprimir("Valor ja digitado");
            }
        }
        for (int indice = 0; indice < qtd; indice++) {
            imprimirValorInteiro(vetorNumeros[indice]);
        }
    }

}