package projava;

public class IfSample {
    public static void main(String[] args) {
        var a = 8;
        if (a < 3) {
            System.out.println("小");
        } else if (a < 7) {
            System.out.println("中");
        } else {
            System.out.println("大");
        }
    }
}
