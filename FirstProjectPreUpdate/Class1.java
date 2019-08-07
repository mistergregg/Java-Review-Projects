//Class Methods are used to call methods between different classes.
public class Class1
{
    //Since this method is static it can be accessed in this class without creating an object of this class.
    static void testStaticMethod()
    {
        System.out.println("This is called from a static method in Class1\n");
    }

    //This method is public so we need to create an object of this class to call it.
    public void testPublicMethod()
    {
        System.out.println("This is a public method in Class1\n");
    }

    public static void main(String[] args)
    {
        //Just to show you how different methods are called
        System.out.println("This is called from the main method in Class1\n");


        //This is called from a static method in this class
            testStaticMethod();


        //This creates a new object of this class, Class1
            Class1 class1Object = new Class1();
            System.out.println("Object of Class1 created.\n");


        //This calls the public method in the Class1 object created
            class1Object.testPublicMethod();


        //This creates an object of a class called User
            User aUser = new User();
            System.out.println("This creates an object of a class called User\n");


        //This is calling the method of an object called aUser from class User
            aUser.setUsername("Greg");


        //This calls the method get Username from the class User
            aUser.getUsername();
    }
}