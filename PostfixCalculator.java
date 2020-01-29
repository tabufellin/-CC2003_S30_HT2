import java.util.ArrayList;

public interface PostfixCalculator {
    ArrayList<String> importText();

    boolean validateText(String line);

    int calculate(String line);
}
