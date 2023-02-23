package PaqEj1;

public class C1 {
    int a;
    int b;

    public C1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void cambio1 (C1 c){
        c.a=5;
    }
    public void cambio2 (C1 c){
        c =new C1(7,8);
    }
}
