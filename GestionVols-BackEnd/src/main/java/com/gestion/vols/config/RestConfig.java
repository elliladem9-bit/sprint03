package com.gestion.vols.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

/** Autorise Angular (localhost:4200) à appeler les api Spring Data REST (GET, POST, PUT, DELETE...). */
@Configuration
public class RestConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		cors.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*");
	}
}
