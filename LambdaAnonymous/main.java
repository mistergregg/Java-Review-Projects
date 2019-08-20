interface PrintName
{
    public String printUsername(String first, String last);
}

class AClass
{
    public static void main(String[] args)
    {
        PrintName printUsername = (String first, String last) -> 
        {
            return first + " " + last;
        };
    }
}