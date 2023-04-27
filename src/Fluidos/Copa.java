package Fluidos;

public class Copa extends Liquido implements Graduable{
	
	private Graduable alcohol;
	private Liquido mezcla;
	
	public Copa(Graduable alcohol, Liquido mezcla) {
		super(0.0,"TODO");
		Liquido alcohol2 = (Liquido) alcohol;
		String color2 = alcohol2.color+"-"+mezcla.color;
		Double litros2 = alcohol2.litros+mezcla.getLitros();
		this.setLitros(litros2);
		this.setColor(color2);		
		this.alcohol = alcohol;
		this.mezcla = mezcla;
	}
	
	@Override
	public Double getGrados() {
		Liquido alcohol2 = (Liquido) this.alcohol;
		return alcohol.getGrados()*alcohol2.litros/this.getLitros();
	}
	@Override
	public Liquido mezclar(Liquido mezcla) throws NoSePuedeMezclarException {
		throw new NoSePuedeMezclarException();
	}

	public Graduable getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(Graduable alcohol) {
		this.alcohol = alcohol;
	}

	public Liquido getMezcla() {
		return mezcla;
	}

	public void setMezcla(Liquido mezcla) {
		this.mezcla = mezcla;
	}
	
	
	
}
