//Class Methods are used to call methods between different classes
public class UsingClassMethods
{
    //Since this method is static it can be accessed in this class without creating an object of this class
    static void testStaticMethod()
    {
        System.out.println("This is called from a static method in UsingClassMethods\n");
    }

    //This method is public so we need to create an object of this class to call it
    public void testPublicMethod()
    {
        System.out.println("This is a public method in UsingClassMethods\n");
    }

    public static void main(String[] args)
    {
        //Just to show you how different methods are called
            System.out.println("This is called from the main method in UsingClassMethods\n");


        //This is called from a static method in this class, UsingClassMethods
            testStaticMethod();


        //This creates a new object of this class, UsingClassMethods
            UsingClassMethods testClassObject = new UsingClassMethods();
            System.out.println("Object of UsingClassMethods created\n");


        //This calls the public method in the UsingClassMethods object created
            testClassObject.testPublicMethod();


        //This creates an object of the class User called aUser
            User aUser = new User();
            System.out.println("This creates an object of a class called User\n");


        //This is calling the setUsername method from the object called aUser
            aUser.setUsername("Greg");


        //This calling the getUsername method from the object called aUser
            aUser.getUsername();
    }
}