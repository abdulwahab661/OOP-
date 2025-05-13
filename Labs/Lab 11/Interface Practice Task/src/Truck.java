public class Truck extends FourWheelVehicles {


    @Override
    public void play() {
        System.out.println("Play Method of Truck.");
    }

    @Override
    public void pause() {
        System.out.println("Pause Method of Truck.");
    }

    @Override
    public void printIt() {
        System.out.println("Print It Method of Truck.");
    }

    @Override
    public void process(Vehicle[] v) {
        System.out.println("Process Vehicle Method of Truck.");
    }
}
