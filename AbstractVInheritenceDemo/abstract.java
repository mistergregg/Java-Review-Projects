abstract class LaptopsAbstract
{
    String color = "black";

    public void color(String aColor)
    {
        System.out.println("The laptop color is " + aColor);
    }

    abstract public void type(String aType);

    abstract public void screenSize(int screenSize);
}