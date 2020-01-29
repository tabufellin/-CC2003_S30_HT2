import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;

public class GuatemalanCalculator {
    private QuetzalStack<Integer> resultStack = new QuetzalStack<Integer>();
    ArrayList<String> importText() {
        return //Document data
    }

    boolean validateText(String line) {
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

}
