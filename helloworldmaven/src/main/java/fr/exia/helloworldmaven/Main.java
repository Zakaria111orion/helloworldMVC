package fr.exia.helloworldmaven;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		model M = new model();
		View V = new View();
		
		
		controller C = new controller(V, M);
        C.start();
	}

}
