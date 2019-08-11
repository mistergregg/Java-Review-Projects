class Acer extends LaptopsAbstract
{
    public void type(String aType)
    {
        System.out.println("The tpe of laptop is " + aType);
    }

    public void screenSize(int screenSize)
    {
        System.out.println("The screen size of the laptop is " + screenSize);
    }

    public static void main(String[] args) {
        LaptopsAbstract acer = new Acer();

        acer.type("Acer");
        acer.screenSize(17);
        acer.color("black");
    }
}