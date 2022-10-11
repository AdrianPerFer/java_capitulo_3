/******************************************************************************************
 * 3.   Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere     *
 *      convertir debe ser introducida por teclado.                                       *
 *                                                                                        *
 ******************************************************************************************
 *                                                                    |  |                *
 *                                                                    |  |                *
 *                          @author Adrián Perogil Fernández        *      *              *
 *                                                                   ******               *
 ******************************************************************************************/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Variable Scanner
        Scanner sc = new Scanner(System.in);
        // Try - catch for errors
        try {
        // Input
        System.out.print("Pesetas: ");
        float pesetas = sc.nextFloat();   
        // Output
        System.out.println("Total euros: " + pesetas / 166.386);
        } catch (InputMismatchException ex) {
            System.out.println("Wrong input");
        } sc.close();
    }
}