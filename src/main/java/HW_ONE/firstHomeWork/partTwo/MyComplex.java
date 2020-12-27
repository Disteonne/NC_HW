package HW_ONE.firstHomeWork.partTwo;


public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        //return imag>=0 ? (imag==1.0 ? "(" + real+ "+i)":"(" + real+ "+"+imag + "i)"):(imag==-1.0 ? "(" + real+ "-i)":"(" + real+imag + "i)");
        return imag>=0 ? "(" + real+ "+"+imag + "i)":"(" + real+imag + "i)";
    }

    public boolean isReal() {
        return real != 0.0;
    }

    public boolean isImaginary() {
        return imag != 0.0;
    }

    public boolean equals(MyComplex o) {
        if (this == o) return true;
        if (o == null ) return false;
        return Double.compare(o.real, real) == 0 &&
                Double.compare(o.imag, imag) == 0;
    }

    public boolean equals(double real,double imag) {
        return this.real == real && this.imag == imag;
    }

    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }

    public double argument(){
        double tg=real/imag;
        return Math.atan(tg)*180/Math.PI;
    }

    public MyComplex add(MyComplex right){
        this.real=real+ right.real;
        this.imag=imag+ right.imag;
        return this;
    }
    public MyComplex subtract(MyComplex right){
        this.real=real- right.real;
        this.imag=imag- right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right){
        return new MyComplex(real+ right.real,imag+ right.imag);
    }
    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(real - right.real,imag - right.imag);
    }
    public MyComplex multiply(MyComplex right){
        double realTemp=this.real;
        this.real=real*right.real-imag*right.imag;
        this.imag=realTemp* right.imag+imag*right.real;
        return this;
    }
    public MyComplex divide(MyComplex right){
        double realTemp=this.real;
        this.real=(real*right.real+imag*right.imag)/Math.pow(right.magnitude(),2);
        this.imag=(right.real*imag-right.imag*realTemp)/Math.pow(right.magnitude(),2);
        return this;
    }
    public  MyComplex conjugate(){
        return new MyComplex(this.real,-this.imag);
    }

}
