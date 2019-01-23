package br.com.iftm.business;

import java.util.List;

import br.com.iftm.entity.PrestadorServico;

public interface PrestadorServicoBusiness {
	/**
	 * Método responsável por garantir os parametros obrigatórios, bem como 
	 * solicitar a camada de acesso a dados que persista o Objeto
	 * {@link PrestadorServico}
	 * 
	 * @param prestador Objeto a ser persistido
	 * @return Objeto persistido
	 * @throws BusinessException 
	 */
	PrestadorServico create(PrestadorServico prestador) throws BusinessException;
	
	
	/**
	 * Método responsável por recuperar na base de dados todos os objetos {@link PrestadorServico}
	 * 
	 * @return Lista de {@link PrestadorServico}
	 * @throws BusinessException 
	 */
	List<PrestadorServico> read() throws BusinessException;
	
	/**
	 * Método responsável por recuperar todos os dados do objeto {@link TipoServico},
	 * cujo seu nome possua parte do parametro Nome.
	 * 
	 * @param nome Parte do nome a ser buscado
	 * @return Lista de {@link TipoServico}
	 * @throws BusinessException 
	 */
	//List<PrestadorServico> readByName(String nome) throws BusinessException;
	
	
	/**
	 * Método responsável por persistir (Atualizar) na base de dados o objeto
	 * {@link PrestadorServico}. 
	 *
	 * @param prestador Objeto a ser persistido
	 * @return Objeto persistido
	 * @throws BusinessException 
	 */
	PrestadorServico update(PrestadorServico prestador) throws BusinessException;
	
	/**
	 * Método responsável por excluir na base de dados o objeto {@link PrestadorServico},
	 * @param id Identificador do objeto {@link PrestadorServico} caso seja igual ao objeto
	 * buscado, o método irá excluir o objeto {@link PrestadorServico}
	 * 
	 * @return status
	 * @throws BusinessException 
	 */
	void delete(Integer id) throws BusinessException;
}
