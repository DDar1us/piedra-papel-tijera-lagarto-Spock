package edu.tallerweb.pptls;


/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	private Mano jugadoruno
	public void Mano(Forma forma) {
	}
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	
	public Mano (Forma forma) {
		return this.jugadoruno(forma);
	}
	
	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 */
	public Resultado jugarCon(final Mano otra){
		if (jugadoruno==otra){
			return Resultado.EMPATA;
		}
		if (this.jugadoruno==Forma.PIEDRA&&jugadordos==TIJERA||jugadoruno==PAPEL&&jugadordos==PIEDRA||jugadoruno==TIJERA&&jugadordos==PAPEL||jugadoruno==LAGARTO&&jugadordos==SPOCK||jugadoruno==SPOCK&&jugadordos==TIJERA||jugadoruno==TIJERA&&jugadordos==LAGARTO||jugadoruno==LAGARTO&&jugadordos==PAPEL||jugadoruno==PAPEL&&jugadordos==SPOCK||jugadoruno==SPOCK&&jugadordos==PIEDRA||jugadoruno==PIEDRA&&jugadordos==LAGARTO)
		{
		else
		{
			return Resultado.PIERDE;
		}
		}
	}

}
