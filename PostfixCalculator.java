import java.util.ArrayList;
/**
 * <h1>PostfixCalculator</h1>
 * Interface that defines the methods used to implement the postfix calculator in a text document.
 * <p>
 *
 * @author Sebastian Gonzales (tabufellin) Pablo Ruiz (PingMaster99)
 * @version 1.0
 * @since 2020-02-04
 **/
public interface PostfixCalculator {

    ArrayList<String> importText();
    boolean validateText(String line);
    int calculate(String line);

}
