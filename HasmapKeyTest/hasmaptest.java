import java.util.HashMap;

class HashMapTest
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> test = new HashMap<String, Integer>();

        test.put("Parlin", 1);
        test.put("Place", 1);

        Object temp = test.get("Parlin");

        if(temp != null)
        {
            System.out.println("Yes it does! The value is " + temp);
        }

        temp = test.get("Morganville");

        if(temp == null)
        {
            System.out.println("No it does not! Try Again");
        }
    }
}
