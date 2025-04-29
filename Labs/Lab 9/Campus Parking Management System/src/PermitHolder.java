public class PermitHolder extends Person {

   private static int counter = 1000;
   private int permitID;

    public PermitHolder(String name) {
        super(name);
        this.permitID = counter++;
    }

    public int getPermitID() {
        return permitID;
    }

    public void setPermitID(int permitID) {
        this.permitID = permitID;
    }

    @Override
    public String toString() {

       StringBuilder str = new StringBuilder();

       str.append(super.toString());
       str.append("Permit ID:"+ permitID);

        return toString();
    }
}
