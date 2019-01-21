package br.com.iftm.controller;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iftm.entity.TipoServico;

@RestController
@RequestMapping(value="tiposervico")
public class TipoServicoRest {
	
	private ArrayList<TipoServico> lista = new ArrayList<>();
	private int indice = 0;
	//create
	@PostMapping(name="create")
	public ResponseEntity<?> create(@RequestBody TipoServico tipoServico){
		if(StringUtils.isEmpty(tipoServico.getNome())) {
			return ResponseEntity.badRequest().body("Nome requerido!");
		}
		tipoServico.setCodigo(indice++);
		lista.add(tipoServico);
		return ResponseEntity.ok(tipoServico);
	}
	
	//read
	@GetMapping
	 public ResponseEntity<?> read(){
		return ResponseEntity.ok(lista);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody TipoServico tipoServico){
		if(tipoServico.getCodigo() == null) {
			return ResponseEntity.badRequest().body("Código requerido!");
		}
		
		if(StringUtils.isEmpty(tipoServico.getNome())) {
			return ResponseEntity.badRequest().body("Nome requerido!");
		}
		
		for (TipoServico tipoServico2: lista) {
			if(tipoServico2.getCodigo().equals(tipoServico.getCodigo())) {
				tipoServico2.setNome(tipoServico.getNome());
			}
		}
		return ResponseEntity.ok(tipoServico);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody TipoServico tipoServico){
		if(tipoServico.getCodigo() == null) {
			return ResponseEntity.badRequest().body("Código requerido!");
		}
		
		for (TipoServico tipoServico2: lista) {
			if(tipoServico2.getCodigo().equals(tipoServico.getCodigo())) {
				lista.remove(tipoServico2);
			}
		}
		return ResponseEntity.ok(tipoServico);
	}
	
}
