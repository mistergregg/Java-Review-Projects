import java.util.Scanner;

class PracticeTwo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.next());
        int second = Integer.parseInt(scan.next());

        if(first == second)
        {
            System.out.println(first + " == " + second);
        }else
        {
            System.out.println(first + " != " + second);
        }

        scan.close();
    }
}