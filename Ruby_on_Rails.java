package javaLar;

public class Ruby_on_Rails extends Planeta{
	
	public Ruby_on_Rails(String nome, int posicaoX, int posicaoY, PlanoCartesiano plano) {
		super(nome, posicaoX, posicaoY, plano);
		this.mRotacao = 48.0;
		this.mTranslacao = 2.0;
		this.limitedireita = 9;
		this.limiteesquerda = 9;
		this.limitecima = 8;
		this.limitebaixo = 8;
	}
}
