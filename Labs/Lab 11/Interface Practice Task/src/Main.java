public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicle = new Vehicle[10];

        vehicle[0] = new Bike();
        vehicle[1] = new Car();
        vehicle[2] = new Truck();
        vehicle[3] = new Car();
        vehicle[4] = new Bike();
        vehicle[5] = new Truck();
        vehicle[6] = new Car();

        MultiMedia m = new MultiMedia() {
            @Override
            public void play() {
                System.out.println("Play Method of MultiMedia.");
            }

            @Override
            public void pause() {
                System.out.println("Pause Method of MultiMedia.");
            }
        };

        /*public static void processVehicles(){

            //Call Play Method of MultiMedia
            m.play();


        }

        public void processPrintable(){





        }*/

        Doable d = () -> System.out.println("Doable Functional Interface");
        d.doIt();

        ProcessVehicle p = (y)-> {for(Vehicle v : y){
        v.drive();
        }
         };

         p.process(vehicle);


    }
}
