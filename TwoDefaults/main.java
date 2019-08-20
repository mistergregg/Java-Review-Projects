interface I1
{
    default void stuff()
    {
        System.out.print("I1 does some stuff");
    }
}

interface I2
{
    default void stuff()
    {
        System.out.print("I2 does some stuff");
    }
}

class AClass implements I1, I2
{
    public void stuff()
    {
        I1.super.stuff();
        System.out.println("");
        I2.super.stuff();
    }

    public static void main(String[] args)
    {
        AClass something = new AClass();
        something.stuff();
    }
}