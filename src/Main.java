public class Main {
    public static void main(String[] args) {
        DynamicArray transport = new DynamicArray();
        transport.add(new Car());
        transport.add(new Car());
        transport.add(new Car());

        for (int i = 0; i < 3; i++) {
            ((Car)transport.get(i)).drive();
        }

    }
}
