package app;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;

    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = Math.pow(this.b, 2) - 4* this.a* this.c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant(){
        return this.delta;
    }

    public double getRoot() {
        if (delta == 0) {
            double r = -b / (2 * a);
            return r;
        }
        return 0;
    }

    public double getRoot1(){
        if (delta >= 0) {            
            double r = (-b - Math.sqrt(delta)) / (2 * a);
            return r;
        }
        return 0;
    }

    public double getRoot2(){
        if (delta >= 0) {            
            double r = (-b + Math.sqrt(delta)) / (2 * a);
            return r;
        }
        return 0;
    }
}
