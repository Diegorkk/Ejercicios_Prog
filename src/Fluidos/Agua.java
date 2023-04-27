package Fluidos;

public class Agua extends Liquido{
	
	private Double pureza;

	public Agua(Double litros) {
		super(litros, "incoloro");
		this.pureza = 1.0;
	}

	@Override
	public Liquido mezclar(Liquido mezcla) {
		
		Double sumaLitros = this.litros+mezcla.litros;
		String sumaColor = this.color+"-"+mezcla.color;
		Double nuevaPureza = 0.0;
		if(mezcla.getClass().getName().compareTo("Lejia")==0) {
			nuevaPureza = 1.0;
		}else {
			nuevaPureza = sumaLitros/this.litros;
		}		
		Agua resultado = new Agua(sumaLitros);
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
