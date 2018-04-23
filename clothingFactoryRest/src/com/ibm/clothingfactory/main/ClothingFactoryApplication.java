package com.ibm.clothingfactory.main;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.ibm.clothingfactory.providers.JsonProvider;
import com.ibm.clothingfactory.providers.OutputStreamProvider;
import com.ibm.clothingfactory.rest.ClothingFactoryResource;

/**
 * Clase principal de la aplicacion - Encargada de mapear los controladores
 * IBM Global Business Services GBS Colombia
 * @author andressanchez - Andres Ceballos Sanchez - IBM
 * @since 19/04/2018
 * @version 1.0
 */
public class ClothingFactoryApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		
		Set<Class<?>> classes = new HashSet<Class<?>>();
		
		/*Providers*/
		classes.add(JsonProvider.class);
		classes.add(OutputStreamProvider.class);		
		
		/*Resources*/
		classes.add(ClothingFactoryResource.class);
		
		return classes;
	}
	
	
}
