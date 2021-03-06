package com.educaciencia.usingExtendsImplementsSobrecarga;

/**
 * Live ExplorandoTI 22/06/2022 Java: Extends | Implements
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("************* usingExtendsImplementsSobrecarga ****************\n");

		// testando Veiculo Passeio
		String veic_passeio_fabricante = "Ford";
		String veic_passeio_combustivel = "Alcool";
		String veic_passeio_cor = "Azul";
		String veic_passeio_portas = "4";
		String veic_passeio_lugares = "5";

		Veiculo_de_Passeio_Extends_Implements_Sobrecarga vpasseio = new Veiculo_de_Passeio_Extends_Implements_Sobrecarga();
		vpasseio.setFabricante(veic_passeio_fabricante);
		vpasseio.setLugares(veic_passeio_lugares);
		vpasseio.setCor(veic_passeio_cor);
		vpasseio.setCombustivel(veic_passeio_combustivel);
		vpasseio.setPortas(veic_passeio_portas);

		System.out.println("testando Veiculo Passeio");
		vpasseio.Ligar();
		System.out.println("Fabricante: " + vpasseio.getFabricante());
		System.out.println("Lugares: " + vpasseio.getLugares());
		System.out.println("Portas: " + vpasseio.getPortas());
		vpasseio.Desligar();
		System.out.println("----------------------------------------");

		System.out.println("************* usingExtendsImplementsSobrecarga ****************\n");

// ----------------------------------------------------------------------------------------------------------------------------
		// testando Veiculo Carga
		String vcarga_fabricante = "Mercedes";
		String vcarga_combustivel = "Diesel";
		String vcarga_cor = "Rosa";
		String vcarga_eixos = "8";
		String vcarga_comprimento = "15 metros";

		Veiculo_de_Carga_Extends_Implements_Sobrecarga vcarga = new Veiculo_de_Carga_Extends_Implements_Sobrecarga();

		vcarga.setEixos(vcarga_eixos);
		vcarga.setComprimento(vcarga_comprimento);
		vcarga.setFabricante(vcarga_fabricante);
		vcarga.setCor(vcarga_cor);
		vcarga.setCombustivel(vcarga_combustivel);

		/*
		 * vcarga.setEixos("4"); vcarga.setComprimento("30 metros");
		 * vcarga.setFabricante("Volvo"); vcarga.setCor("Preto");
		 * vcarga.setCombustivel("Biodiesel");
		 */
		System.out.println("testando Veiculo Carga");
		vcarga.Ligar();
		System.out.println("Fabricante: " + vcarga.getFabricante());
		System.out.println("Eixos: " + vcarga.getEixos());
		System.out.println("Comprimento: " + vcarga.getComprimento());
		vcarga.Desligar();
		System.out.println("----------------------------------------");

		System.out.println("************* usingExtendsImplementsSobrecarga ****************\n");

// ----------------------------------------------------------------------------------------------------------------------------
		// com Sobrecarga da classe Veiculo_de_Carga_Extends_Implements_Sobrecarga
		// 01
		Veiculo_de_Carga_Extends_Implements_Sobrecarga vcarga_sobrecarga_1 = new Veiculo_de_Carga_Extends_Implements_Sobrecarga();
		vcarga_sobrecarga_1.ligarSobrecarga_veiculoCarga();

		// 02
		Veiculo_de_Carga_Extends_Implements_Sobrecarga vcarga_sobrecarga_2 = new Veiculo_de_Carga_Extends_Implements_Sobrecarga();
		vcarga_sobrecarga_2.ligarSobrecarga_veiculoCarga("Mercedes - _sobrecarga", "8");

		// ligarSobrecarga_veiculoCarga
	}
}
