package Quest1;

public class LocadoraDois {
	public static void main(String[] args) {

		FitasInfantil fitasI = new FitasInfantil();
		FitasLancamentos fitasL = new FitasLancamentos();
		Locadora l = new Locadora();

		l.setValorLocadora(2);

		fitasI.setTitulo("Os Trapalh�es");
		fitasI.setValorLocadora(2);

		fitasL.setTitulo("O Retorno dos que n�o foram");
		fitasL.setValorLocadora(2);

		System.out.println(fitasI.valorLocadora());
		System.out.println(fitasL.valorLocadora());
		System.out.println(l.valorLocadora);

	}

}