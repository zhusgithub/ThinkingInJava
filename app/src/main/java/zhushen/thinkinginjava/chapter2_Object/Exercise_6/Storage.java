package zhushen.thinkinginjava.chapter2_Object.Exercise_6;

public class Storage {
    String s = "Hello ,  World !";
    int Storage(String s){
        return  s.length();
    }

    void print(){
        System.out.println("Storage(s) = " + Storage(s));
    }

    public static void main(String[] args){
        Storage st = new Storage();
        st.print();
    }
}
