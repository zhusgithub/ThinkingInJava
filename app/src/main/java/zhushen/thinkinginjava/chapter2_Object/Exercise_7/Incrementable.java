package zhushen.thinkinginjava.chapter2_Object.Exercise_7;

public class Incrementable {
    static void increment(){
        StaticTest.i++;
    }


    public static void main(String[] args){
        Incrementable sf = new Incrementable();
        sf.increment();
        Incrementable.increment();
        increment();
    }
}


class StaticTest{
    static int i = 47;
}
