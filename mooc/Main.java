
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

/*
    SPEED RUN DE POO
*/
public class Main {
    public static void main(String[] main) {
        int [] array = {5,1,3,4,2};
        printInStars(array);
    }

    public static void lessonOne() {
        Scanner reader = new Scanner(System.in);
        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());
        int media = (first + second) / 2;
        System.out.println("A média é :" + media);

        while (true) {
            System.out.println("Shall we carry on?");
            String input = String.valueOf(reader.nextLine());
            input.toLowerCase();
            if (input.equals("no")) {
                break;
            }
        }
        System.out.println("Great!");
        int numberOfTimes = Integer.valueOf(reader.nextLine());
        for (int i = 0; i < numberOfTimes; i++) {
            printText();
        }

    }

    public static void printText() {
        System.out.println("In a hole in the ground there lives a method");
    }

    public static void tryList() {
        ArrayList<String> newList = new ArrayList<>();
        newList.add("Lucas Amorim");
        for (String s : newList) {
            System.out.println(s);
        }
        List<String> newList1 = new ArrayList<>();
        ArrayList<Integer> newList2 = new ArrayList<>();
        Integer x = 5;
        newList1.add("Hi");
        newList1.get(0);

    }

    public static void thirdElement() {
        ArrayList<String> listOfElements = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        String current;
        do {
            current = reader.nextLine();
            listOfElements.add(current);
        } while (!(current.equals("")));
        if (listOfElements.size() < 3) {
            System.out.println("It doesn't have 3 elements in the list!");
        } else {

            System.out.println(listOfElements.get(2));
        }
    }

    public static void secondPlusThird() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> listOfInts = new ArrayList<>();
        int input;
        do {
            input = reader.nextInt();
            listOfInts.add(input);
        } while (input != 0);
        if (listOfInts.size() < 3) {
            System.out.println("The size of the list aint big enough for the operation!");
        } else {
            System.out.println(listOfInts.get(1) + listOfInts.get(2));
        }
    }

    public static void listSize() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> newList = new ArrayList<>();
        String input;
        do {
            input = reader.nextLine();
            newList.add(input);
        } while (input != "");
        System.out.println(newList.size());
    }

    public static void onlyTheseNumbers() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> newList = new ArrayList<>();
        int input;
        do {
            input = reader.nextInt();
            newList.add(input);
        } while (input != -1);
        System.out.println("From where?");
        int start = reader.nextInt();
        System.out.println("To where");
        int end = reader.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.println(newList.get(i));
        }
    }

    public static void smallestNumber() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> newList = new ArrayList<>();
        int input;
        do {
            input = reader.nextInt();
            newList.add(input);
        } while (input != 9999);
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i) < min) {
                min = newList.get(i);
                index = i;
            }
        }
        System.out.println("The min is " + min);
        System.out.println("Found at " + index);
    }

    public static void sumOfAList() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> newList = new ArrayList<>();
        int input = 0;
        do {
            input = reader.nextInt();
            newList.add(input);
        } while (input != -1);
        int sum = 0;
        for (int x : newList) {
            sum += x;
        }
        System.out.println(sum);
    }

    public static void testingRemove() {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> integerList = new ArrayList<>();
        stringList.add("HI there");
        stringList.add("Hi");
        stringList.add("There");
        stringList.remove("HI there");
        integerList.add(10);
        integerList.add(13);
        integerList.add(14);
        integerList.remove(1);
        integerList.remove(Integer.valueOf(14));

        for (String s : stringList) {
            System.out.println(s);
        }
        for (Integer i : integerList) {
            System.out.println(i);
        }
    }

    public static void onTheList() {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        String input;
        do {
            input = reader.nextLine();
            names.add(input);
        } while (!(input.equals("")));
        System.out.println("Search for? ");
        String name = reader.nextLine();
        if (names.contains(name)) {
            System.out.println(name + " was found!");
        } else {
            System.out.println("Name wasnt found");
        }
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return;
        }
        strings.remove(strings.size() - 1); // como é passado por refêrencia, não é criado uma cópia da lista no próprio
                                            // metódo, mas sim na lista passado como parametro original.
    }

    public static void array() {
        int[] array = new int[2];
    }

    public static void swapIndex() {
        Scanner reader = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = reader.nextInt();
        }
        for (int x : array) {
            System.out.println(x);
        }
        System.out.println("Give two indices to swap:");
        int index1 = reader.nextInt();
        int index2 = reader.nextInt();
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        for (int x : array) {
            System.out.println(x);
        }
        System.out.println(array.length);
        // array é passado como referencia também
    }

    public static void printInStars(int[] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i]; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
