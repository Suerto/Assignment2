////////////////////////////////////////////////////////////////////
// ALBERTO SUAR 2101051
// NENAD RADULOVIC 2101059
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
public class RomanPrinterTest 
{
    @Test
    public void classIsNotNull()
    {
        RomanPrinter obj = new RomanPrinter();
        assertNotNull(obj);
    }
    @Test
    public void testStampaI()
    {
        String res=
            " _____  \n"+
            "|_   _| \n"+
            "  | |   \n"+
            "  | |   \n"+
            " _| |_  \n"+
            "|_____| \n";

        assertEquals(res, RomanPrinter.print(1));
    }

    @Test
    public void testStampaV()
    {
        String res=
            "__      __ \n"+
            "\\ \\    / / \n"+
            " \\ \\  / /  \n"+
            "  \\ \\/ /   \n"+
            "   \\  /    \n"+
            "    \\/     \n";

        assertEquals(res, RomanPrinter.print(5));
    }

    @Test
    public void testStampaX()
    {
        String res=
            "__   __ \n"+
            "\\ \\ / / \n"+
            " \\ V /  \n"+
            "  > <   \n"+
            " / . \\  \n"+
            "/_/ \\_\\ \n";

        assertEquals(res, RomanPrinter.print(10));
    }

    @Test
    public void testStampaL()
    {
        String res=
            " _       \n"+
            "| |      \n"+
            "| |      \n"+
            "| |      \n"+
            "| |____  \n"+
            "|______| \n";

        assertEquals(res, RomanPrinter.print(50));
    }

    @Test
    public void testStampaC()
    {
        String res=
            "  _____  \n"+
            " / ____| \n"+
            "| |      \n"+
            "| |      \n"+
            "| |____  \n"+
            " \\_____| \n";


        assertEquals(res, RomanPrinter.print(100));
    }

    @Test
    public void testStampaD()
    {
        String res=
            " _____   \n"+
            "|  __ \\  \n"+
            "| |  | | \n"+
            "| |  | | \n"+
            "| |__| | \n"+
            "|_____/  \n";
        assertEquals(res, RomanPrinter.print(500));

    }

    @Test
    public void testStampaM()
    {
        String res=
            " __  __  \n"+
            "|  \\/  | \n"+
            "| \\  / | \n"+
            "| |\\/| | \n"+
            "| |  | | \n"+
            "|_|  |_| \n";

        assertEquals(res, RomanPrinter.print(1000));
    }

    @Test
    public void testStampa88()
    {
        String res=
            " _       "+"__   __ "  +"__   __ "  +"__   __ "  + 
            "__      __ "  +" _____  "+" _____  "+" _____  \n"+
            "| |      "+"\\ \\ / / "+"\\ \\ / / "+"\\ \\ / / "+ 
            "\\ \\    / / "+"|_   _| "+"|_   _| "+"|_   _| \n"+
            "| |      "+" \\ V /  " +" \\ V /  " +" \\ V /  " +
            " \\ \\  / /  "+"  | |   "+"  | |   "+"  | |   \n"+
            "| |      "+"  > <   "  +"  > <   "  +"  > <   "  +
            "  \\ \\/ /   "+"  | |   "+"  | |   "+"  | |   \n"+
            "| |____  "+" / . \\  " +" / . \\  " +" / . \\  " +
            "   \\  /    " +" _| |_  "+" _| |_  "+" _| |_  \n"+
            "|______| "+"/_/ \\_\\ "+"/_/ \\_\\ "+"/_/ \\_\\ "+
            "    \\/     " +"|_____| "+"|_____| "+"|_____| \n";

        assertEquals(res, RomanPrinter.print(88));
    }
}
