public class Main {
    public static void main(String[] args) {
        CustomArrayList<Car> transport = new CustomArrayList<>();
        transport.add(new Car());
        transport.add(new Car());
        transport.add(new Car());
//        transport.add(new Plane());

        for (int i = 0; i < 3; i++) {
            ((Car)transport.get(i)).drive();
        }

    }

//class Plane{
//    void fly(){
//        System.out.println("Flying");
//    }

}
