class Class1
{
    // Interview Question
    // Is an object a reference?




















    
    public static void main(String[] args)
    {

        // Assigning Objects
        Cellphone android;
        android = new Cellphone("Samsung");
        android.cellType();


        android = new Cellphone("Google");
        android.cellType();


        // Two References to a single object
        Cellphone samsung1, samsung2;
        samsung1 = new Cellphone("Samsung");
        samsung2 = samsung1;

        samsung1.cellType();
        samsung2.cellType();








        // Arithmetic Operators
        int a, b;
        a = 10;
        b = 5;

        // Addition
        System.out.println(a + b);

        // Subtraction
        System.out.println(a - b);

        // Multiplication
        System.out.println(a * b);

        // Division
        System.out.println(a / b);

        // Modulo (Gets the remainder of the division)
        System.out.println(a % b);

        // Order of precedence
        // ( )
        // - (negative value), + (positive value)
        // *, / , %
        // +, -

        // a = 10
        // b = 5
        System.out.println((a - b) % (a * b) / (-a + b));

        System.out.println(5 % 50 / -5);

        System.out.println((5 % 50) / -5);
    }
}