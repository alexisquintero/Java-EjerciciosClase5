package datos;

import java.util.ArrayList;

import entidades.*;

public class CapaDatos {

	private static ArrayList<Persona> AlPersonas = new ArrayList<Persona>();
	int index = -1;
	
	public String CreaModificaPersona(Persona p){
		
		Persona personaBusqueda = this.BuscaPersona(p.getiDni());
		String resp = "Valor inicial";
		
		if (personaBusqueda == null) {
			
			AlPersonas.add(p);
			resp = p.getsNombre() + " " + p.getsApellido() + " agregado.";
			
			}else {
				
				resp = p.getsNombre() + " " + p.getsApellido() + "modificado a ";
				AlPersonas.get(index).setsApellido(p.getsApellido());
				AlPersonas.get(index).setsEmail(p.getsEmail());
				AlPersonas.get(index).setsNombre(p.getsNombre());
				resp = resp + p.getsNombre() + " " + p.getsApellido();
				
			}
		
		return resp;
		
		}
		
	
	
	public Persona BuscaPersona(int dni){
		
		Persona p = new Persona();
		p = null;

		for (int i = 0; i < AlPersonas.size(); i++) {
			
			p = (AlPersonas.get(i).getiDni() == dni) ? AlPersonas.get(i) : null ;
			index = i;
			
		}
	
		return p;
	}
	
	public String BajaPersona(int dni){
		
		String resp = "Valor inicial";
		
		Persona personaBusqueda = this.BuscaPersona(dni);
		if (personaBusqueda == null) {
			
			resp = "La persona con el DNI " + String.valueOf(dni) + " no existe.";
			
		}else {
			
			resp = AlPersonas.get(index).getsNombre() + " " + AlPersonas.get(index).getsApellido() + " ha sido borrado.";
			AlPersonas.remove(index);
			
		}
		
		return resp; 
	}
	
	public ArrayList<Persona> Listado(){
		return AlPersonas;
	}
	
}
