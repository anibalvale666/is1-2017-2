package domain;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name = "curso")
public class Curso implements BaseEntity<Long> {
	@Id
	private Long id;
	
	@Column(name = "codigo", nullable = false)
	private String codigo;
	
	@Column(name = "nombre", length = 128, nullable = false)
	private String nombre;
	
	@Column(name = "creditos", length = 128, nullable = false)
	private Integer creditos;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "prerequisito",
		joinColumns = @JoinColumn(name = "curso_codigo", referencedColumnName = "codigo"),
		inverseJoinColumns = @JoinColumn(name = "prerequisito_codigo",
			referencedColumnName = "codigo"))
	private List<Curso> prerequisitos;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public List<Curso> getPrerequisitos() {
		return prerequisitos;
	}

	public void setPrerequisitos(List<Curso> prerequisitos) {
		this.prerequisitos = prerequisitos;
	}

}
