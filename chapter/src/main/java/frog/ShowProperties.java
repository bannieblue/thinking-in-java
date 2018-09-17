package frog;

/**
 * 测试注释<br>
 * 测试Sytems
 * @author bannieblue
 * @version 1.0.0
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
