public class Circle extends Shape2D{

private double radius;

    public Circle(String name, boolean isFilled, double radius) {
        super(name, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
public double area(){

    return radius * radius * Math.PI;

}

    public double circumference(){

        return 2 * radius * Math.PI;

    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        str.append("Circle: \n");
        str.append("Area:" + area() + "\n");
        str.append("Circumference:" + circumference() + "\n");
        return str.toString();



    }
}
