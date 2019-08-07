public class User
{
    String tempText = "";

    public void setUsername(String temp)
    {
        tempText = temp;
        System.out.println("The string has been sent to the User Class Method setUsername\n");
    }


    public void getUsername()
    {
        System.out.println("This is from the User Class Method getUsername and this is the string sent from Class1: " + tempText +"\n");
    }

    public void callStaticMethod()
    {
        Class1.testStaticMethod();
    }
}