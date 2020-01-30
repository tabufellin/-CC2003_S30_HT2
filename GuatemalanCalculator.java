import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.io.*;

public class GuatemalanCalculator {
    private QuetzalStack<Integer> resultStack = new QuetzalStack<Integer>();

    public ArrayList<String> importText() {

        String direccion = "C:/Users/dsgsp/OneDrive/Documentos/progra/Estructuras/semana3/3/-CC2003_S30_HT2/texto.txt";
        String datosDocumento = leerTxt(direccion);
        String datosEnArray[] = datosDocumento.split(" ");
        ArrayList<String> datosEnArrayList = new ArrayList();
        for (int i = 0; i >= datosEnArray.length; i++) {
            datosEnArrayList.add(datosEnArray[i]);
            System.out.println(datosEnArrayList.get(1));
        }
        //System.out.println(datosEnArray.length);
        
        return datosEnArrayList;
    }

    boolean validateText(String line) {

        // incompleto

        return true;
    }

    int calculate(String line) {

        int result = -1;
        for(int i = 0; i < line.length(); i++) {
            char character = line.charAt(i);
            switch (character) {
                case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
                    int number = Character.getNumericValue(character);
                    // hacer push en el stack

            }

        }

        return result;
    }

    public String leerTxt (String direccion ) {

        String texto = "";




        try {

            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;

            while((bfRead = bf.readLine()) != null) {

                temp = temp + bfRead; // aquí lo guarda en temp
            }

            texto = temp;



        } catch (Exception e) {
            System.err.println("No se encontro un archivo");

        }

        return texto;

    }

}
