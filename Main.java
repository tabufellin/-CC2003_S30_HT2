import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {

        GuatemalanCalculator myCalculator = new GuatemalanCalculator();
        ArrayList <String> textoEnListas = new ArrayList<String>();
        textoEnListas = myCalculator.importText();

        for (int i = 0; i < textoEnListas.size(); i++) {

            String aAnalizar = textoEnListas.get(i);
            int x = 1;

            if(myCalculator.validateText(aAnalizar)) {
                x = myCalculator.calculate(aAnalizar);
                System.out.println("El resultado de la linea " + (i + 1) + " es: " + x);
            } else {
                System.out.println("Se ha encontrado un error en la línea " + (i + 1));
            }
        }
    }
}