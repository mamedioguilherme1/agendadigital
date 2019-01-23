package br.com.iftm.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.iftm.dao.PrestadorServicoDAO;
import br.com.iftm.entity.PrestadorServico;
@Repository
public class PrestadorServicoDAOImpl implements PrestadorServicoDAO{

	private ArrayList<PrestadorServico> lista = new ArrayList<>();
	private int indice = 0;
	
	@Override
	public PrestadorServico create(PrestadorServico prestador) {
		
		prestador.setCodigo(indice++);
		lista.add(prestador);
		return prestador;
	}

	@Override
	public List<PrestadorServico> read() {
		return lista;
	}

	/*@Override
	public List<TipoServico> readByName(String nome) {
		ArrayList<TipoServico> listaRetorno = new ArrayList<>();
		for(TipoServico tipoServico: lista) {
			if(tipoServico.getNome().toUpperCase().contains(nome.toUpperCase()))
				listaRetorno.add(tipoServico);
		}
		return listaRetorno;
	}*/

	@Override
	public PrestadorServico update(PrestadorServico prestador) {
		for (PrestadorServico prestador2: lista) {
			if(prestador2.getCodigo().equals(prestador.getCodigo())) {
				prestador2.setNome(prestador.getNome());
				prestador2.setCidade(prestador.getCidade());
				prestador2.setBairro(prestador.getBairro());
				prestador2.setCep(prestador.getCep());
				prestador2.setTipoLogradouro(prestador.getTipoLogradouro());
				prestador2.setLogradouro(prestador.getLogradouro());
				prestador2.setComplemento(prestador.getComplemento());
				prestador2.setNumero(prestador.getNumero());
				prestador2.setEmail(prestador.getEmail());
				prestador2.setTelefone(prestador.getTelefone());
				prestador2.setTipoServico(prestador.getTipoServico());
				break;
			}
		}
		return prestador;
	}

	@Override
	public void delete(Integer id) {
		for (PrestadorServico prestador: lista) {
			if(prestador.getCodigo().equals(id)) {
				lista.remove(prestador);
				break;
			}
		}
	}
}
