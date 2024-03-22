

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
    private Property property1 = new Property("Casa1", 150000.0);
    private Property property2 = new Property("Casa2", 170000.0);
    private Sell sell1 = new Sell(client1, seller1, property1);
    private Sell sell2 = new Sell(client2, seller2, property2);
    
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
    
    @Test
    public void testCreateSell() {
        
    }
    
    //Client
    @Test
    public void testRegisterClient() {
        assertTrue(this.company.registerClient(client1));
    }

    @Test
    public void testRegisterClients() {
        assertTrue(this.company.registerClient(client1));
        assertTrue(this.company.registerClient(client2));
    }
    
    @Test
    public void testRegisterClientDuplicate() {
        assertTrue(this.company.registerClient(client1));
        assertFalse(this.company.registerClient(client1));
    }
    
    @Test
    public void testRegisterClientNull() {
        assertFalse(this.company.registerClient(null));
    }
    
    //Seller
    @Test
    public void testRegisterSeller() {
        assertTrue(this.company.registerSeller(seller1));
    }

    @Test
    public void testRegisterSellerss() {
        assertTrue(this.company.registerSeller(seller1));
        assertTrue(this.company.registerSeller(seller2));
    }
    
    @Test
    public void testRegisterSellerDuplicate() {
        assertTrue(this.company.registerClient(seller1));
        assertFalse(this.company.registerClient(seller1));
    }
    
    @Test
    public void testRegisterSellerNull() {
        assertFalse(this.company.registerSeller(null));
    }
    
    // Property
    @Test
    public void testRegisterProperty() {
        assertTrue(this.company.registerClient(client1));
    }

    @Test
    public void testRegisterProperties() {
        assertTrue(this.company.registerClient(client1));
        assertTrue(this.company.registerClient(client2));
    }
    
    @Test
    public void testRegisterPropertyDuplicate() {
        assertTrue(this.company.registerClient(client1));
        assertFalse(this.company.registerClient(client1));
    }
    
    @Test
    public void testRegisterPropertyNull() {
        assertFalse(this.company.registerClient(null));
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
