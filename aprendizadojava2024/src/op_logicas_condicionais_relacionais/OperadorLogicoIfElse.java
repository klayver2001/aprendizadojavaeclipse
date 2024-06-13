package op_logicas_condicionais_relacionais;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe que demonstra o uso de operadores lógicos e condicionais em Java.
 * Solicita quatro notas de um aluno, calcula a média e determina o resultado
 * (aprovado, em recuperação ou reprovado).
 * Também verifica se todas as notas são maiores ou iguais a 5 e fornece feedback
 * detalhado sobre o desempenho.
 * 
 * @version 1.0
 * @autor Klayver Alencar
 */
public class OperadorLogicoIfElse {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;
        double media = 0;

        try {
            // Solicitação da primeira nota
            System.out.println("Digite a primeira nota do aluno:");
            nota1 = leitor.nextDouble();
            
            // Solicitação da segunda nota
            System.out.println("Digite a segunda nota do aluno:");
            nota2 = leitor.nextDouble();
            
            // Solicitação da terceira nota
            System.out.println("Digite a terceira nota do aluno:");
            nota3 = leitor.nextDouble();
            
            // Solicitação da quarta nota
            System.out.println("Digite a quarta nota do aluno:");
            nota4 = leitor.nextDouble();

            // Cálculo da média
            media = (nota1 + nota2 + nota3 + nota4) / 4;

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
            return;
        } finally {
            leitor.close();
        }

        /**
         * Condições lógicas com IF e ELSE
         */
        if (media >= 7) {
            System.out.println("Aluno aprovado, " + "Média: " + media);
        } else if (media >= 4 && media < 7) {
            System.out.println("Aluno em recuperação: " + "Média: " + media);
        } else {
            System.out.println("Aluno reprovado, " + "Média: " + media);
        }

        /**
         * Exemplo adicional: Verificação de notas individuais
         */
        // Verifica se todas as notas são maiores ou iguais a 5
        if (nota1 >= 5 && nota2 >= 5 && nota3 >= 5 && nota4 >= 5) {
            System.out.println("Aluno teve notas individuais boas.");
        } else {
            System.out.println("Aluno teve ao menos uma nota individual baixa.");
        }

        /**
         * Operadores ternários são para micro validações
         */
        String saidaResultado;
        saidaResultado = media >= 7 ? "Aluno aprovado" : media >= 4 ? "Aluno em recuperação" : "Reprovado";
        System.out.println(saidaResultado);

        /**
         * Exemplo adicional: Condicional aninhada
         */
        if (media >= 9) {
            System.out.println("Excelente desempenho!");
        } else if (media >= 7) {
            System.out.println("Bom desempenho!");
        } else if (media >= 5) {
            System.out.println("Desempenho regular.");
        } else {
            System.out.println("Desempenho insatisfatório.");
        }
    }
}
