public class Square extends Rectangle{
    // Длина стороны квадрата

    public Square(double a) {
        super(a, a);
    }

    public double getArea() {
        return a * a;
    }
}