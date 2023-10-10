package javaLar;

public class PHP extends Planeta{

public PHP(String nome, int posicaoX, int posicaoY, PlanoCartesiano plano) {
	super(nome, posicaoX, posicaoY, plano);
	this.mRotacao = 60.0;
	this.mTranslacao = 2;
	this.limitedireita = 11;
	this.limiteesquerda = 11;
	this.limitecima = 10;
	this.limitebaixo = 10;
	}
}
