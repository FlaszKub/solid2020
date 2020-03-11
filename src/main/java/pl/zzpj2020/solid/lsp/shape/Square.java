package pl.zzpj2020.solid.lsp.shape;

public class Square extends Figure {
    private double sideLenght;

    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    @Override
    public double getArea() {
        return sideLenght * sideLenght;
    }

    @Override
    public double getCircumference() {
        return 4.0 * sideLenght;
    }
}
