package domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula implements BaseEntity<Long> {
	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "cod_curso")
	private Curso curso;
	
	@ManyToOne
	@JoinColumn(name = "cod_alumno")
	private Alumno alumno;
	
	@Column(name = "nota")
	private Double nota;

	@Column(name = "semestre", length = 5, nullable = false)
	private String semestre;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

}
