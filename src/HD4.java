import java.util.Scanner;

public class HD4 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int val1 = sca.nextInt();
        int val2 = sca.nextInt();
        int val3 = sca.nextInt();
        if (val1 <= val2 && val2 <= val3) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
