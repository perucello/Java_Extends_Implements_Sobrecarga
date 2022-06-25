
package com.educaciencia.usingExtendsImplementsSobrecarga;

public class Veiculo_de_Carga_Extends_Implements_Sobrecarga extends
		Veiculo_Caracteristicas_Extends_Implements_Sobrecarga implements Veiculo_Acao_Extends_Implements_Sobrecarga {

	public String eixos;
	public String comprimento;

	public Veiculo_de_Carga_Extends_Implements_Sobrecarga() {
	}

	public Veiculo_de_Carga_Extends_Implements_Sobrecarga(String eixos, String comprimento) {
		this.eixos = eixos;
		this.comprimento = comprimento;
	}

	public Veiculo_de_Carga_Extends_Implements_Sobrecarga(String eixos, String comprimento, String nome,
			String fabricante, String cor, String motor, String combustivel) {
		super(nome, fabricante, cor, motor, combustivel);
		this.eixos = eixos;
		this.comprimento = comprimento;
	}

	public String getEixos() {
		return eixos;
	}

	public void setEixos(String eixos) {
		this.eixos = eixos;
	}

	public String getComprimento() {
		return comprimento;
	}

	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public void Ligar() {
		// throw new UnsupportedOperationException("Not supported yet."); //To change
		// body of generated methods, choose Tools | Templates.
		System.out.println("Veiculo_de_Carga ligado");
	}

	@Override
	public void Desligar() {
		// throw new UnsupportedOperationException("Not supported yet."); //To change
		// body of generated methods, choose Tools | Templates.
		System.out.println("Veiculo_de_Carga desligado");
	}

	/**
	 * Sobrecarga de Método
	 */
	public void ligarSobrecarga_veiculoCarga() {
		// testando Veiculo Carga - ligarSobrecarga_veiculoCarga
		Veiculo_de_Carga_Extends_Implements_Sobrecarga vcarga = new Veiculo_de_Carga_Extends_Implements_Sobrecarga();
		vcarga.setEixos("4");
		vcarga.setComprimento("30 metros");
		vcarga.setFabricante("Volvo - sobrecarga");
		vcarga.setCor("Preto");
		vcarga.setCombustivel("Biodiesel");

		System.out.println("testando Veiculo Carga - ligarSobrecarga_veiculoCarga sem argumentos");
		vcarga.Ligar();
		System.out.println("Fabricante: " + vcarga.getFabricante());
		System.out.println("Eixos: " + vcarga.getEixos());
		System.out.println("Comprimento: " + vcarga.getComprimento());
		vcarga.Desligar();
		System.out.println("----------------------------------------");
	}

	public void ligarSobrecarga_veiculoCarga(String fabricante, String eixos) {

		Veiculo_de_Carga_Extends_Implements_Sobrecarga vcarga = new Veiculo_de_Carga_Extends_Implements_Sobrecarga();
		System.out.println("testando Veiculo Carga - ligarSobrecarga_veiculoCarga com argumentos");
		vcarga.Ligar();
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Eixos: " + eixos);
		vcarga.Desligar();
		vcarga.Ligar();
		vcarga.Desligar();
		System.out.println("----------------------------------------");
	}

}
