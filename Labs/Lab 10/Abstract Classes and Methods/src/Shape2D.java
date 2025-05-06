public abstract class Shape2D extends Shape {

    private boolean isFilled;

    public Shape2D(String name, boolean isFilled) {
        super(name);
        this.isFilled = isFilled;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
}
