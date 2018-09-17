package frog;

/**
 * @author bannieblue
 */
public class Counter {
    int i;
    Counter(){
        System.out.println(i);
        i = 7;
        System.out.println(i);
    }
    public static void main(String[] args) {
        Counter c = new Counter();
    }
}
