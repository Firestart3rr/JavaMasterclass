package Section9_Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallengeExerciseMySolution {

    public static void main(String[] args) {
        int[] testArray = getRandomArray(5);
        System.out.println("-".repeat(10) + "INITIAL ARRAY" + "-".repeat(10));
        System.out.println(Arrays.toString(testArray));

        System.out.println("-".repeat(10) + "SORTED ARRAY" + "-".repeat(10));
        Arrays.sort(testArray);
        System.out.println(Arrays.toString(testArray));
        System.out.println("-".repeat(10) + "REVERSED ARRAY" + "-".repeat(10));
        int[] reversedArray = new int[testArray.length];
        for (int i = 0; i < testArray.length; i++) {
            reversedArray[testArray.length - i -1] = testArray[i];
        }
        System.out.println(Arrays.toString(reversedArray));
    }

    private static int[] getRandomArray(int arraysLength) {
        Random random = new Random();
        int[] randomArray = new int[arraysLength];
        for (int i = 0; i < arraysLength; i++) {
            randomArray[i] = random.nextInt(1, 101);
        }
        return randomArray;
    }
}
