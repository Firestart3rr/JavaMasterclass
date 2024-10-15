package Section14_LambdaExpressionsFunctionalInterfacesAndMethodReferences.LambdaChallenge;

import java.util.ArrayList;
import java.util.List;

public class ChallengeMySolution {

    public static void main(String[] args) {

        String[] names = new String[]{"Bob", "Rob", "Mark", "John", "Angelique", "Diana", "Geoffrey", "Anna", "Kevin", "Naomie"};

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-".repeat(30));

        List<String> list = new ArrayList<>(List.of(
                names
        ));

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("-".repeat(30));

        list.replaceAll(name -> name.toUpperCase());

        list.forEach(s -> System.out.println(s));
        System.out.println("-".repeat(30));

        list.replaceAll(name -> name + " - " + reverseName(name));
        list.forEach(s -> System.out.println(s));
        System.out.println("-".repeat(30));
    }

    private static String reverseName(String name) {
        char[] n = name.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            sb.append(n[i]);
        }

        return sb.toString();
    }
}
