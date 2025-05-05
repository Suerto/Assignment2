////////////////////////////////////////////////////////////////////
// ALBERTO SUAR 2101051
// NENAD RADULOVIC 2101059
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter 
{
    public static String print(int num)
    {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber)
    {
        if(!checkInput.validaInput(romanNumber))
            throw new IllegalArgumentException();

        String[] cifra_I={
            " _____  ",
            "|_   _| ",
            "  | |   ",
            "  | |   ",
            " _| |_  ",
            "|_____| "};


        String[] cifra_V={
            "__      __ ",
            "\\ \\    / / ",
            " \\ \\  / /  ",
            "  \\ \\/ /   ",
            "   \\  /    ",
            "    \\/     "};


        String[] cifra_X={
            "__   __ ",
            "\\ \\ / / ",
            " \\ V /  ",
            "  > <   ",
            " / . \\  ",
            "/_/ \\_\\ "};


        String[] cifra_L={
            " _       ",
            "| |      ",
            "| |      ",
            "| |      ",
            "| |____  ",
            "|______| "};


        String[] cifra_C={
            "  _____  ",
            " / ____| ",
            "| |      ",
            "| |      ",
            "| |____  ",
            " \\_____| "};

        String[] cifra_D={
            " _____   ",
            "|  __ \\  ",
            "| |  | | ",
            "| |  | | ",
            "| |__| | ",
            "|_____/  "};

        String[] cifra_M={
            " __  __  ",
            "|  \\/  | ",
            "| \\  / | ",
            "| |\\/| | ",
            "| |  | | ",
            "|_|  |_| "}; 

        StringBuilder risultato= new StringBuilder();

        for(int i=0;i<6;i++)
        {
            for(int ii=0;ii<romanNumber.length();ii++)    
            {
                switch(Character.toString(romanNumber.charAt(ii)))
                {
                    case "I":
                        risultato.append(cifra_I[i]);
                        break;

                    case "V":
                        risultato.append(cifra_V[i]);
                        break;

                    case "X":
                        risultato.append(cifra_X[i]);
                        break;

                    case "L":
                        risultato.append(cifra_L[i]);
                        break;

                    case "C":
                        risultato.append(cifra_C[i]);
                        break;

                    case "D":
                        risultato.append(cifra_D[i]);
                        break;

                    case "M":
                        risultato.append(cifra_M[i]);
                        break;
                }
            }
            risultato.append("\n");
        }

        return risultato.toString();
    }
}
