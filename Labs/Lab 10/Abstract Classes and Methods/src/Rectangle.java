public class Rectangle extends Shape2D{

    private double length;
    private double width;

    public Rectangle(String name, boolean isFilled, double width, double length) {
        super(name, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area(){

        return length*width;
    }

    public double perimeter(){

        return 2*(length+width);
    }

    @Override
    public String toString() {

       StringBuilder str = new StringBuilder();
        str.append("Rectangle: \n");
        str.append("Perimeter:" + perimeter() + "\n");
        str.append("Area:" + area() + "\n");
        return str.toString();



    }
}
