package javaLar;

public class Cmais_mais extends Planeta{
	
	public Cmais_mais(String nome, int posicaoX, int posicaoY, PlanoCartesiano plano) {
		super(nome, posicaoX, posicaoY, plano);
//		posicaoX = 13;
//		posicaoY = 14;
		this.mRotacao = 0.5;
		this.mTranslacao = 2.0;
		this.limitedireita = 15;
		this.limiteesquerda = 15;
		this.limitecima = 14;
		this.limitebaixo = 14;
	}
}
