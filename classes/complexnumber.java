class Complex {
    int real;
    int imag;

    Complex(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    Complex add(Complex c){
        return new Complex(real+ c.real, imag+c.imag);
    }

    Complex subtract(Complex c){
        return new Complex(real - c.real , imag - c.imag);
    }

    Complex multiply(Complex c){
        int r = (real * c.real - imag * c.imag);
        int i = (real * c.imag - imag * c.real);
        return new Complex(r, i);
    }

    void print(){
        System.out.println(real + "+" + imag + "i" );
    }

}

public class complexnumber {
    public static void main(String[] args) {

        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);

        System.out.print("Addition: ");
        c1.add(c2).print();

        System.out.print("Subtraction: ");
        c1.subtract(c2).print();

        System.out.print("Multiplication: ");
        c1.multiply(c2).print();
    }

}
