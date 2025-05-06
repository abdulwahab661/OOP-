 public abstract class Shape3D extends Shape {

    private double width;
    private double length;
    private double depth;

     public Shape3D(String name, double width, double length, double depth) {
         super(name);
         this.width = width;
         this.length = length;
         this.depth = depth;
     }

     public abstract double volume();

}
