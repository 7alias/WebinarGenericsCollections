import java.util.Arrays;

public class DynamicArray {
    private int size;
    private Object[] data;


    public DynamicArray(int initialCapacity) {
        data = new Object[initialCapacity];
        size = 0;
    }

    public DynamicArray() {
        this(2);
    }

    public void add(Object value) {
        if (data.length <= size) {
            data = grow(data);}
            data[size++] = value;
        }
    public Object get(int index) {

    return data[index];
    }



    private Object[] grow(Object[] oldArray) {
        return Arrays.copyOf(oldArray, oldArray.length * 2);

    }

    @Override
    public String toString() {
        return "{"+
                 Arrays.toString(data)+
                '}'
                ;
    }
}
