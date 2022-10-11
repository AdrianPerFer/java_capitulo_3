/******************************************************************************************
 * 2.   Realiza un conversor de euros a pesetas. L acantidad de euros que se quiere       *
 *      convertir debe ser introducida por teclado.                                       *           *
 *                                                                                        *
 ******************************************************************************************
 *                                                                    |  |                *
 *                                                                    |  |                *
 *                          @author Adrián Perogil Fernández        *      *              *
 *                                                                   ******               *
 ******************************************************************************************/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Variable Scanner
        Scanner sc = new Scanner(System.in);
        // Try - catch for errors
        try {
        // Input
        System.out.print("Euros: ");
        float euros = sc.nextFloat();   
        // Output
        System.out.println("Total pesetas: " + euros * 166.386);
        } catch (InputMismatchException ex) {
            System.out.println("Wrong input");
        } sc.close();
    }
}