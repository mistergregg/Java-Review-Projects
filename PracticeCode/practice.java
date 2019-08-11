import java.util.Scanner;

class Practice
{
    public static void main(String[] args)
    {
        java.util.Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.next());
        int second = Integer.parseInt(scan.next());

        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " * " + second + " = " + (first * second));
        System.out.println(first + " / " + second + " = " + ((double)first / (double)second));
        System.out.println(first + " % " + second + " = " + ((double)first % (double)second));
        scan.close();
    }
}