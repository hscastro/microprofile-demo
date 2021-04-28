package com.hscastro.consumers;

import java.net.http.HttpHeaders;
import java.util.concurrent.atomic.AtomicInteger;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/municipios")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MunicipioResource {

	private AtomicInteger geradorID = new AtomicInteger();
	
	@POST
	public MunicipioDTO adicionar(@Context HttpHeaders headers, @QueryParam("idUF")Integer idUF,
			MunicipioDTO municipio) {
		System.out.println("------------------------------------");
		System.out.println("Adicionando municipio");
		
		municipio.setId(geradorID.getAndIncrement());
		
		return municipio;
		
	}
}

// curl -d '{"nome":"Fortaleza", "populacao":"8700874"}' -H "Content-Type: application/json" -H "Accept: application/json" http://192.168.40.179:9080/microprofile-demo/municipios -v 