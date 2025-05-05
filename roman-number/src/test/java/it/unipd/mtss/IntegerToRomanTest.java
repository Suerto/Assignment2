////////////////////////////////////////////////////////////////////
// ALBERTO SUAR 2101051
// NENAD RADULOVIC 2101059
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.fail;
import org.junit.Test;

public class IntegerToRomanTest 
{
    @Test
    public void test()
    {
        String[][] test = {
            {"1", "I"},
            {"2", "II"},
            {"3", "III"},
            {"4", "IV"},
            {"5", "V"},
            {"8", "VIII"},
            {"10", "X"},
            {"14", "XIV"},
            {"15", "XV"},
            {"20", "XX"},
            {"39", "XXXIX"},
            {"50", "L"},
            {"55", "LV"},
            {"72", "LXXII"},
            {"77", "LXXVII"},
            {"91", "XCI"},
            {"99", "XCIX"},
            {"100", "C"},
            {"101", "CI"},
            {"122", "CXXII"},
            {"134", "CXXXIV"},
            {"166", "CLXVI"},
            {"187", "CLXXXVII"},
            {"199", "CXCIX"},
            {"200", "CC"},
            {"222", "CCXXII"},
            {"266", "CCLXVI"},
            {"299", "CCXCIX"},
            {"311", "CCCXI"},
            {"371", "CCCLXXI"},
            {"499", "CDXCIX"},
            {"500", "D"},
            {"708", "DCCVIII"},
            {"710", "DCCX"},
            {"888", "DCCCLXXXVIII"},
            {"894", "DCCCXCIV"},
            {"966", "CMLXVI"},
            {"969", "CMLXIX"},
            {"1000", "M"}
        };

        for(String[] s : test)
        {
            String str = IntegerToRoman.convert(Integer.parseInt(s[0]));
            String s1 = s[1].toString();

            if(str.compareTo(s1)!=0)
            {
                fail("Test fallito al punto "+s[0]+" "+s[1]);
            }
        }
    }
}
