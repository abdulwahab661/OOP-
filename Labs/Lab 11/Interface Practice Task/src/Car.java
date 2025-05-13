public class Car extends FourWheelVehicles {


    @Override
    public void play() {
        System.out.println("Play Method of Car.");
    }

    @Override
    public void pause() {
        System.out.println("Pause Method of Car.");
    }

    @Override
    public void printIt() {
        System.out.println("Print It Method of Car.");
    }

    @Override
    public void process(Vehicle[] v) {
        System.out.println("Process Vehicle Method of Car.");
    }
}
