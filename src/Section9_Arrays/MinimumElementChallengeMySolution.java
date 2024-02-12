package Section9_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallengeMySolution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers delimited with comma");
        String[] numbers = scanner.nextLine().split(",");
        System.out.println("Wprowadzono z konsoli: " + Arrays.toString(numbers));
        scanner.close();

        int[] scannedNumbers = readIntegers(numbers);
        System.out.println("Liczby wczytane z konsoli: ");
        printNumbers(scannedNumbers);

        int minimumElement = findMin(scannedNumbers);
        System.out.println("Najmniejszy element tablicy to: " + minimumElement);

    }

    private static int[] readIntegers(String... numbers) {


        int[] numbersArray = new int[numbers.length];
        int i=0;
        for (String number : numbers) {
            numbersArray[i] = Integer.parseInt(number);
            i++;
        }

        return numbersArray;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min=array[i];
            }
        }
        return min;
    }

    private static void printNumbers(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}
