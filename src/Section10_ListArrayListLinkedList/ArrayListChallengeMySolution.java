package Section10_ListArrayListLinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallengeMySolution {

    public static void main(String[] args) {

        List<String> groceryList = new ArrayList<>();

        boolean flag = true;
        while(flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Available actions:");
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list (comma delimited list)");
            System.out.println("2 - to remove any items (comma delimited list");
            System.out.println("Enter a number for which action you want to do");
            String action = scanner.nextLine();

            switch (action) {
                case "0" -> {
                    System.out.println("0 is choosen - Program is shutting down");
                    scanner.close();
                }
                case "1" -> {
                    System.out.println("1 is choosen - Please input groceries you want to add, delimitted by commas");
                    String input = scanner.nextLine();
                    addItems(groceryList, input);
                    printItems(groceryList);
                }
                case "2" -> {
                    System.out.println("2 is choosen - Please input groceries you want to remove, delimitted by commas");
                    String input = scanner.nextLine();
                    removeItems(groceryList, input);
                    printItems(groceryList);
                }
            }
            if("0".equals(action)) flag = false;
        }
    }

    private static List<String> addItems(List<String> groceryList, String ipnut) {
        String[] splits = ipnut.toUpperCase().split(",");
        for (String split : splits) {
            if(!groceryList.contains(split)) {
                groceryList.add(split);
            }
        }
        groceryList.sort(Comparator.naturalOrder());
        return groceryList;
    }

    private static List<String> removeItems(List<String> groceryList, String ipnut) {
        String[] splits = ipnut.toUpperCase().split(",");
        for (String split : splits) {
            if(groceryList.contains(split)) {
                groceryList.remove(split);
            }
        }
        groceryList.sort(Comparator.naturalOrder());
        return groceryList;
    }


    private static void printItems(List<String> list) {
        System.out.println(list);
    }
}
