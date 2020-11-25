package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

public class TestAutoPista {
	

	@Test
	public void queSePuedaRegistrarTelepase () {
		
		HashSet<Vehiculo> vehiculosEnCirculacion = new HashSet<Vehiculo>();
		
		HashMap <Integer,Vehiculo> telepase = new HashMap<Integer,Vehiculo>();
		
		Autopista autopista = new Autopista(telepase,vehiculosEnCirculacion);
		
		Integer telepaseActual= 1;
		
		Vehiculo vehiculo = new Vehiculo("ACD123",120,130);
		
		assertTrue(autopista.registrarTelepase(telepaseActual, vehiculo));
	}
	@Test
	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() {

		
		
	}
	@Test
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente(){
		
	}
	@Test
	public void queElAutoIngreseALaAutopista() {
		
		Vehiculo vehiculo = new Vehiculo("ACD123",120,130);
		
		Integer telepaseActual = 1;
		
		HashMap <Integer,Vehiculo> telepase = new HashMap<Integer,Vehiculo>();
		
		HashSet<Vehiculo> vehiculosEnCirculacion = new HashSet<Vehiculo>();
		
		telepase.put(telepaseActual, vehiculo);
		
		Autopista autopista = new Autopista(telepase, vehiculosEnCirculacion);
		
		assertTrue(autopista.ingresarAutopista(telepaseActual));
	}
	@Test
	public void obteneCantidadDeAutos() {
		
		Vehiculo vehiculo = new Vehiculo("ACD123",120,130);
		
		Integer AutosActuales = 1;
		
		HashMap <Integer,Vehiculo> telepase = new HashMap<Integer,Vehiculo>();
		
		HashSet<Vehiculo> vehiculosEnCirculacion = new HashSet<Vehiculo>();
		
		vehiculosEnCirculacion.add(vehiculo);
		
		Autopista autopista = new Autopista(telepase, vehiculosEnCirculacion);
		
		assertEquals(AutosActuales,autopista.cantidadDeVehiculosENCirculacion());
	}
	
}
