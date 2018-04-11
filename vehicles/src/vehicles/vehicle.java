package vehicles;

public class vehicle {
	private int cilindrada;
	private int portes;
	private int velocitat_actual = 0;
	private final int velocitat_maxima = 120;


	public void accelerar(){
			this.velocitat_actual += 10;
	}

}
