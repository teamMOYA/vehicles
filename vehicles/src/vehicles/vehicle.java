package vehicles;

public class vehicle {
	private int cilindrada;
	private int portes;
	private int velocitat_actual = 0;
	private final int velocitat_maxima = 120;


	public void accelerar(){
		while(this.velocitat_actual < this.velocitat_maxima){
			this.velocitat_actual += 10;
		}
	}

	public void Desaccelerar(){
		while(this.velocitat_actual > 0){
			this.velocitat_actual -= 10;
		}
	}

}
