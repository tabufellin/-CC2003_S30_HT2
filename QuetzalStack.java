import java.util.ArrayList;
/**
 * <h1>QuetzalStack</h1>
 * This class contains the methods that define available operations on the stack.
 * <p>
 *
 * @author Sebastian Gonzales (tabufellin) Pablo Ruiz (PingMaster99)
 * @version 1.0
 * @since 2020-02-04
 **/
public class QuetzalStack<E> implements Stack<E> {
    private ArrayList<E> stackArray = new ArrayList<E>();

    /**
     * This method is used to push items into the stack.
     * @param item the item to be pushed into the stack.
     */
    public void push(E item) {
        stackArray.add(item);
    }

    /**
     * This method is used to pop (remove) the last item from the stack.
     * @return E generic type with the contents of the last item.
     */
    public E pop() {
        return stackArray.remove(stackArray.size() - 1);
    }

    /**
     * This method is used to obtain the last element in the stack
     * without removing it.
     * @return E generic type with the contents of the last item.
     */
    public E peek() {
        return stackArray.get(stackArray.size() - 1);
    }

    /**
     * This method checks if the stack is empty or not.
     * @return boolean true-> stack is empty false-> it is not.
     */
    public boolean empty() {

        if(stackArray.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * This method is used to obtain the amount of elements
     * in the stack.
     * @return int number of elements in the stack.
     */
    public int size() {
        return stackArray.size();
    }

}
