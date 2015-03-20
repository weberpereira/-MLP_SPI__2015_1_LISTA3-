package Quest1;

public class Locadora {
	protected String titulo;
	protected double valorLocadora;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValorLocadora() {
		return valorLocadora;
	}

	public void setValorLocadora(double valorLocadora) {
		this.valorLocadora = valorLocadora;
	}

	public void valorLocadora(double acrescimos) {
		this.valorLocadora += this.valorLocadora * acrescimos;
	}
}