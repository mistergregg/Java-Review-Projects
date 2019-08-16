import java.util.Scanner;

/**
 * {@summary}The Letter swap class
 */
public class LetterSwap
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence: ");



        String word = scan.nextLine();
        
        reverse(word);
    }

    /**
     * 
     * @param word
     * @return The word you sent reversed
     * Example: Hello would become olleH
     * @author Gregory Reed
     */
    static public String reverse(String word)
    {
        StringBuffer wordBuf = new StringBuffer(word);
        StringBuffer newWord = new StringBuffer("");

        for(int i = wordBuf.length()- 1; i >= 0; i--)
        {
            newWord.append(wordBuf.charAt(i));
        }

        return newWord;
    }
}