import java.util.Scanner;

public class reverseSTring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String str = sc.next();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);

        }
        System.out.println("the String after reverse : " + rev);
    }

}
