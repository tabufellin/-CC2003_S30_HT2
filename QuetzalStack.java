import java.util.ArrayList;

public class QuetzalStack<E> implements Stack<E> {
    private ArrayList<E> stackArray = new ArrayList<E>();

    public void push(E item) {
        stackArray.add(item);

    }

    public E pop() {
        return stackArray.remove(stackArray.size() - 1);
    }

    public E peek() {
        return stackArray.get(stackArray.size() - 1);
    }

    public boolean empty() {

        if(stackArray.isEmpty()) {
            return true;
        }
        return false;
    }

    public int size() {
        return stackArray.size();
    }

}
