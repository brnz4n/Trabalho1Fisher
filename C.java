package javaLar;

public class C extends Planeta {

public C(String nome, int posicaoX, int posicaoY, PlanoCartesiano plano) {
	super(nome, posicaoX, posicaoY, plano);
	
	this.mRotacao = 0.1;
	this.mTranslacao = 0.1;
	this.limitedireita = 17;
	this.limiteesquerda = 17;
	this.limitecima = 16;
	this.limitebaixo = 16;
	}
}
