import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class PalindromeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String: ");
        String str = sc.next();
        String orgstr = str;
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("String After the Reversed: " + rev);

        if (orgstr.equals(rev)) {
            System.out.println("the String is Palindrome");
        } else {
            System.out.println("The String is not a Palindrome");
        }
    }
}
