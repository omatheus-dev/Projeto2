package main.java.br.com.mfer.services;

package br.com.rpires.services;

import main.java.br.com.mfer.domain.Cliente;
import main.java.br.com.mfer.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author matheus.ferreira
 *
 */
public interface IClienteService {

    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
