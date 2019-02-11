package ec.edu.ups.modelo;

import java.io.Serializable;

public class Pago {
	
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	
	private String nombre;
	
	private String nombreServicio;

	private Double saldo;

	public Pago() {
		
	}
	
	

	public String getNombreServicio() {
		return nombreServicio;
	}



	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


}
