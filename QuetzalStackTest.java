import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * <h1>QuetzalStackTest</h1>
 * Junit tests for the stack methods.
 * <p>
 *
 * @author Sebastian Gonzales (tabufellin) Pablo Ruiz (PingMaster99)
 * @version 1.0
 * @since 2020-02-04
 **/
public class QuetzalStackTest {
    /**
     * These tests check the stack methods by using QuetzalStack
     * method results, and comparing them with expected values.
     */
    @Test
    public void push() {
        QuetzalStack<Integer> instance = new QuetzalStack<>();
        instance.push(99);
        int x = instance.peek();
        assertEquals(99,x);
    }

    @Test
    public void pop() {
        QuetzalStack<Integer> instance = new QuetzalStack<>();
        instance.push(1234);
        instance.push(4321);
        instance.pop();
        int x = instance.peek();
        assertEquals(1234, x);
    }

    @Test
    public void peek() {
        QuetzalStack<Integer> instance = new QuetzalStack<>();
        instance.push(987654321);
        int x = instance.peek();
        assertEquals(987654321, x);
    }

    @Test
    public void empty() {
        QuetzalStack<Integer> instance = new QuetzalStack<>();
        assertEquals(true, instance.empty());
    }

    @Test
    public void size() {
        QuetzalStack<Integer> instance = new QuetzalStack<>();
        instance.push(1);
        instance.push(2);
        instance.push(3);
        instance.push(4);
        assertEquals(4, instance.size());
    }
}