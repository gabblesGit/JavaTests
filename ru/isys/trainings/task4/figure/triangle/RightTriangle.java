package ru.isys.trainings.task4.figure.triangle;

public class RightTriangle extends Triangle {

    public RightTriangle(int l1, int l2 ) {
        super(l1, l2, 90);
    }

    @Override
    public double GetPerimeter() {
        return this.getL1()*this.getL2()/2;
    }

    @Override
    public String toString() {
        return "RightTriangle " + this.getL1() + " " + this.getL2() +  "  Perimeter = " + this.GetPerimeter() + " Area =  " + super.GetArea();
    }

    public void main(String[] args) {

        RightTriangle Rctngl = new RightTriangle(10, 20);

        System.out.println(Rctngl.toString());
    }
}
