public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
