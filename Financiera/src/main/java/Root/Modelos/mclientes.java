package Root.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import Root.Modelos.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="clientemarcos")
public class mclientes {

	@Id private Integer dni;
	@Column private String nombres;
	@Column private String correo;
	@OneToOne(mappedBy = "dni")
    private msolicitudes msolicitudes;
	
	@JsonCreator
	public mclientes (@JsonProperty("dni") Integer dni ) {
	    this.dni = dni;
	}
	
	public Integer getDni() {
		return dni;
	}
	public msolicitudes getMsolicitudes() {
		return msolicitudes;
	}
	public void setMsolicitudes(msolicitudes msolicitudes) {
		this.msolicitudes = msolicitudes;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
