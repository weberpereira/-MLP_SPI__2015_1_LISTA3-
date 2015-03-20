package Quest2;

import java.util.*;

public class ClasseVeiculo {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int alt = 0;
		double kmRodado = 0;

		VeiculoDeCarga carreta = new VeiculoDeCarga("MMN 1455", "Mercedes",
				"Cargo 2000", 2015, 50, 200, 800, 12000);

		while (true) {
			System.out
					.println("digite 1 - valor da locação para Veiculos pesados");
			System.out.println("digite 2 - valor locação para carro passeio");
			System.out.println("digite 3 - para encerrar");

			System.out.print(":");
			alt = read.nextInt();
			read.nextLine();
			if (alt == 1) {

				System.out
						.printf("Dados do Veiculo: %n Placa: %s%n Marca: %s%n Modelo: %s%n Ano Fabricação: %d%n Km Inicial: %.2f%n Km Final: %.2f%n",
								carreta.getPlaca(), carreta.getMarca(),
								carreta.getModelo(), carreta.getAno(),
								carreta.getKmInicial(), carreta.getKmFinal());
				System.out.println("");
				System.out.println("Qual a quilometragem rodada?");
				kmRodado = read.nextDouble();
				read.hasNextLine();
				carreta.setValorKmRodado(kmRodado);
				System.out.printf("Valor total de locação: %.2f R$%n",
						carreta.valorLocacao());
			} else if (alt == 3) {
				break;
			}

		}

		read.close();
	}

}