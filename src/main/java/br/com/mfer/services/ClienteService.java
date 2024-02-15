package main.java.br.com.mfer.services;

import main.java.br.com.mfer.dao.IClienteDAO;
import main.java.br.com.mfer.domain.Cliente;
import main.java.br.com.mfer.services.generic.GenericService;

/**
 * @author matheus.ferreira
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        //this.clienteDAO = clienteDAO;
    }
    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }
}
