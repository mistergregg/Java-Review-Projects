interface Person
{
    void talks();
}

class Child implements Person
{
    private int movement = 0;

    public void talks()
    {
        System.out.println("Says something");
    }

    public void walks(int speed)
    {
        movement = speed;

        System.out.println(speed);
    }
}

class Adult extends Child
{
    @Override
    public void talks() {
        super.talks();
    }

    @Override
    public void walks(int speed) {
        super.walks(speed);

        speed = speed * 2;

        System.out.println(speed);
    }
}

class theMain
{
    public static void main(String[] args)
    {
        Adult greg = new Adult();
        greg.walks(10);

        Child gregChild = new Child();
        gregChild.walks(10);
    }
}