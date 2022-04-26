import java.util.Arrays;

public class CustomArrayList<E> implements DynamicStruct<E> {
    private final static int DEFAULT_CAPACITY = 5;
    private int size;
    private Object[] data;


    public CustomArrayList(int initialCapacity) {

        data = new Object[initialCapacity];
        size = 0;
    }

    public CustomArrayList() {
        this(DEFAULT_CAPACITY);
        size = 0;
    }

    public void add(E value) {
        if (size >= data.length) {
            data = grow(data);
        }
        data[size++] = value;
    }


    private Object[] grow(Object[] oldArray) {
        return Arrays.copyOf(oldArray, oldArray.length * 2);
    }


    public E get(int index) {

        return (E) data[index];
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= data.length)
            throw new IndexOutOfBoundsException();
        size--;
        E value = (E) data[index];
        System.arraycopy(data, index + 1, data, index, size);
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                Arrays.toString(data) +
                '}'
                ;
    }
}
