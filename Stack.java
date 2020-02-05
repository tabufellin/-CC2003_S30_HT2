/**
 * <h1>Stack</h1>
 * Interface that defines the methods used to implement the stack used to store values and calculation results.
 * <p>
 *
 * @author Sebastian Gonzales (tabufellin) Pablo Ruiz (PingMaster99)
 * @version 1.0
 * @since 2020-02-04
 **/
public interface Stack<E> {

    void push (E item);
    E pop();
    E peek();
    boolean empty();
    int size();
}
