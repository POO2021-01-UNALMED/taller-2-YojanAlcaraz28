package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;

	public void cambiarRegistro(int numregistro) {
		this.registro = numregistro;
	}

	public void asignarTipo(String tipo) {
		if (tipo.equals("electrico") || tipo.equals("gasolina")) {
			this.tipo = tipo;
		}

	}

}
