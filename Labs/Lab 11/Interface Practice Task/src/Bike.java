public class Bike extends TwoWheelVehicles {


    @Override
    public void parkingMethod() {
        System.out.println("Parking Method of Bike.");
    }

    @Override
    public void play() {
        System.out.println("Play Method of Bike.");
    }

    @Override
    public void pause() {
        System.out.println("Pause Method of Bike.");
    }

    @Override
    public void printIt() {
        System.out.println("Print It Method of Bike.");
    }

    @Override
    public void doIt() {
        System.out.println("Do It Method of Bike.");

    }

    @Override
    public void process(Vehicle[] v) {
        System.out.println("Process Vehicle Method of Bike.");
    }
}
