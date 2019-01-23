package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.entity.PrestadorServico;

public interface PrestadorServicoDAO {

	/**
	 * Método responsavel por persistir os dados na base de dados do objeto {@link PrestadorServico}
	 * 
	 * @param prestador
	 * @return {@link PrestadorServico} }Objeto persistido
	 */
	PrestadorServico create(PrestadorServico prestador);
	
	/**
	 * Método responsável por recuperar na base de dados todos os objetos {@link PrestadorServico}
	 * 
	 * @return Lista de {@link PrestadorServico}
	 */
	List<PrestadorServico> read();
	
	/**
	 * Método responsável por recuperar todos os dados do objeto {@link PrestadorServico},
	 * cujo seu nome possua parte do parametro Estado.
	 * 
	 * @param estado Parte do nome a ser buscado
	 * @return Lista de {@link Cidade}
	 */

	//List<PrestadorServico> readByEstado(Estado estado);
	
	/**
	 * Método responsável por persistir (Atualizar) na base de dados o objeto
	 * {@link PrestadorServico}. 
	 *
	 * @param PrestadorServico Objeto a ser persistido
	 * @return Objeto persistido
	 */
	PrestadorServico update(PrestadorServico prestador);
	
	/**
	 * Método responsável por excluir na base de dados o objeto {@link PrestadorServico},
	 * @param id Identificador do objeto {@link PrestadorServico} caso seja igual ao objeto
	 * buscado, o método irá excluir o objeto {@link PrestadorServico}
	 * 
	 * @return status
	 */
	void delete(Integer id);
}
