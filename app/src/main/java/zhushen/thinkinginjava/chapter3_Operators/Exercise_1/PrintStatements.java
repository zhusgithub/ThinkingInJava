package zhushen.thinkinginjava.chapter3_Operators.Exercise_1;

import java.util.Date;
//import static net.mindview.util.Print.*;

public class PrintStatements {
    public static void main(String[] args){
        Date curDate = new Date();
        System.out.println("Hello, it's :" + curDate);
        print(new Date());
    }

    private static void print(Date date) {
        System.out.println("Hello, it's :" + date);
    }
}
