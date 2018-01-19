
//Peyton Annett
import java.util.Scanner;

public class ProgramSeven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will be read: ");
        int number = input.nextInt();
        int[] array = new int[number];
        System.out.println("Enter " + array.length + " elements: ");

        filla(array, input);
        
        System.out.println("The contents of the array: ");
        System.out.print(java.util.Arrays.toString(array));

    }

    public static void filla(int[] array, Scanner input) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        double average = (total / array.length);
        System.out.printf("The average is: %.1f", average);
        System.out.printf("\n");
           }
}
