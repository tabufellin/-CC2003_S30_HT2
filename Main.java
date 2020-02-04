import java.util.ArrayList;
/**
 * <h1>Main</h1>
 * This is the main class to run the postfix calculator; it displays
 * the result of calculations present in a txt file called "datos.txt".
 * <p>
 *
 *
 * @author Sebastian Gonzales (tabufellin) Pablo Ruiz (PingMaster99)
 * @version 1.0
 * @since 2020-01-19
 **/
public class Main {
    public static void main (String[] args) {
        // Initializes the calculator and imports text
        GuatemalanCalculator myCalculator = new GuatemalanCalculator();
        ArrayList<String> textoEnListas = new ArrayList<String>();
        textoEnListas = myCalculator.importText();

        for (int i = 0; i < textoEnListas.size(); i++) {
            String aAnalizar = textoEnListas.get(i);    // Gets the required line
            int x = 1;

            // Validates and performs the operation
            if(myCalculator.validateText(aAnalizar)) {
                x = myCalculator.calculate(aAnalizar);  // Line to analyze
                System.out.println("El resultado de la linea " + (i + 1) + " es: " + x);
            } else {
                System.out.println("Se ha encontrado un error en la línea " + (i + 1));
                System.out.println("Recuerde solamente incluir caracteres soportados y eliminar cualquier espacio" +
                        " adicional, como por ejemplo: '3 3 + '. Lo correcto es: '3 3 +' sin espacio.");
                break;  // If there's an error, the program is stopped.
            }
        }
    }
}