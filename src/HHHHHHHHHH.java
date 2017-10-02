import java.util.Scanner;

public class HHHHHHHHHH {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if (ch - 'A' >= 0 && ch - 'A' < 26) {
            System.out.println("大寫");

            System.out.println((char) ('a' + (ch - 'A')));
        } else{
            if (ch - 'a' >= 0 && ch - 'a' < 26){
                System.out.println("小寫");
            }else{
                System.out.println("other");
            }

        }

    }
}
