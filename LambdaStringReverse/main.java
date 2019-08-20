import java.io.*;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

interface I1
{
    void reverseLetter(String aString);
}

class AClass
{
    public String reverseLetter(String s)
    {
        return Arrays.stream(s.split(" ")).map(str -> new StringBuilder(str).reverse.toString());
    }
    public static void main(String[] args)
    {

    }
}