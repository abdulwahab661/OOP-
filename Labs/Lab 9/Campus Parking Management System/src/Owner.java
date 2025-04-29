public class Owner extends Person {

 private static int counter=1;
 private String ownerID;

    public Owner(String name) {
        super(name);
        this.ownerID= "O" + String.format("%03d", counter++);
    }




}
