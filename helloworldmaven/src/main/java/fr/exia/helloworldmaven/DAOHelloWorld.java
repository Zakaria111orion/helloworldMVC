package fr.exia.helloworldmaven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

  public  class DAOHelloWorld{
	 
	private String hi;
    private String file;
	public DAOHelloWorld(String f) {
		this.file = f;
		hi = "";
	}
	public String getHi() {
		return this.hi;
	}
    
	public String Reader() throws FileNotFoundException {
   	 File f=new File(this.file);
     Scanner sc=new Scanner(f);
    while(sc.hasNextLine()) {
        this.hi = sc.nextLine();
    }
    	return this.hi;
    }
    

}