import java.util.Arrays;

public class DynamicArray<E> {
    private final static int DEFAULT_CAPACITY = 2;
    private int capacity;
    private int size = 0;
    private Object[] data;


    public DynamicArray(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    public void add(E value) {
        if (data.length <= size) {
            data = grow();
        }
        data[size++] = value;
    }

    private E[] grow() {
        capacity = data.length * 2;
        return (E[]) Arrays.copyOf(data, capacity);

    }

    public E get(int index) {

        return (E) data[index];
    }

    @Override
    public String toString() {
        return "{" +
                Arrays.toString(data) +
                '}'
                ;
    }
}
