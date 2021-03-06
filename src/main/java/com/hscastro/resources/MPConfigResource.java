package com.hscastro.resources;

import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.config.spi.ConfigSource;

@Path("/mp-config") 
@ApplicationScoped
public class MPConfigResource {

	@Inject
	private Config config;

	@Inject
	@ConfigProperty(name="quantidade.elementos.pagina", defaultValue = "38")
	Integer quantidadeElementosPagina;

	
	@Inject
	@ConfigProperty(name="quantidade.elementos.pagina")
	Optional<Integer> quantidadeElementosPaginaOp;
	
	
	@GET
	@Path("quantidades")
	@Produces(MediaType.TEXT_PLAIN)
	public String quantidade() {
		return quantidadeElementosPagina.toString();		
	}
	
	
	@GET
	@Path("/config-sources")
	@Produces(MediaType.TEXT_PLAIN)
	public String methodName() {
		config = ConfigProvider.getConfig();
		Iterable<ConfigSource> configSources = config.getConfigSources();
		StringBuilder sb = new StringBuilder();
		
		for (ConfigSource configSource : configSources) {
			sb.append("\nNome").append(configSource.getName())
			   .append("\nOdinal").append(configSource.getOrdinal())
			   .append("\nPropertyName").append(configSource.getProperties());
		}
		
		return sb.toString();
		
	}
}
