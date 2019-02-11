package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "Clientes")
@NamedQuery(name="Cliente.findAll", query="SELECT p FROM Cliente p")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
		
		@Id
		private String DNI;
		
		@NotEmpty
		@NotNull
		private String nombre;

		private String direccion;

		@OneToMany(mappedBy = "cliente")
		private List<Servicio> servicios;
		
		private String correo;
		
		public Cliente() {

		}

		public String getDNI() {
			return DNI;
		}

		public void setDNI(String dNI) {
			DNI = dNI;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public List<Servicio> getServicios() {
			return servicios;
		}

		public void setServicios(List<Servicio> servicios) {
			this.servicios = servicios;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		
}
