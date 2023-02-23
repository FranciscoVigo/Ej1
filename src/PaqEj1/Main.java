package PaqEj1;

public class Main {

    public static void main(String[] args) {
        C1 ob1 = new C1(1,2);
        C1 ob2 = new C1(3,4);
        ob1.cambio1(ob2);
        ob1.cambio2(ob2);
        ob1=ob2;
        ob1.a=23;
    }





}
