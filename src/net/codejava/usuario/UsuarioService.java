package net.codejava.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//Spring Data JPA genera una implementación automáticamente a la hora de ejecutar la app, cosa que no se necesite crear un DAO.
//Delega todas las operaciones al objeto de tipo RepositorioUsuario

@Service
@Transactional
public class UsuarioService {

	@Autowired RepositorioUsuario repo;
	
	public void save(Usuario usuario) {
	repo.save(usuario);	
	}
	
	public List<Usuario> listAll(){
		return (List<Usuario>) repo.findAll();
	}
	
	public Usuario get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	
}
