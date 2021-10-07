package illegalTriangleException;

public class TriangleExample {
    private int a,b,c;

    public TriangleExample() {
    }

    public TriangleExample(int a, int b, int c) throws IllegalTriangleException {
        if(a<0||b<0||c<0) {
            throw new IllegalTriangleException("Canh la so am");
        }
        if(a+b<=c || b+c<=a || c+a<=b){
            throw new IllegalTriangleException("Khong thoa man la 3 canh cua tam giac");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
