package ec.edu.ups.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Servicios")
@NamedQuery(name="Servicio.findAll", query="SELECT p FROM Servicio p")
public class Servicio implements Serializable{

	private static final long serialVersionUID = 1L;

    @Id
    private int codigoServicio;
	
	private String tipo;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DNI", nullable=false)
	private Cliente cliente;
	
	
	private Double monto;
	
	public Servicio() {
	
	}

	public int getCodigoServicio() {
		return codigoServicio;
	}



	public void setCodigoServicio(int codigoServicio) {
		this.codigoServicio = codigoServicio;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
}
