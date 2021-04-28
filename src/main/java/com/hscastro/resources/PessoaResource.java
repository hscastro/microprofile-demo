package com.hscastro.resources;


import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.hscastro.entities.Pessoa;
import com.hscastro.services.PessoaService;


@Path("/pessoas")
@ApplicationScoped
public class PessoaResource {	
	
	@Inject
	private PessoaService servicePessoa;
	
	private List<Pessoa> list;
		
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPessoas() {
		list = servicePessoa.findAll();
		return Response.ok(list).build();
	}

//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String getPessoas() {
//		return "pessoas";
//	}

}
