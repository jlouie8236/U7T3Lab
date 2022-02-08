import java.util.ArrayList;

public class Digits
{
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * PRECONDITION: num >= 0
     */
    public Digits(int num)
    {
        /* to be implemented in part (a) */
        digitList = new ArrayList<Integer>();
        String number = String.valueOf(num);
        for (int i = 0; i < number.length(); i++)
        {
            digitList.add(Integer.valueOf(number.substring(i, i+1)));
        }
    }
    
    // GETTER METHOD: added to enable test code (not provided in original FRQ)
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing()
    {
        if (digitList.size() == 1)
        {
            return true;
        }
        for (int i = 0; i < digitList.size() - 1; i++)
        {
            if (digitList.get(i + 1) <= digitList.get(i))
            {
                return false;
            }
        }
        return true;
    }
}