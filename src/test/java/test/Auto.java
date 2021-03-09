package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int CantidadCreados;

	public int cantidadAsientos() {
		int contador = 0;
		for (int i = 0; i < this.asientos.length; i++) {
			if (this.asientos[i] != null) {
				contador += 1;	
			}
		}
		return contador;

	}

	public String verificarIntegridad() {
		if (this.registro == motor.registro) {
			boolean soniguales = true;
			for (int i = 0; i < this.asientos.length; i++) {
				if (this.asientos[i] != null) {
					if (this.asientos[i].registro != this.registro) {
						soniguales = false;
					}

				}
			}
			if (soniguales == true) {
				return "Auto original";
			} else {
				return "Las piezas no son originales";
			}
		} else {
			return "Las piezas no son originales";
		}
	}

}
