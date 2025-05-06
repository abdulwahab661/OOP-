public class ShapeUtilities {

    public static void shapeCount(Shape[] shapes) {
        int rCount = 0;
        int cCount = 0;
        int sCount = 0;
        int cuCount = 0;

        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] instanceof Rectangle) {
                rCount++;
            }
            else if(shapes[i] instanceof Circle) {
                cCount++;
            } else if (shapes[i] instanceof  Sphere) {
                sCount++;
            }
            else {
                cuCount++;
            }
        }
        System.out.println("Shape Count: \n" );
        System.out.println("Rectangle Count: " + rCount);
        System.out.println("Circle Count: " + cCount);
        System.out.println("Sphere Count: " + sCount);
        System.out.println("Cube Count: " + cuCount);
    }




}
