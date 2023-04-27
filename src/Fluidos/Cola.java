package Fluidos;

public class Cola extends Liquido{
	
	private Boolean cafeina;

	public Cola(Double litros, String color) {
		super(litros, color);
		this.cafeina = false;

	}

	
	@Override
	public Liquido mezclar(Liquido mezcla) throws NoSePuedeMezclarException {
		throw new NoSePuedeMezclarException();
	}

	public Boolean getCafeina() {
		return cafeina;
	}

	public void setCafeina(Boolean cafeina) {
		this.cafeina = cafeina;
	}

	


}
