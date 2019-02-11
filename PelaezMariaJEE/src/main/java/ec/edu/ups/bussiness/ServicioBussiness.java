package ec.edu.ups.bussiness;

import java.util.List;

import javax.inject.Inject;

import ec.edu.ups.dao.PagosDAO;
import ec.edu.ups.modelo.Pago;
import ec.edu.ups.modelo.Servicio;

public class ServicioBussiness {

	@Inject
	private PagosDAO dao;

	public List<Pago> listadoServicios(String DNI) {
		return dao.listadoServicios(DNI);
	}

	public Servicio buscarServicio(String DNI) {

		return dao.buscarServicio(DNI);
	}

	/*
	 * public Resultado totalServicios() {
	 * 
	 * int cant = 0; for (Servicio f : dao.totalServicios()) { cant += f.getTotal();
	 * c++; } Resultado r = new Resultado(); r.setFacturas(c); r.setTotal(total);
	 * return r; }
	 */

}
