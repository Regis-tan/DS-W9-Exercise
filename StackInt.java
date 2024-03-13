package Session_9;
public interface StackInt<E> {
    E push(E object);
    E peek();
    E pop();
    boolean isEmpty();
}    