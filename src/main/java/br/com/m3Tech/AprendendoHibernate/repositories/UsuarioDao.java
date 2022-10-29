package br.com.m3Tech.AprendendoHibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.m3Tech.AprendendoHibernate.model.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Integer>{

}
