////////////////////////////////////////////////////////////////////
// ALBERTO SUAR 2101051
// NENAD RADULOVIC 2101059
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;


public class checkInput 
{
    public static boolean validaInput(int num)
    {
        if(num<=0 || num>1000)
        {
            return false;
        }
        return true;
    }

    public static boolean validaInput(String str)
    {
        str = str.toUpperCase();
        for(int i=0;i<str.length();i++)
        {
            if(!"IVXLCDM".contains(Character.toString(str.charAt(i))))
            {
                return false;
            }
        }
        return true;
    }
}
