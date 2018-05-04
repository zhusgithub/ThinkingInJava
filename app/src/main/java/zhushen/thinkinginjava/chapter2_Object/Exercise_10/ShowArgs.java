package zhushen.thinkinginjava.chapter2_Object.Exercise_10;

public class ShowArgs {
    public static void main(String[] args){
        if(args.length < 3) {
            System.err.println("Need 3 arguments");
            System.exit(1);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
