////////////////////////////////////////////////////////////////////
// ALBERTO SUAR 2101051
// NENAD RADULOVIC 2101059
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class checkInputTest 
{
    @Test
    public void testInputNumero()
    {
        if(checkInput.validaInput(-12) || !checkInput.validaInput(12))
            fail("Test di checkInput::validaInput(int) fallito!");
    }
    
    @Test
    public void testInputStringa()
    {
        if(checkInput.validaInput("IVXLDCMpt") || !checkInput.validaInput("IVXLDCM"))
            fail("Test di checkInput::validaInput(String) fallito!");
    }

}
