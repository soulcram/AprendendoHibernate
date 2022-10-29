package br.com.m3Tech.AprendendoHibernate.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.m3Tech.AprendendoHibernate.model.Usuario;
import br.com.m3Tech.AprendendoHibernate.service.IUsuarioService;

@RestController
@RequestMapping(path = "usuario")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping(value="/{id}", produces = "application/json")
    public ResponseEntity<Usuario> getUsuario(@PathVariable  int id) {
		
		Optional<Usuario> optional = usuarioService.findOneById(id);
		
		if(optional.isPresent()) {
			return new ResponseEntity<Usuario>(optional.get(),null,HttpStatus.OK);
		}
		
        return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
    }
	
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Usuario>> findAll(){
		
		List<Usuario> usuarios = usuarioService.findAll();
		
		if(usuarios.isEmpty()) {
			new ResponseEntity<String>("Nenhum Usuario Encontrado",HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<List<Usuario>>(usuarios,HttpStatus.OK);
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> salvarUsuario(@RequestBody Usuario usuario){
		
		usuarioService.save(usuario);
		
		return new ResponseEntity<String>("Usuario salvo com sucesso",HttpStatus.OK);
	}
	
	@DeleteMapping(consumes = "application/json")
	public ResponseEntity<String> deleteUsuario(@RequestBody Usuario usuario){
		
		try {
		usuarioService.delete(usuario);
		}catch(Exception e) {
			new ResponseEntity<String>("Erro ao deletar usuario",HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<String>("Usuario deletado com sucesso",HttpStatus.OK);
	}
	
	@PutMapping(consumes = "application/json")
	public ResponseEntity<String> alterarUsuario(@RequestBody Usuario usuario){
		
		try {
			usuarioService.save(usuario);
		}catch(Exception e) {
			new ResponseEntity<String>("Erro ao alterar usuario",HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<String>("Usuario alterado com sucesso",HttpStatus.OK);
	}


}
