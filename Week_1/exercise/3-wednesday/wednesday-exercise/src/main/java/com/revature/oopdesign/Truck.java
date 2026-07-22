public class Truck extends Vehicle implements Driveable {

    public Truck(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println(model + " truck is starting.");
    }

    @Override
    public void accelerate() {
        speed += 10.0;
        System.out.println(model + " truck accelerated to " + speed + " mph.");
    }

    @Override
    public void stop() {
        speed = 0.0;
        System.out.println(model + " truck has stopped.");
    }

    @Override
    public void soundHorn() {
        System.out.println("HOOONK!");
    }
}