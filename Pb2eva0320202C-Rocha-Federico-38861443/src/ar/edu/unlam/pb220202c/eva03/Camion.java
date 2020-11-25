package ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo implements Imultable{
	

	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los que crean conveniente
	private Integer cantidadDeEjes;
	//el Limite de velociadad para autos es de 80km
	//en caso que supere dicho limite el este sera multado

	public Camion(String Patente, Integer VelocidadActual, Integer limiteVelocidad, Integer cantidadDeEjes) {
		super(Patente, VelocidadActual, limiteVelocidad);
		this.cantidadDeEjes = cantidadDeEjes;
	}
	
	

	public Integer getCantidadDeEjes() {
		return cantidadDeEjes;
	}



	public void setCantidadDeEjes(Integer cantidadDeEjes) {
		this.cantidadDeEjes = cantidadDeEjes;
	}



	@Override
	public Boolean enInfraccion() {
		
		if(this.getVelocidadActual() > 80) {
			return true;
		}
		return false;
	}
	
	
}
