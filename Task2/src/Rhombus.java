public class Rhombus extends Parallelogram{
    // Длина стороны ромба
    //private final double a;
    // Высота ромба
    //private final double h;

    public Rhombus(double a, double h) {
        super(a, h);
    }

    public double getArea() {
        return a * h;
    }
}