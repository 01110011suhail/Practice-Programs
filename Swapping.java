//swap the number

public class Swapping {

    public static void main(String[] args) {
        int a = 10;
        int b = 23;

        System.out.println("Before the Swapping a= " + a + " b= " + b);

        // logic -1 third variable
        // int temp = b;
        // b = a;
        // a = temp;

        // logic -2 using + & - without third variables
        // a = a + b; // 10+23=33
        // b = a - b; // 33-23=10
        // a = a - b; // 33-10=23

        // logic -3 using * & / without third variables

        // a = a * b; // 10*23=230
        // b = a / b; // 230/23=10
        // a = a / b; // 230/10=23

        // logic -4 using xor

        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;

        // logic -5 using one statemnts

        b = a + b - (a = b);

        System.out.println("After the swapping number a= " + a + " b= " + b);
    }

}
