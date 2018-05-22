package fr.exia.helloworldmaven;

import java.io.FileNotFoundException;

public class controller {
	private final View V ;
	private final model M;
	
	
	public controller(final View View, final model Model) {
		
		this.V =View;
		this.M = Model;	
	}
	
	public void start() throws FileNotFoundException {
		
		this.V.displayMessage(this.M.getHelloWorld());
	}
	
	
	
	

}
