package ec.edu.ups.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Pago;
import ec.edu.ups.modelo.Servicio;
import ec.edu.ups.serviciosweb.PagoServicios;


@Stateless
public class PagosDAO {

	@Inject
	private EntityManager em;
	
	public List<Pago> listadoServicios(String cedula) {
		String jpql = "SELECT f FROM Servicio f WHERE f.cliente.DNI = :DNI ";
		Query query = em.createQuery(jpql, Servicio.class);
		query.setParameter(1, cedula);
		List<Servicio> servicios = query.getResultList();
		List<Pago> mostrar = new ArrayList<>();
		for (Servicio pago : servicios) {
			Pago mf = new Pago();
			mf.setCodigo(pago.getCodigoServicio());
			mf.setNombre(pago.getCliente().getNombre());
			mf.setNombreServicio(pago.getTipo());
			mf.setSaldo(pago.getMonto());
			mostrar.add(mf);
		}
		return mostrar;

	}
	
	public List<Servicio> totalServicios(String tipo) {
		String jpql = "SELECT f FROM Servicio f WHERE f.tipo = :tipo ";
		Query query = em.createQuery(jpql, Servicio.class);
		List<Servicio> servicios = query.getResultList();
		return servicios;

	}
	
	public Servicio buscarServicio(String DNI) {
		String jpql = "SELECT f FROM Cliente f WHERE f.DNI = :DNI ";
		Query query = em.createQuery(jpql, Cliente.class);
		query.setParameter("DNI",DNI);
		Servicio servicio = (Servicio) query.getSingleResult();
		return servicio;
	}
	
	/*
	public Integer read(){
		String jpql = "SELECT c FROM Autor c LEFT JOIN FETCH c.libros";
		Query query = em.createQuery(jpql, Autor.class);
		Query query1 = em.createQuery(jpql1, Autor.class);
		List<Autor> autores = query.getResultList();
		List<Autor> autores1 = query1.getResultList();
		List<Integer> totales= new ArrayList<>();
		int autor1=autores.size();
		int a =autores1.size();
		totales.add(autor1);
		totales.add(a);
		
		return totales;
	}
*/

}
