package Section14_LambdaExpressionsFunctionalInterfacesAndMethodReferences.LamdaMiniChallenges;

import java.util.Arrays;
import java.util.function.Consumer;

public class Challenge1 {

    public static void main(String[] args) {

        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printThePartsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        printTheParts.accept("Let's split this up into an array");
        System.out.println("---------------");
        printThePartsLambda.accept("Let's split this up into an array");
        System.out.println("---------------");

        Consumer<String> printThePartsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        printThePartsLambda.accept("Let's split this up into an array");
        System.out.println("---------------");


        Consumer<String> printThePartsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        printThePartsLambda.accept("Let's split this up into an array");
    }

}
