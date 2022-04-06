package ruang;
import bidang.Persegi;

public class Balok extends Persegi implements MenghitungRuang {
    private double height;

    public Balok(double height, double length, double width) {
        super(length, width);
        this.height = height;
    }
    
    @Override
    public double surfaceArea() {
        return 2*(super.area()+super.area(super.getLength(), height)+super.area(super.getWidth(), height));
    }

    @Override
    public double volume() {
        return super.area() * height;
    }
}
