import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
    A class that is used to get a text from a file .txt
    with a form of representing some numbers sumatory and
    calculation
    for example we have
    3 4 +
    that means 3 + 4 
    we use stack to create this procesure
    this will be explained in calculate method

*/
public class GuatemalanCalculator {

    /*
        variable that is using a class that give the ability to stack
        because java dont include a stack class we created it
        it will be used in method "calculate"
    */
    private QuetzalStack<Integer> resultStack = new QuetzalStack<Integer>();


    /*
        get the string of a .txt
        then get for lines
        and put in a arraylist of strings  
        @return datosEnArrayList that is the class
                that have the String of all text 
                segmentated by lines in an arraylist
                each element is a line a substring

    */
    public ArrayList<String> importText() {

        String direccion = "texto.txt";
        String datosDocumento = leerTxt(direccion);

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

            if (largoValor > 1) {
                if (x.contains(salto) == false) {
                    datosDocumento = insertString(datosDocumento, salto, (i+contadorCuantosSaltos*salto.length() )*2);
            
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
        int firstNumber = 0;
        int secondNumber = 0;
        int result = -1;
        String dataArray[] = line.split(" ");

        for(int i = 0; i < dataArray.length; i++) {
            String arrayLocation = dataArray[i];
            switch (arrayLocation) {
                case "0": case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9":
                case "-1": case "-2": case "-3": case "-4": case "-5": case "-6": case "-7": case "-8": case "-9":
                    int number = Integer.parseInt(arrayLocation);
                    resultStack.push(number);
                    break;

                case "+":
                    try {
                        firstNumber = resultStack.pop();
                        secondNumber = resultStack.pop();
                        resultStack.push(firstNumber + secondNumber);
                    } catch (Exception e) {
                        return false;
                    }
                    break;

                case "-":
                    try {
                        firstNumber = resultStack.pop();
                        secondNumber = resultStack.pop();
                        resultStack.push(secondNumber - firstNumber);
                    } catch (Exception e) {
                        return false;
                    }
                    break;

                case "*":
                    try {
                        firstNumber = resultStack.pop();
                        secondNumber = resultStack.pop();
                        resultStack.push(firstNumber * secondNumber);
                    } catch (Exception e) {
                        return false;
                    }
                    break;

                case "/":
                    try {
                        firstNumber = resultStack.pop();
                        secondNumber = resultStack.pop();
                        resultStack.push(secondNumber / firstNumber);
                    } catch (Exception e) {
                        return false;
                    }
                    break;

                default:
                    return false;    // If it finds an invalid symbol, it returns false.
            }
        }
        return true;    // If the calculation is valid, true is returned.
    }

    // Este metodo unicamente retorna la ultima posicion del stack, debido a que validate ya realiza el calculo.
    // Esto evita que se tenga que calcular dos veces lo mismo.
    int calculate(String line) {
        return resultStack.peek();
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

    /*
        This class is usefull to insert a letter in every part of a string 
        that you want in a way that of it works the .split in strings
        but it just add info

        @params originalString -->The String you wanna change
                stringToBeInserted --> what you what to put between
                index --> in which position
        @return newString --> the modified string

    */
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
