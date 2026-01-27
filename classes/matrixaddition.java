class Matrix {
    int a, b, c, d;

    Matrix(int a,int b,int c,int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    Matrix add(Matrix m) {
        return new Matrix(
                this.a = m.a,
                this.b = m.b,
                this.c = m.c,
                this.d = m.d);
    }

    void print() {
        System.out.println(a + " " + b);
        System.out.println(c + " " + d);
    }

}

public class matrixaddition {
    public static void main(String[] args) {
        Matrix A = new Matrix(1, 2, 3, 4);
        Matrix B = new Matrix(5, 6, 7, 8);

        Matrix C = A.add(B);
        C.print();
    }

}
