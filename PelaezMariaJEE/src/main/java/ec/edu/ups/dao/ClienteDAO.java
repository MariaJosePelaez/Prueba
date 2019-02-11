package ec.edu.ups.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Servicio;

@Stateless
public class ClienteDAO {

	@Inject
	private EntityManager em;
	
	public Cliente buscarCuenta(String DNI) {
		String jpql = "SELECT o FROM Cliente o JOIN FETCH o.servicios do " + "WHERE o.DNI = :DNI ";
		Query query = em.createQuery(jpql, Cliente.class);
		query.setParameter("DNI", DNI);
		Cliente cuenta = (Cliente) query.getSingleResult();
		return cuenta;
	}
	
	public List<Servicio> listado(String DNI) {
		String jpql = "SELECT c FROM Cliente c WHERE c.DNI = :DNI ";
		Query query = em.createQuery(jpql, Cliente.class);
		query.setParameter("DNI", DNI);
		Cliente c = (Cliente) query.getSingleResult();
		System.out.println(c.getNombre());
		List<Servicio> facturas = c.getServicios();

		return facturas;
	}
}
