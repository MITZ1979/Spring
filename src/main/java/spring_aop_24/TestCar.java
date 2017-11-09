package spring_aop_24;


public class TestCar {
    public static void main(String[] args) {
        Car car= (Car) new CglibProxy().getProxyObject(new Car());
        car.start();
        car.stop();
    }
}
