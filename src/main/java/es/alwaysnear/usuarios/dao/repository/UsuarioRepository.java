package es.alwaysnear.usuarios.dao.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import es.alwaysnear.usuarios.dao.entity.Usuario;

@RepositoryRestResource(path="usuarios")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {

	@RestResource(path="buscar-login")
	public Usuario findByLogin(@Param("login") String login);
	
	@Query("select u from Usuario u where u.login=?1")
	public Usuario obtenerPorLogin(String login);
	
}
