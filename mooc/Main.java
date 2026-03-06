package udesc.poo.mooc;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] main) {
        Scanner reader = new Scanner (System.in);
        int first = Integer.valueOf(reader.nextLine());
        int second = Integer.valueOf(reader.nextLine());
        int media = (first + second)/ 2;
        System.out.println("A média é :" + media );
        
        while (true) {
            System.out.println("Shall we carry on?");
            String input = String.valueOf(reader.nextLine());
            input.toLowerCase();
            if (input.equals("no")){
                break;
            }
        }
        System.out.println("Great!");
        int numberOfTimes = Integer.valueOf(reader.nextLine());
        for (int i = 0; i < numberOfTimes; i++){
            printText();
        }
        
    }
    public static void printText(){
        System.out.println("In a hole in the ground there lives a method");
    }


    
}

