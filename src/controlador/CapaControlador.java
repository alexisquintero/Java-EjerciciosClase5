package controlador;

import datos.*;
import entidades.*;

public class CapaControlador {
	
	public String CreaModificaPersona(Persona p, CapaDatos cd){	
			
		return cd.CreaModificaPersona(p);
	}
	
	public Persona BuscaPersona(int dni, CapaDatos cd){
		
		return cd.BuscaPersona(dni);
		
	}
	
	public String BajaPersona(int dni, CapaDatos cd){
		
		return cd.BajaPersona(dni);
		
	}
	
}
