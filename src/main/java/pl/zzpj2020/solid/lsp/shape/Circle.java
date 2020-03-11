package pl.zzpj2020.solid.lsp.shape;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return Math.PI * 2.0 * radius;
    }
}
