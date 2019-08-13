import java.util.*;
class Practice1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String temp = scanner.nextLine();

        if(temp.length() > 3)
        {
            String tmpString = temp.substring(temp.length() - 3);
            System.out.println(tmpString + temp + tmpString);
        }

        scanner.close();
    }
}