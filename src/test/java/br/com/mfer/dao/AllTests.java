package test.java.br.com.mfer.dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author matheus.ferreira
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
        ProdutoServiceTest.class, ProdutoDAOTest.class,
        VendaDAOTest.class})
public class AllTests {

}
