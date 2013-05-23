/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controleatleta;

import javax.swing.JLabel;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edinho
 */
public class ValidacaoCadastroJogadorVoleiTest {
    
    public ValidacaoCadastroJogadorVoleiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMensagemErro method, of class ValidacaoCadastroJogadorVolei.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testGetMensagemErro() {
        System.out.println("getMensagemErro");
        ValidacaoCadastroJogadorVolei instance = new ValidacaoCadastroJogadorVolei();
        String expResult = "";
        String result = instance.getMensagemErro();
        assertEquals(expResult, result);
    }

}