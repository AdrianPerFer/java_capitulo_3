/******************************************************************************************
 * 1.   Realiza un programa que pida dos números y que luego muestre el                   *
 *      resultado de su multiplicación.                                                   *
 *                                                                                        *
 ******************************************************************************************
 *                                                                    |  |                *
 *                                                                    |  |                *
 *                          @author Adrián Perogil Fernández        *      *              *
 *                                                                   ******               *
 ******************************************************************************************/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Variable Scanner
        Scanner sc = new Scanner(System.in);
        // Try - catch for errors
        try {
        // Input
        System.out.print("First number: ");
        int number_1 = sc.nextInt();
        System.out.print("Second number: ");
        int number_2 = sc.nextInt();    
        // Output
        System.out.println("Result: " + number_1 * number_2);
        } catch (InputMismatchException ex) {
            System.out.println("Wrong input");
        } sc.close();
    }
}