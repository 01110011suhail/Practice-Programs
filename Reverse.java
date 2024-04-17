import java.util.Scanner;

// public class Reverse {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number to reverse : ");
//         int num = sc.nextInt();
//         // int rev = 0;
//         // logic -1 using while loop
//         // while (num != 0) {
//         // rev = rev * 10 + num % 10;
//         // num = num / 10;

//         // }

//         StringBuffer br = new StringBuffer(String.valueOf(num));
//         StringBuffer rev = br.reverse();
//         System.out.println(rev);
//     }

// }

public class Reverse {
    public static void main(String[] args) {
        String str = "012345";
        String rev = "";

        // Iterate through the original string in reverse order and append each
        // character to the reversed string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        // Print the original and reversed strings
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + rev);
    }
}
