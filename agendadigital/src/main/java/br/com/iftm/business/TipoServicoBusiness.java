package br.com.iftm.business;

import java.util.List;

import br.com.iftm.entity.TipoServico;

public interface TipoServicoBusiness {
	/**
	 * Método responsável por garantir os parametros obrigatórios, bem como 
	 * solicitar a camada de acesso a dados que persista o Objeto
	 * {@link TipoServico}
	 * 
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 * @throws BusinessException 
	 */
	TipoServico create(TipoServico tipoServico) throws BusinessException;
	
	
	/**
	 * Método responsável por recuperar na base de dados todos os objetos {@link TipoServico}
	 * 
	 * @return Lista de {@link TipoServico}
	 * @throws BusinessException 
	 */
	List<TipoServico> read() throws BusinessException;
	
	/**
	 * Método responsável por recuperar todos os dados do objeto {@link TipoServico},
	 * cujo seu nome possua parte do parametro Nome.
	 * 
	 * @param nome Parte do nome a ser buscado
	 * @return Lista de {@link TipoServico}
	 * @throws BusinessException 
	 */
	List<TipoServico> readByName(String nome) throws BusinessException;
	
	
	/**
	 * Método responsável por persistir (Atualizar) na base de dados o objeto
	 * {@link TipoServico}. 
	 *
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 * @throws BusinessException 
	 */
	TipoServico update(TipoServico tipoServico) throws BusinessException;
	
	/**
	 * Método responsável por excluir na base de dados o objeto {@link TipoServico},
	 * @param id Identificador do objeto {@link TipoServico} caso seja igual ao objeto
	 * buscado, o método irá excluir o objeto {@link TipoServico}
	 * 
	 * @return status
	 * @throws BusinessException 
	 */
	void delete(Integer id) throws BusinessException;
}
