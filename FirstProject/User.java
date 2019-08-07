//This is the User class as its own file
//It consists of a name string and two methods one to set it and one to retrieve it
public class User
{
    String name = "";

    public void setUsername(String tempName)
    {
        name = tempName;
        System.out.println("The string has been sent to the User class method setUsername\n");
    }


    public void getUsername()
    {
        System.out.println("This is from the User class method getUsername and this is the string sent from UsingClassMethods: " + name +"\n");
    }
}