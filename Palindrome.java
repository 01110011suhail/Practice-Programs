import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        int originalNum = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("the number after reversed : " + rev);

        if (originalNum == rev) {
            System.out.println(originalNum + " the number is palindrome");
        } else {
            System.out.println(originalNum + " the number is not a palindrome");
        }
    }
}
