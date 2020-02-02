import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GuatemalanCalculator {
    private QuetzalStack<Integer> resultStack = new QuetzalStack<Integer>();


// done importTExt()
    public ArrayList<String> importText() {

        String direccion = "C:/Users/dsgsp/OneDrive/Documentos/progra/Estructuras/semana3/3/-CC2003_S30_HT2/texto.txt";
        String datosDocumento = leerTxt(direccion);
        System.out.println("lo que hay en el documento es:");
        System.out.println(datosDocumento);
        String datosEnArray[] = datosDocumento.split(" ");
        ArrayList<String> datosEnArrayList = new ArrayList();
        String salto = "S";
        int largoValor;

        int contadorCuantosSaltos = 0;



        // first we will insert "S" between 2 following characters joined with no space
        // because that is a linejump
        for (int i = 0; i < datosEnArray.length; i++) {
            String x = datosEnArray[i];
            largoValor = x.length();
            System.out.println(largoValor);
            if (largoValor > 1) {
                if (x.contains(salto) == false) {
                    datosDocumento = insertString(datosDocumento, salto, (i+contadorCuantosSaltos*salto.length() )*2);
                    System.out.println(datosDocumento);
                    contadorCuantosSaltos++;
                }

            }
            largoValor = 0;
        }    

        datosEnArray = datosDocumento.split(salto);

        for (int i = 0; i < datosEnArray.length; i++) {
            datosEnArrayList.add(datosEnArray[i]);
        }

        return datosEnArrayList;
    }

    boolean validateText(String line) {

        // incompleto

        return true;
    }

    int calculate(String line) {
        int firstNumber = 0;
        int secondNumber = 0;
        int result = -1;

        for(int i = 0; i < line.length(); i++) {
            char character = line.charAt(i);
            switch (character) {
                case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
                    int number = Character.getNumericValue(character);
                    resultStack.push(number);
                    break;

                case '+':
                    firstNumber = resultStack.pop();
                    secondNumber = resultStack.pop();
                    resultStack.push(firstNumber + secondNumber);
                    break;

                case '-':
                    firstNumber = resultStack.pop();
                    secondNumber = resultStack.pop();
                    resultStack.push(firstNumber - secondNumber);
                    break;

                case '*':
                    firstNumber = resultStack.pop();
                    secondNumber = resultStack.pop();
                    resultStack.push(firstNumber * secondNumber);
                    break;

                case '/':
                    firstNumber = resultStack.pop();
                    secondNumber = resultStack.pop();
                    resultStack.push(firstNumber / secondNumber);
                    break;

                default:
                    return -1000101;    // Error code (binary E) used to signify an invalid line calculation. 
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

    public static String insertString( String originalString, String stringToBeInserted, int index)  { 
        // Create a new StringBuffer 
        StringBuffer newString 
            = new StringBuffer(originalString); 
  
        // Insert the strings to be inserted 
        // using insert() method 
        newString.insert(index + 1, stringToBeInserted); 
  
        // return the modified String 
        return newString.toString(); 
    } 
  

}
