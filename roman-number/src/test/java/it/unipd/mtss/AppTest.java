package it.unipd.mtss;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testAppIsNotNull() {
        // Verifica che l'oggetto App non sia null
        App app = new App();
        assertNotNull("L'oggetto App non dovrebbe essere null", app);
    }
}
