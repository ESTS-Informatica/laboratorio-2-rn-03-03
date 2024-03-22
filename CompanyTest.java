

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest
{
    private Company company = new Company();
    private User client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
    private User client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
    private User seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
    private User seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
    
    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(this.company.getClients());
        assertNotNull(this.company.getSellers());
        assertNotNull(this.company.getProperties());
        assertNotNull(this.company.getSells());
    }
    
    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        this.company = company;
        this.client1 = client1;
        this.client2 = client2;
        this.seller1 = seller1;
        this.seller2 = seller2;
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
