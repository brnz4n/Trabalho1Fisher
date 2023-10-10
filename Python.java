package javaLar;

public class Python extends Planeta{

	public Python(String nome, int posicaoX, int posicaoY, PlanoCartesiano plano) {
	 super(nome, posicaoX, posicaoY, plano);
		this.mRotacao = 4;
		this.mTranslacao = 4.0;
		this.limitedireita = 5;
		this.limiteesquerda = -5;
		this.limitecima = 4;
		this.limitebaixo = -4;
	}
}
