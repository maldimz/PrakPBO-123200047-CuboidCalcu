package bidang;

public class Persegi implements MenghitungBidang {
    private double length, width;

    public Persegi(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    public double area(double a, double b){
        return a * b;
    }
    
    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double circumference() {
        return 2 * (length + width);
    }
}
