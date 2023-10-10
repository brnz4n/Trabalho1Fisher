package javaLar;

public class JavaScript extends Planeta {
	
	public JavaScript(String nome, int posicaoX, int posicaoY, PlanoCartesiano plano) {
		super(nome, posicaoX, posicaoY, plano);
		this.mRotacao = 10.0;
		this.mTranslacao = 3.0;
		this.limitedireita = 7;
		this.limiteesquerda = 7;
		this.limitecima = 6;
		this.limitebaixo = 6;
	}

}
