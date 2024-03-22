

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste testConstructor.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class testConstructor
{
    Property property = new Property("T3 Monte Belo", 150000.0);
    
    /**
     * Construtor default para a classe de teste testConstructor
     */
    public testConstructor()
    {
    }

    @Test
    public void constructorTest() {
        assertEquals("T3 Monte Belo", property.getDescription());
        assertEquals(150000.0, property.getPrice());
    }
    
    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        this.property = property;
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
}