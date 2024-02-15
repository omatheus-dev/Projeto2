package main.java.br.com.mfer.dao;

import main.java.br.com.mfer.dao.generic.IGenericDAO;
import main.java.br.com.mfer.domain.Venda;
import main.java.br.com.mfer.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author matheus.ferreira
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
