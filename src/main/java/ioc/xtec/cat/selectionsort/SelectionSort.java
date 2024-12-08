package ioc.xtec.cat.selectionsort;
/**
 * Classe que implementa l'algoritme de Selection Sort per ordenar un array d'enters.
 *
 * @version 1.0
 * @autor Jean Romero Milan
 */
public class SelectionSort {

    /**
     * Ordena un array d'enters mitjançant l'algoritme de Selection Sort.
     * Recorre l'array per trobar el menor element en cada iteració i el canvia amb el primer element no ordenat.
     *
     * @param arr L'array d'enters a ordenar.
     */
    public void sort(int[] arr) {
        System.out.println("Jean Romero Milan");
        System.out.println("He aprés molt fent el mòdul 8 de DAW encara que hagi estat dur!!!");
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiar els elements
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Verifica si un array conté un valor específic.
     *
     * @param arr L'array d'enters on buscar.
     * @param value El valor a buscar.
     * @return `true` si el valor es troba en l'array, `false` en cas contrari.
     * @throws IllegalArgumentException si l'array és nul.
     */
    public boolean contains(int[] arr, int value) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }

        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}

