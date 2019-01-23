package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.entity.Cidade;
import br.com.iftm.enums.Estado;

public interface CidadeDAO {
	
	/**
	 * Método responsavel por persistir os dados na base de dados do objeto {@link Cidade}
	 * 
	 * @param cidade
	 * @param estado
	 * @return {@link Cidade} }Objeto persistido
	 */
	Cidade create(Cidade cidade);
	
	/**
	 * Método responsável por recuperar na base de dados todos os objetos {@link Cidade}
	 * 
	 * @return Lista de {@link Cidade}
	 */
	List<Cidade> read();
	
	/**
	 * Método responsável por recuperar todos os dados do objeto {@link Cidade},
	 * cujo seu nome possua parte do parametro Estado.
	 * 
	 * @param estado Parte do nome a ser buscado
	 * @return Lista de {@link Cidade}
	 */

	List<Cidade> readByEstado(Estado estado);
	
	/**
	 * Método responsável por persistir (Atualizar) na base de dados o objeto
	 * {@link Cidade}. 
	 *
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 */
	Cidade update(Cidade cidade);
	
	/**
	 * Método responsável por excluir na base de dados o objeto {@link Cidade},
	 * @param id Identificador do objeto {@link Cidade} caso seja igual ao objeto
	 * buscado, o método irá excluir o objeto {@link Cidade}
	 * 
	 * @return status
	 */
	void delete(Integer id);
}
