class Singleton
{
    public static void main(String[] args) 
    {
        EnumCount one = EnumCount.INSTANCE;
        EnumCount two = EnumCount.INSTANCE;

        one.AddCount();
        one.AddCount();
        one.AddCount();

        System.out.println("The count of two is " + two.getCount());
    }
}

enum EnumCount {
    INSTANCE;

    private int count = 0;

    public void AddCount()
    {
        count++;
    }

    public int getCount()
    {
        return count;
    }
}