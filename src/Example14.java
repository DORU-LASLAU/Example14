import java.util.Scanner;
class Example14 {
    public static void main(String[] argv) {
        int a,b,c;
        System.out.println("Enter first number:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        a = inputValue.nextInt();
        System.out.println("Enter second number:");
        b = inputValue.nextInt();
        System.out.println("Enter third number:");
        c = inputValue.nextInt();

        if (a >=b && b>=c) {
            System.out.println(" "+c+" "+b+" "+a+" ");
        } else if(a >=c && c>=b) {
            System.out.println(" "+b+" "+c+" "+a+" ");
        } else if(b >=a && a>=c) {
            System.out.println(" "+c+" "+a+" "+b+" ");
        } else if (b>=c && c>=a) {
            System.out.println(" "+a+" "+c+" "+b+" ");
        } else if (c>=a && a>=b) {
            System.out.println(" " + b + " " + a + " " + c + " ");
        } else {
            System.out.println(" " + a + " " + b + " " + c + " ");
        }
    }
}
