public class Cube extends Shape3D {

private double side;

    public Cube(String name, double width, double length, double depth, double side) {
        super(name, width, length, depth);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double volume() {
        return Math.pow(side,6);
    }

    @Override
    public double area() {
        return 6*(Math.pow(side,4));
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        str.append("Cube: \n");
        str.append("Area:" + area() + "\n");
        str.append("Volume:" + volume() + "\n");
        return str.toString();



    }
}



