package zhushen.thinkinginjava.chapter2_Object.Exercise_8;

public class StaticTest {
    static int i = 47;
    public static void main(String[] args){
        StaticTest staticTest1 = new StaticTest();
        StaticTest staticTest2 = new StaticTest();
        System.out.println(staticTest1.i + " == " + staticTest2.i);
        staticTest1.i++;
        System.out.println(staticTest1.i + " == " + staticTest2.i);
    }
}
