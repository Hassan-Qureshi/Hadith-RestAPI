package rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;
import rest.services.*;

public class ResourceLoader extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		System.out.println("Loading Classes");
		
		classes.add(HadithService.class);
		classes.add(AuthenticationService.class);
		classes.add(TaskService.class);
		
		return classes;
	}
}