package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.entity.TipoServico;

public interface TipoServicoDAO {
	
	/**
	 * Método responsável por persistir o objetvo ({@link TipoServico} na base de dados
	 * 
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 */
	TipoServico create(TipoServico tipoServico);
	
	
	/**
	 * Método responsável por recuperar na base de dados todos os objetos {@link TipoServico}
	 * 
	 * @return Lista de {@link TipoServico}
	 */
	List<TipoServico> read();
	
	/**
	 * Método responsável por recuperar todos os dados do objeto {@link TipoServico},
	 * cujo seu nome possua parte do parametro Nome.
	 * 
	 * @param nome Parte do nome a ser buscado
	 * @return Lista de {@link TipoServico}
	 */
	List<TipoServico> readByName(String nome);
	
	
	/**
	 * Método responsável por persistir (Atualizar) na base de dados o objeto
	 * {@link TipoServico}. 
	 *
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 */
	TipoServico update(TipoServico tipoServico);
	
	/**
	 * Método responsável por excluir na base de dados o objeto {@link TipoServico},
	 * @param id Identificador do objeto {@link TipoServico} caso seja igual ao objeto
	 * buscado, o método irá excluir o objeto {@link TipoServico}
	 * 
	 * @return status
	 */
	void delete(Integer id);
}
