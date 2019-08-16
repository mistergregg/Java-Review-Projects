import java.util.Scanner;

class Exercise1
{
    static class Onion
    {
        static public String first()
        {
            return "I have cute the onion!";
        }

        static public String second()
        {
            return "I have fried the onion!";
        }

        static public String third()
        {
            return "Together, we have cooked onion!";
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        scan.close();

        System.out.println("The absolute value of " + number + " is " + Math.abs(number));
   
        
        System.out.println(Onion.first() + " " + Onion.second() + " " + Onion.third());
    }
}