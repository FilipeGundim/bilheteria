package main;

import Cliente.cliente;
public class main {
	  public int qtd = 100;
	    public static void main(String []args){
	        
	        for (int i=0; i<=300; i++){
	            cliente c = new cliente(i);
	            c.start();
	        }
	    }
}
