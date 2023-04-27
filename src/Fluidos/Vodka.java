package Fluidos;

public class Vodka extends Liquido implements Graduable{
	
	private Double grados;
	
	public Vodka(Double litros, Double graduacion) {
		super(litros, "incoloro");
		this.grados = graduacion;
	}
	
	@Override
	public Double getGrados() {
		return this.grados;
	}

	@Override
	public Liquido mezclar(Liquido mezcla) throws NoSePuedeMezclarException {
		Liquido resultado = null;
		
		if(mezcla.getClass().getName().compareTo("Cola")==0) {
			resultado = new Copa(this,mezcla);
		}else if(mezcla.getClass().getName().compareTo("Agua")==0) {
			resultado = new Copa(this,mezcla);
		}else {
			throw new NoSePuedeMezclarException();
		}
		
		return resultado;
	}
	
	public void setGrados(Double grados) {
		this.grados = grados;
	}
	
	
	
	
}
