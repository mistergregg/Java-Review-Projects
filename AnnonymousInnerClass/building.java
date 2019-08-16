abstract class AbstractBuilding
{
    abstract void height(int feet);
}


interface InterfaceBuilding
{
    void height(int feet);
}


class TestAnonymousInner
{
    public static void main(String[] args)
    {
        // Reference a new Abstract class of Abstract Building
        AbstractBuilding bA = new AbstractBuilding()
        {   
            // This method is part of the class that has no name
            void height(int feet)
            {
                System.out.println("The Building is " + feet +
                " feet | This is from Abstract Anonymous Inner Class");
            }

            void Add()
            {

            }

        }; // Must close with semicolon

        int height = 100;
        // Calls height from within the Annonymous Inner Class
        bA.height(height);
        bA.Add();

        // Reference a new Interface from InterfaceBuilding
        InterfaceBuilding bI = new InterfaceBuilding()
        {
            // This is the method height from the unnamed class
            public void height(int feet)
            {
                System.out.println("The Building is " + feet +
                " feet | This is from Interface Anonymous Inner Class");
            }

        }; // Must close with semicolon

        // Calls height from within the Annonymous Inner Class
        bI.height(height);
    }
}