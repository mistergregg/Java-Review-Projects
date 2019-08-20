class Asserting
{
    static void ofAge(int age)
    {
        assert age > 21 : "The person cant drink";
    }

    public static void main(String[] args)
    {
        int age = 23;

        ofAge(age);

        System.out.println("The person is " + age + " years old and can drink alcohol.");
    }
}