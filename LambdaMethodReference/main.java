import java.util.List;
import java.util.Arrays;

class AClass
{
    public static void main(String[] args)
    {
        long start = 0;
        long end = 0;

        List<String> array = Arrays.asList("a","b","c","d","e","f","g","h","i","j");
        
        start = System.currentTimeMillis();
        array.forEach(x ->  System.out.print(x));
        end = System.currentTimeMillis();
        System.out.println(" time " + (end-start));

        start = System.currentTimeMillis();
        array.forEach(System.out::print);
        end = System.currentTimeMillis();
        System.out.println(" time " + (end-start));
    }
}