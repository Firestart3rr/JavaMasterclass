package Section14_LambdaExpressionsFunctionalInterfacesAndMethodReferences.LamdaMiniChallenges;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Challenge2 {

    public static void main(String[] args) {

        String sourceText = "1234567890";
        System.out.println(everySecondChar(sourceText));
        System.out.println("---------------");

        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondChar.apply("1234567890"));
        System.out.println("---------------");

        System.out.println(everySecondCharacter(everySecondChar, sourceText));
        System.out.println("---------------");

        Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJava2 = () -> {return "I love Java!";};

        System.out.println(iLoveJava.get());
        System.out.println(iLoveJava2.get());

    }

    public static String everySecondCharacter(Function<String, String> func, String source) {

        return func.apply(source);
    }

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }
}
