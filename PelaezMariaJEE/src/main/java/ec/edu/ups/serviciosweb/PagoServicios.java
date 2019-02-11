package ec.edu.ups.serviciosweb;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import ec.edu.ups.bussiness.ServicioBussiness;
import ec.edu.ups.modelo.Pago;


@Path("/serviciopagos")
public class PagoServicios {
	@Inject
	private ServicioBussiness pBussiness;

	@GET
	@Path("/listapagos")
	@Produces("application/json")
	public List<Pago> obtenerPagos (@QueryParam("dni") String dni) {
		
		List<Pago> pagos = pBussiness.listadoServicios(dni);	
		return pagos;
	}

}
