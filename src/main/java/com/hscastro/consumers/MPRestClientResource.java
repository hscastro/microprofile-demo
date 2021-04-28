package com.hscastro.consumers;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("mp-restclient")
@ApplicationScoped
public class MPRestClientResource {

	@Inject
	@RestClient
	private MunicipioService service;
	
	@GET
	public String adicinarComGet() {
		Integer idUF = 38;
		return service.adicionar(idUF, new MunicipioDTO(null, "Mossoro", 180025)).toString();		
	}
	
}
