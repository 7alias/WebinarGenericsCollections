public class CustomLinkedList<E> implements CustomList<E> {

    int size = 0;
    Node<E> first;

    @Override
    public void add(E value) {
        Node<E> last = first;
        if (last == null) {
            first = new Node<>(null, value, null);
        } else {
            while (last.next != null)
                last = last.next;
            last.next = new Node<>(last, value, null);
        }
    }

    @Override
    public E get(int index) {
        return node(index).item;
    }

    @Override
    public E remove(int index) {
        Node<E> x = node(index);
        Node<E> next = x.next;
        Node<E> prev = x.prev;
        E value = x.item;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }
        if (next != null) {
            next.prev = prev;
            x.next = null;
        }
        size--;
        return value;
    }

    private Node<E> node(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        Node<E> curr = first;
        while (curr != null) {
            sb.append(curr.item).append(",");
            curr = curr.next;
        }
        sb.append("}");
        return sb.toString();
    }
}