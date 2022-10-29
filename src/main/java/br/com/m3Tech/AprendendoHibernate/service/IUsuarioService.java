package br.com.m3Tech.AprendendoHibernate.service;

import java.util.List;
import java.util.Optional;

import br.com.m3Tech.AprendendoHibernate.model.Usuario;

public interface IUsuarioService {
	
	public void save(Usuario usuario);
	
	public Optional<Usuario> findOneById(Integer idUsuario);
	
	public List<Usuario> findAll();
	
	public void delete(Usuario usu);

}
