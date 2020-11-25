package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import javax.print.attribute.Size2DSyntax;

public class Autopista {
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los atributos o metodos que crean convenientes
	private HashMap <Integer,Vehiculo> telepase;
	private HashSet <Vehiculo> vehiculosEnCirculacion;
	
	
	
	public Autopista(HashMap<Integer,Vehiculo> telepase, HashSet<Vehiculo> vehiculosEnCirculacion) {
		this.telepase = new HashMap<Integer,Vehiculo>();
		this.vehiculosEnCirculacion = new HashSet<Vehiculo>();
	}
	public Boolean registrarTelepase (Integer numeroTelpase, Vehiculo vehiculo) {
		
		telepase.put(numeroTelpase, vehiculo);
		vehiculosEnCirculacion.add(vehiculo);
		
		return true;
	
	}
	public Boolean ingresarAutopista (Integer numeroTelepase){
		//si el telepase no esta registrado lanza una Exceptios del tipo VehiculoNotFounException
	   // y no permite ingresar al autopista	
		try {
			if(telepase.containsKey(numeroTelepase)) {
				return true;
				}
			
			
		}catch (Exception  VehiculoNotFounException) {
			
			return false;
		}
		return false;
	}
	
	public void salirAutpista (Vehiculo vehiculo) {
		//lanza Una exception VehiculoNotFounException si no esta en circulacion
		try {
			for(Vehiculo vehiculoActual: vehiculosEnCirculacion) {
				if(vehiculoActual.getPatente().equals(vehiculo.getPatente())) {
					vehiculosEnCirculacion.remove(vehiculo);
				}
			}
			
		}catch(Exception  VehiculoNotFounException) {
			return;
		}
	}
	
	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente(){
	
	return null;
    }

	public Integer cantidadDeVehiculosENCirculacion() {
	
		Integer vehiculos =0;
		vehiculos = vehiculosEnCirculacion.size();
		return vehiculos;
}
	}
