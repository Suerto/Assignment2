////////////////////////////////////////////////////////////////////
// ALBERTO SUAR 2101051
// NENAD RADULOVIC 2101059
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;



public class IntegerToRoman 
{
    public static String convert(int number)
    {
        if(!checkInput.validaInput(number))
            throw new IllegalArgumentException();

        int[] valori =    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,   5,  4,  1};
        String[] simboli = {"M", "CM", "D", "CD", "C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder risultato = new StringBuilder();

        for (int i = 0; i < valori.length; i++) {
            while (number >= valori[i]) {
                number -= valori[i];
                risultato.append(simboli[i]);
            }
        }

        return risultato.toString();
    }
}
