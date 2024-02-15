package main.java.br.com.mfer.dao;

import main.java.br.com.mfer.dao.generic.GenericDAO;
import main.java.br.com.mfer.domain.Venda;
import main.java.br.com.mfer.domain.Venda.Status;
import main.java.br.com.mfer.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author matheus.ferreira
 *
 */
public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {

    @Override
    public Class<Venda> getTipoClasse() {
        return Venda.class;
    }

    @Override
    public void atualiarDados(Venda entity, Venda entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setStatus(entity.getStatus());
    }

    @Override
    public void excluir(String valor) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
        venda.setStatus(Status.CONCLUIDA);
        super.alterar(venda);
    }



}
