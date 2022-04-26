public interface DynamicStruct<E> {
    void add(E value);

    E get(int index);

    E remove(int index);

}
