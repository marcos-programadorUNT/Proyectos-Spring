package Root.Modelos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import Root.Modelos.*;

@Entity
@Table(name="solicitudmarcos")
public class msolicitudes {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer numero;
	@Column private Integer cuotas;
	@Column private Double monto;
	@Column private String estado;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dni", referencedColumnName = "dni")
	private mclientes dni;
	
	
	
	public mclientes getDni() {
		return dni;
	}
	public void setDni(mclientes dni) {
		this.dni = dni;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getCuotas() {
		return cuotas;
	}
	public void setCuotas(Integer cuotas) {
		this.cuotas = cuotas;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
