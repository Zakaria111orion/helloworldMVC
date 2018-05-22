package fr.exia.helloworldmaven;

import java.io.FileNotFoundException;

public class model implements IModel {

	
	
	
	public String getHelloWorld() throws FileNotFoundException {
		DAOHelloWorld DAO = new DAOHelloWorld("file.txt");
		DAO.Reader();
		return DAO.getHi();
	}

}
