/**
 * Classe principal que executa el programa de selecció i cerca en un array utilitzant SelectionSort.
 * Aquesta classe interactua amb les classes SelectionSort i ArrayValidator per processar les dades.
 *
 * @version 1.0
 * @autor Jean Romero Milan
 */
package ioc.xtec.cat.selectionsort;

import java.util.Scanner;

public class Main {

    /**
     * Punt d'entrada principal al programa.
     *
     * Aquest mètode:
     * 1. Sol·licita al usuari el tamany de l'array.
     * 2. Llegeix els elements de l'array des de l'entrada estàndard.
     * 3. Utilitza la classe `SelectionSort` per buscar un valor en l'array.
     * 4. Utilitza `ArrayValidator` per validar l'array.
     * 5. Mostra l'array original, cerca un valor en l'array i el ordena.
     *
     * @param args Argumentos de línea de comando (no utilitzats directament en aquest exemple).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix la mida de l'array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Introdueix els elements de l'array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        SelectionSort sorter = new SelectionSort();
        ArrayValidator validator = new ArrayValidator();

        try {
            validator.validateArray(array);

            System.out.print("Array original:");
            printArray(array);

            System.out.println("Introdueix un valor a buscar a l'array: ");
            int valueToSearch = scanner.nextInt();

            boolean contains = sorter.contains(array, valueToSearch);
            if (contains) {
                System.out.println("El valor " + valueToSearch + " existeix a l'array.");
            } else {
                System.out.println("El valor " + valueToSearch + " no existeix a l'array.");
            }

            sorter.sort(array);

            System.out.print("Array ordenat:");
            printArray(array);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    /**
     * Imprimeix l'array d'enters a la consola.
     *
     * @param arr L'array d'enters a imprimir.
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}