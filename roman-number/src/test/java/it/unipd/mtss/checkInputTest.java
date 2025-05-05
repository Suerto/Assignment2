////////////////////////////////////////////////////////////////////
// ALBERTO SUAR 2101051
// NENAD RADULOVIC 2101059
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class checkInputTest 
{
    @Test
    public void testInputNumeroBordi() 
    {
        assertFalse(checkInput.validaInput(0));       // troppo piccolo
        assertTrue(checkInput.validaInput(1000));     // limite superiore valido
        assertFalse(checkInput.validaInput(1001));    // troppo grande
    }

    @Test
    public void testInputStringaMinuscoli() 
    {
        assertTrue(checkInput.validaInput("ix"));     // minuscoli validi
    }

    @Test
    public void testInputStringaVuota() 
    {
        assertTrue(checkInput.validaInput(""));       // dipende dalla specifica
    }

    @Test
    public void testInputStringaUnCarattereValido() 
    {
        assertTrue(checkInput.validaInput("I"));
    }

    @Test
    public void testInputStringaUnCarattereNonValido() 
    {
        assertFalse(checkInput.validaInput("A"));
    }

    @Test
    public void testInputNumero()
    {
        if(checkInput.validaInput(-12) || !checkInput.validaInput(12))
        {
            fail("Test di checkInput::validaInput(int) fallito!");
        }
    }
    
    @Test
    public void testInputStringa()
    {
        if(checkInput.validaInput("IVXLDCMpt") 
            || !checkInput.validaInput("IVXLDCM"))
        {
            fail("Test di checkInput::validaInput(String) fallito!");
        }
    }

}
