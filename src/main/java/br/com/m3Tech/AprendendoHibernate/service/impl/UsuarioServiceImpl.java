package br.com.m3Tech.AprendendoHibernate.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.m3Tech.AprendendoHibernate.model.Usuario;
import br.com.m3Tech.AprendendoHibernate.repositories.UsuarioDao;
import br.com.m3Tech.AprendendoHibernate.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public void save(Usuario usuario) {
		usuarioDao.save(usuario);
	}

	@Override
	public Optional<Usuario> findOneById(Integer idUsuario) {
		return usuarioDao.findById(idUsuario);
	}

	@Override
	public List<Usuario> findAll() {
		return usuarioDao.findAll();
	}

	@Override
	public void delete(Usuario usu) {
		usuarioDao.delete(usu);
	}

		

}
