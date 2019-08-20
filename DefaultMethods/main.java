interface Garage
{
    int cars = 625;
    default void Garage()
    {
        System.out.println("How many Cars do I have in my garage?: " + cars);
    };
}

class UsingGarage implements Garage
{

    void howMany()
    {
        System.out.println("Wow that's a lot of Cars!");
    }
}

class AClass
{
    public static void main(String[] args)
    {
        UsingGarage garage = new UsingGarage();
        garage.Garage();
        garage.howMany();
    }
}