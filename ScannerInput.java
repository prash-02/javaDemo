import java.util.Scanner;
class ScannerInput {
    public static void main(String[] args) {
        Scanner scanfff=new Scanner(System.in);
        System.out.println("Enter Your x");
        int x=scanfff.nextInt();
        System.out.println("x is "+x);

        System.out.println("Enter Avg");
        double a=scanfff.nextDouble();
        System.out.println("Avg is"+a);

        System.out.println("Enter String");
        String b=scanfff.next();
        System.out.println("b "+b);

    }
}
