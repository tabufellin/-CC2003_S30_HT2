import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {

        GuatemalanCalculator myCalculator = new GuatemalanCalculator();
        ArrayList <String> textoEnListas = new ArrayList<String>();
        textoEnListas = myCalculator.importText();
 
        for (int i = 0; i < textoEnListas.size()-1; i++) {
            String aAnalizar = textoEnListas.get(i);
            int x = myCalculator.calculate(aAnalizar);
            System.out.println("El resultado de la linea " + (i+1) + "es: "+ x);
        }

    }
}