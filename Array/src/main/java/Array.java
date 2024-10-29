
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Array {
       public static void main(String[] args) {
        // Parte 1: Adicionar e Exibir Elementos
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.add("Morango");

        System.out.println("Lista de frutas: " + frutas);

        // Parte 2: Remover um Elemento
        frutas.remove(2); // Remove a terceira fruta (índice 2)
        System.out.println("Lista de frutas após remoção: " + frutas);

        // Parte 3: Buscar um Elemento
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de uma fruta para buscar: ");
        String frutaParaBuscar = scanner.nextLine();
        boolean encontrada = buscarFruta(frutas, frutaParaBuscar);
        if (encontrada) {
            System.out.println("A fruta " + frutaParaBuscar + " está na lista.");
        } else {
            System.out.println("A fruta " + frutaParaBuscar + " não está na lista.");
        }

        // Parte 4: Ordenar a Lista
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);
        numeros.add(3);

        Collections.sort(numeros);
        System.out.println("Lista de números ordenada: " + numeros);

        // Parte 5: Contar Elementos
        int quantidadePares = contarPares(numeros);
        System.out.println("Quantidade de números pares na lista: " + quantidadePares);

        scanner.close();
    }

    // Método para buscar uma fruta
    public static boolean buscarFruta(List<String> frutas, String fruta) {
        return frutas.contains(fruta);
    }

    // Método para contar números pares
    public static int contarPares(List<Integer> numeros) {
        int contador = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}
