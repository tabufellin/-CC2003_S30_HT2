import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
/**
 * <h1>GuatemalanCalculatorTest</h1>
 * Junit tests for the Guatemalan Calculator methods.
 * <p>
 *
 * @author Sebastian Gonzales (tabufellin) Pablo Ruiz (PingMaster99)
 * @version 1.0
 * @since 2020-02-04
 **/
public class GuatemalanCalculatorTest {

    /**
     * These tests check the stack methods by using GuatemalanCalculator
     * method results, and comparing with expected values.
     */
    @org.junit.Test
    public void validateText() {
        GuatemalanCalculator instance = new GuatemalanCalculator();
        instance.validateText("3 3 +");
        assertEquals(true, instance.validateText("3 3 +"));
    }

    @org.junit.Test
    public void calculate() {
        GuatemalanCalculator instance = new GuatemalanCalculator();
        instance.validateText("3 2 *");
        instance.calculate("");
        assertEquals(6, instance.calculate(""));
    }

    @org.junit.Test
    public void importText() {
        GuatemalanCalculator instance = new GuatemalanCalculator();
        ArrayList<String> text = instance.importText();
        assertEquals(text.get(0), "1 2 + 4 5 *");   // Note, if you use a different data file, this test will fail.
    }

}