package main.java.br.com.mfer.services;

import main.java.br.com.mfer.dao.IProdutoDAO;
import main.java.br.com.mfer.domain.Produto;
import main.java.br.com.mfer.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
