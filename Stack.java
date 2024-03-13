package Session_9;
import java.util.*;

public class Stack<E> implements StackInt<E> {
    private List<E> theData;
    
    public Stack() {
        theData = new ArrayList<>();
    }
    
    public E push(E obj) {
        theData.add(obj);
        return obj;
    }

    public boolean isEmpty() {
        return theData.isEmpty();
    }

    public String toString() {
        return theData.toString();
    }

    @Override
    public E peek() {
        if (isEmpty()) {throw new NoSuchElementException();}
        return theData.get(theData.size() - 1);
    }

    @Override
    public E pop() {
        if (isEmpty()) {throw new  NoSuchElementException();}
        return theData.remove(theData.size() - 1);
    }
}
