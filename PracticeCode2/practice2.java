class Practice2
{
    public static void main(String[] args)
    {
        int[] array = {5,7,2,4,9};

        int even = 0;
        int odd = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Number of even elements in the array: " + even);
        System.out.println("Number of odd elements in the array: " + odd);
    }
}