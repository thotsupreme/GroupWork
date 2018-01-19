/*
 * @author Grace Hopper
 */

// This program serves to test the functionality of arrays
import java.util.Scanner;
import java.util.Arrays;
public class Program {
    public static void main(String[] args){
        // the main method asks for the user to define an array length and passes this array to void method Method1
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many numbers will be read >> ");
        int x = input.nextInt();
        int[] array = new int[x];
        Method1(array);
        
    }
    
    public static void Method1(int[] array){
        // this method aske for the user to define a list and uses a for loop to fill the array as defined in the main method
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + array.length + " elements >> ");
        for (int i = 0; i < array.length; i++){
            int y = input.nextInt();
            array[i] = y;
        }
        Method2(array);
    }
    
    public static double Method2(int[] array){
        // this method finds the average of the user's array
        double n = 0;
        for (int i = 1; i < array.length; i++){
            n = array[i] + n;
        }
        
        n = Math.ceil(n/array.length);
        System.out.println("The average is " + n);
        
        Method3(array);
        return n;
    }
    
    public static void Method3(int[] array){
        System.out.print("The array's contents are >> [");
        for (int i = 0; i < array.length; i++){
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("]");
    }
}