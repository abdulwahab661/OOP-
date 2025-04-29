public class Vehicle {

private String licensePlate;
private String type;
private Owner owner;

    public Vehicle(String licensePlate, String type, Owner owner) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.owner = owner;
    }


    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
