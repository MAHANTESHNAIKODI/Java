package Leetcode;
public class RomanToNumber {
    int value(char values)
    {
        if (values == 'I')
            return 1;
        if (values == 'V')
            return 5;
        if (values == 'X')
            return 10;
        if (values == 'L')
            return 50;
        if (values == 'C')
            return 100;
        if (values == 'D')
            return 500;
        if (values == 'M')
            return 1000;
        return -1;
    }
    int romanToDecimal(String str)
    {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));

            if (i + 1 < str.length())
            {                               // Getting value of symbol s[i+1]
                int s2 = value(str.charAt(i + 1));
                if (s1 >= s2)
                {                                         // Comparing both value
                    res = res + s1;
                }
                else
                {
                    res = res + s2 - s1;
                     i++;
                }
            }
            else
            {
                res = res + s1;
            }
        }
        return res;
    }





    // Driver Code
    public static void main(String args[])
    {
        RomanToNumber ob = new RomanToNumber();
        String str = "CDM";
        System.out.println("Integer form of Roman Numeral" + " is " + ob.romanToDecimal(str));
    }
}