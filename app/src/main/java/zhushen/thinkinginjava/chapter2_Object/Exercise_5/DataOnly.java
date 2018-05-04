package zhushen.thinkinginjava.chapter2_Object.Exercise_5;

public class DataOnly {
    int i;
    double d;
    boolean b;

    public static void main(String[] args){
        DataOnly d = new DataOnly();
        d.i = 47;
        d.d = 1.1;
        d.b = false;

        System.out.println("d.i = " + d.i);
        System.out.println("d.d = " + d.d);
        System.out.println("d.b = " + d.b);
    }
}
