package br.com.iftm.business;

import java.util.List;

import br.com.iftm.entity.Cidade;
import br.com.iftm.enums.Estado;

public interface CidadeBusiness {
	/**
	 * Método responsável por garantir os parametros obrigatórios, bem como 
	 * solicitar a camada de acesso a dados que persista o Objeto
	 * {@link TipoServico}
	 * 
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 * @throws BusinessException 
	 */
	Cidade create(Cidade cidade) throws BusinessException;
	
	/**
	 * Método responsável por recuperar na base de dados todos os objetos {@link Cidade}
	 * 
	 * @return Lista de {@link Cidade}
	 * @throws BusinessException 
	 */
	List<Cidade> read() throws BusinessException;
	
	/**
	 * Método responsável por recuperar todos os dados do objeto {@link Cidade},
	 * cujo seu estado possua parte do parametro Estado.
	 * 
	 * @param estado Parte do nome a ser buscado
	 * @return Lista de {@link Cidade}
	 * @throws BusinessException 
	 */
	List<Cidade> readByEstado(Estado estado) throws BusinessException;
	
	/**
	 * Método responsável por persistir (Atualizar) na base de dados o objeto
	 * {@link Cidade}. 
	 *
	 * @param Cidade Objeto a ser persistido
	 * @return Objeto persistido
	 * @throws BusinessException 
	 */
	Cidade update(Cidade cidade) throws BusinessException;
	
	/**
	 * Método responsável por excluir na base de dados o objeto {@link Cidade},
	 * @param id Identificador do objeto {@link Cidade} caso seja igual ao objeto
	 * buscado, o método irá excluir o objeto {@link Cidade}
	 * 
	 * @return status
	 * @throws BusinessException 
	 */
	void delete(Integer id) throws BusinessException;
}
