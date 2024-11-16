public class Rectangle extends Parallelogram{
    // Длины сторон прямоугольника
    int w;
    int h;

    private final double b;

    public Rectangle(double a, double b) {
        super(a, b);
        this.b = b;
    }
    @Override
    public double getArea() {
        return a * b;
    }
}