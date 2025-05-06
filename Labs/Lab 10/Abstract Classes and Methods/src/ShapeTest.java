public class ShapeTest {

    public static void main(String[] args){

        public static void shapeCount(Shape[] shapes){


            int circleCount = 1;
            int rectangleCount = 1;
            int sphereCount = 1;
            int cubeCount = 1;

            Shape[] shapes = new Shape[20];

            for (int i = 0; i<shapes.length;i++){

                if(i<5){
                    shapes[i] = new Circle(circleCount++);
                }

                else if(i>6 && i<10){
                    shapes[i] = new Rectangle(rectangleCount++,rectangleCount++);
                }

                else if(i>10 && i <15){
                    shapes[i] = new sphere(sphereCount++);
                }

                else{
                    shapes[i] = new Cube(circleCube++);
                }

            }

            ShapeUtilities su = new ShapeUtilities();
            su.shapeCount(shapes);

       /*Shape shape;
        Shape2D shape2D;
        Shape3D shape3D;

        Circle c1 = new Circle(8);
        c1.setRadius(4);

        Rectangle r1 = new Rectangle(2,4);
        r1.setLength(6);
        r1.setWidth(8);

        Sphere s1 = new Sphere();
        s1.setRadius(5);


        Cube cube = new Cube(8);
        cube.setSide(10);

        System.out.println("-- Circle --");
        System.out.println(  "Circumference: " + c1.circumference());
        System.out.println("Area" + c1.area() + "\n");

        System.out.println(    " -- Rectangle -- ");
        System.out.println(  "Perimeter: "+ r1.perimeter());
        System.out.println(  "Area" + r1.area() + "\n");

        System.out.println(     "-- Sphere --" );
        System.out.println(  "Surface Area:" + s1.area());
        System.out.println(  "Volume" + s1.volume() + "\n");


        System.out.println(  " -- Cube --");
        System.out.println(  "Surface Area: " + cube.area());
        System.out.println(  "Volume: " + cube.volume() + "\n");

        Shape[] shapes;
        shapes = new Shape[20];

        shapes[0]= new Circle(5);
        shapes[1]= new Rectangle(4,6);
        shapes[2]= new Sphere();
        shapes[3]= new Cube(12);
        shapes[4]= new Circle(4);
        shapes[5]= new Sphere();
        shapes[6]= new Cube(6);
        shapes[7]= new Rectangle(8,12);
        shapes[8]= new Circle(8);
        shapes[9]= new Circle(9);
        shapes[10]= new Rectangle(14,10);
        shapes[11]= new Rectangle(8,6);
        shapes[12]= new Sphere();
        shapes[13]= new Cube(4);
        shapes[14]= new Cube(2);
        shapes[15]= new Sphere();
        shapes[16]= new Circle(12);
        shapes[17]= new Circle(15);
        shapes[18]= new Cube(3);
        shapes[19]= new Rectangle(2,2);

        for(Shape shape : shapes) {
            System.out.println(shape);
        }*/




    }
}










