public class ParkingZone {

private String zoneId;
private static int counter = 0;
private Vehicle vehicles[] = new Vehicle[5];
private int index = 0;

    public ParkingZone() {

        this.zoneId ="Z" + counter++;
    }

    public void addVehicle(Vehicle v){

        vehicles[index++]=v;

    }




}
