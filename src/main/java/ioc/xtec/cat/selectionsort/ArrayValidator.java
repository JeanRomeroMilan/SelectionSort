package ioc.xtec.cat.selectionsort;

/**
 * Classe que valida un array d'enters.
 *
 * @version 1.0
 * @autor Jean Romero Milan
 */
public class ArrayValidator {

    /**
     * Valida un array per tal de garantir que no sigui nul ni buit.
     *
     * Aquest mètode comprova:
     * 1. Si l'array és nul, llença una excepció `IllegalArgumentException` amb el missatge "L'array no pot ser nul".
     * 2. Si l'array està buit, llença una excepció `IllegalArgumentException` amb el missatge "L'array no pot estar buit".
     *
     * @param arr L'array d'enters a validar.
     * @throws IllegalArgumentException si l'array és nul o buit.
     */
    public void validateArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("L'array no pot ser nul.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("L'array no pot estar buit.");
        }
    }
}