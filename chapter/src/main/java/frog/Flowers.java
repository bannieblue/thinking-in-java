package frog;

/**
 * @author bannieblue
 */
public class Flowers {
    int petalCount = 0;
    String s = "initial value";

    Flowers(int petals){
        this.petalCount = petals;
        System.out.println("int args only");
    }
    Flowers(String ss){
        this.s = ss;
        System.out.println("string args only");
    }

    Flowers(int petals,String ss){
//        this.s = ss;//报错，只能this(petal)放在首行
        this(petals);
//        this(ss);//报错
        this.s = ss;
        System.out.println("string and int args");
    }
}
