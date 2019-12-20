package net.codejava.usuario;

import org.springframework.data.repository.CrudRepository;

//Este framework permite al repositorio heredar de "crudrepository" que conoce los m�todos save(), findall(), findByID() y deleteById()

public interface RepositorioUsuario extends CrudRepository  <Usuario, Long> {

}
