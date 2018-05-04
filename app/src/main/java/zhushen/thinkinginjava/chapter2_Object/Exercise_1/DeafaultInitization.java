package zhushen.thinkinginjava.chapter2_Object.Exercise_1;

public class DeafaultInitization {
    int i;
    char c;

    public DeafaultInitization() {
        System.out.println("i = " + i);
        System.out.println("c = [" + c + "]");
    }

    public static void main(String[] args){
        new DeafaultInitization();
    }
}
