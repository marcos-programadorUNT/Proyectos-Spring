package Root.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import Root.Modelos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="cliente")
public class mclientes {

	@Id private Integer dni;
	@Column private String nombres;
	@Column private String correo;
	
	
	@OneToMany(mappedBy="mclientes")
	private List<msolicitudes> listadoSolicitudes;


	public Integer getDni() {
		return dni;
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


	@JsonManagedReference
	public List<msolicitudes> getListadoSolicitudes() {
		return listadoSolicitudes;
	}


	
	public void setListadoSolicitudes(List<msolicitudes> listadoSolicitudes) {
		this.listadoSolicitudes = listadoSolicitudes;
	}



	



	



	


	


	
	
	
	
}
