class TryNCatch
{
    public static void main(String[] args)
    {
        try{
            int temp = 10 / 0;
        }catch(ArithmeticException e)
        {
            System.out.println("You tried to divide by 0");
        }finally
        {
            System.out.println("What happens after");
        }

        try {
            int[] array = new int[] {4, 5, 6};

            int temp = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You tried to get a number out of the array");
        }finally
        {
            System.out.println("What happens after");
        }
    }
}