class Mac implements LaptopInterface
{
    public void color(String aColor)
    {
        System.out.println("The color is " + aColor);
    }

    public void type(String aType)
    {
        System.out.println("The type is " + aType);
    }

    public void screenSize(int screenSize)
    {
        System.out.println("The screen size is " + screenSize);
    }

    public static void main(String[] args) {
        LaptopInterface aMac = new Mac();

        aMac.color("White");
        aMac.type("Mac");
        aMac.screenSize(13);
    }
}