package br.com.iftm.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.com.iftm.business.BusinessException;
import br.com.iftm.business.PrestadorServicoBusiness;
import br.com.iftm.dao.PrestadorServicoDAO;
import br.com.iftm.entity.PrestadorServico;
import br.com.iftm.entity.Telefone;
import br.com.iftm.entity.TipoServico;

@Service
public class PrestadorServicoBusinessImpl implements PrestadorServicoBusiness{
	
	@Autowired
	private PrestadorServicoDAO dao;
	
	@Override
	public PrestadorServico create(PrestadorServico prestador) throws BusinessException {
		if(StringUtils.isEmpty(prestador.getNome())) {
			throw new BusinessException("Nome requerido");
		}
		if(prestador.getCidade() == null || prestador.getCidade().getCodigo() == null) {
			throw new BusinessException("Código cidade requerido");
		}
		if(StringUtils.isEmpty(prestador.getBairro())) {
			throw new BusinessException("Bairro requerido");
		}
		if(prestador.getTipoLogradouro() == null) {
			throw new BusinessException("Tipo Logradouro requerido");
		}
		if(StringUtils.isEmpty(prestador.getLogradouro())) {
			throw new BusinessException("Logradouro requerido");
		}
		if(prestador.getTelefone() == null || prestador.getTelefone().isEmpty()) {
			throw new BusinessException("Pelo menos um telefone é requerido");
		}
		
		for (Telefone telefone : prestador.getTelefone()) {
			if(telefone.getDdd() == null) {
				throw new BusinessException("DDD Requerido.");
			}
			if(telefone.getNumero() == null) {
				throw new BusinessException("Numero Telefone Requerido.");
			}
		}
		if(prestador.getTipoServico() == null || prestador.getTipoServico().isEmpty()) {
			throw new BusinessException("Prestador Serviço Requerido");
		}
		
		for (TipoServico tipoServico : prestador.getTipoServico()) {
			if(tipoServico.getCodigo() == null) {
				throw new BusinessException("Código Prestador Serviço é Requerido.");
			}
		}
		return dao.create(prestador);
	}

	@Override
	public List<PrestadorServico> read() throws BusinessException {
		return dao.read();
	}

	@Override
	public PrestadorServico update(PrestadorServico prestador) throws BusinessException {
		if(StringUtils.isEmpty(prestador.getNome())) {
			throw new BusinessException("Nome requerido");
		}
		if(prestador.getCidade() == null || prestador.getCidade().getCodigo() == null) {
			throw new BusinessException("Código cidade requerido");
		}
		if(StringUtils.isEmpty(prestador.getBairro())) {
			throw new BusinessException("Bairro requerido");
		}
		if(prestador.getTipoLogradouro() == null) {
			throw new BusinessException("Tipo Logradouro requerido");
		}
		if(StringUtils.isEmpty(prestador.getLogradouro())) {
			throw new BusinessException("Logradouro requerido");
		}
		if(prestador.getTelefone() == null || prestador.getTelefone().isEmpty()) {
			throw new BusinessException("Pelo menos um telefone é requerido");
		}
		
		for (Telefone telefone : prestador.getTelefone()) {
			if(telefone.getDdd() == null) {
				throw new BusinessException("DDD Requerido.");
			}
			if(telefone.getNumero() == null) {
				throw new BusinessException("Numero Telefone Requerido.");
			}
		}
		if(prestador.getTipoServico() == null || prestador.getTipoServico().isEmpty()) {
			throw new BusinessException("Prestador Serviço Requerido");
		}
		
		for (TipoServico tipoServico : prestador.getTipoServico()) {
			if(tipoServico.getCodigo() == null) {
				throw new BusinessException("Código Prestador Serviço é Requerido.");
			}
		}
		return dao.update(prestador);
	}

	@Override
	public void delete(Integer id) throws BusinessException {
		if(id == null) {
			throw new BusinessException("ID não encontrado");
		}
		dao.delete(id);
	}

}
