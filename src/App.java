import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        int choice = 0;
        DynamicStringArray toDoList = new DynamicStringArray();

        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("1. Add to do\n2 Show All\n3. Delete\n4.Exit");

                choice = sc.nextInt();
                if (1 == choice) {
                    System.out.println("Enter new ToDo");
                    sc.nextLine();
                    toDoList.add(sc.nextLine());
                } else if (2 == choice) {
                    System.out.println(toDoList.toString());
                } else if (3 == choice){
                    System.out.println("Write ToDo number");
                    toDoList.remove(sc.nextInt());
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input");
                break;
            };
        } while (4 != choice);
    }

/*
    public static String[] growArray(String oldArray[]) {
//        int grow = oldArray.length + 1;
//        String[] newArray = new String[grow];
//        for (int i = 0; i < oldArray.length; i++) {
//            newArray[i] = oldArray[i];
//        }
//        return newArray;
        return Arrays.copyOf(oldArray, oldArray.length*2);
    }*/

}
