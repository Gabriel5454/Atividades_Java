
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class vetor {
    public static void main(String[]args){
    
         Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Solicita ao usuário a entrada de 10 valores inteiros
        System.out.println("Digite 10 valores inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializa variáveis para calcular soma, maior e menor valor
        int soma = 0;
        int maior = numeros[0];
        int menor = numeros[0];

        // Calcula a soma, o maior e o menor valor
        for (int num : numeros) {
            soma += num;
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        // Exibe a soma
        System.out.println("A soma de todos os valores é: " + soma);

        // Exibe o maior e o menor valor
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

        // Exibe todos os valores com indicações
        System.out.println("Valores inseridos:");
        for (int num : numeros) {
            if (num == maior) {
                System.out.println(num + " (maior)");
            } else if (num == menor) {
                System.out.println(num + " (menor)");
            } else {
                System.out.println(num);
            }
        }

        scanner.close();
}
}
