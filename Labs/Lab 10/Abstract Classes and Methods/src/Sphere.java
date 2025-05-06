public class Sphere extends Shape3D{

    private double radius;

    public Sphere(String name, double width, double length, double depth, double radius) {
        super(name, width, length, depth);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4/3*Math.PI*radius*radius*radius;
    }

    @Override
    public double area() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        str.append("Sphere: \n");
        str.append("Area:" + area() + "\n");
        str.append("Volume:" + volume() + "\n");
        return str.toString();



    }
}
