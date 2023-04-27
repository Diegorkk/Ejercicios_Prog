package Fluidos;

public class Lejia extends Liquido{

	private Double pureza;
	
	public Lejia(Double litros) {
		super(litros, "incoloro");
		this.pureza = 1.0;
	}
	
	public Lejia(Double litros, String color,Double pureza) {
		super(litros, color);
		this.pureza = pureza;
	}


	@Override
	public Liquido mezclar(Liquido mezcla) {
		
		Double sumaLitros = this.litros+mezcla.litros;
		String sumaColor = this.color+"-"+mezcla.color;
		Double nuevaPureza = 0.0;
		if(mezcla.getClass().getName().compareTo("Agua")==0) {
			nuevaPureza = 1.0;
		}else {
			nuevaPureza = sumaLitros/this.litros;
		}		
		Lejia resultado = new Lejia(sumaLitros);
		resultado.setColor(sumaColor);
		resultado.setPureza(nuevaPureza);
		
		return resultado;
	}

	public Double getPureza() {
		return pureza;
	}

	public void setPureza(Double pureza) {
		this.pureza = pureza;
	}
	
	

}
