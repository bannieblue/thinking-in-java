package frog;

/**
 * @author bannieblue
 */
public class DataOnly {
    int i;
    double b;
    boolean c;

    class InterClass{
        public  InterClass(){
            DataOnly data = new DataOnly();
            data.i = 1;
            data.b = 2.0;
            data.c = true;
            System.out.println(data.i +","+data.b+","+data.c);
        }
    }

    public static void main(String[] args) {
        DataOnly o = new DataOnly();
        DataOnly.InterClass interClass = o.new InterClass();
    }
}
