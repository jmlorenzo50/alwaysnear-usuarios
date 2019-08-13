package es.alwaysnear.usuarios.dao.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Entidad usuario. Recoge los datos del usuario que accede al sistema
 * @author jmlorenzo
 * @version 1.0
 */
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
	
	/** Identificador de la entidad */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usu_id")
	private Long usuId;
	
	/** Login del usuario */
	@Column(name="usu_login", unique = true, length = 20)
	private String login;
	
	/** El password */
	@Column(name="usu_password", length = 60)
	private String password;
	
	@Column(name="usu_activo")
	private Boolean enabled;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usu_rol", joinColumns = @JoinColumn(name = "usu_id"), 
	inverseJoinColumns = @JoinColumn(name = "rol_id"), 
	uniqueConstraints = {@UniqueConstraint(columnNames = { "usu_id", "rol_id" }) })
	private List<Rol> roles;

	public Long getUsuId() {
		return usuId;
	}

	public void setUsuId(Long usuId) {
		this.usuId = usuId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	public List<Rol> getRoles() {
		return roles;
	}

	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

	private static final long serialVersionUID = 5799868849694405023L;

	
}
