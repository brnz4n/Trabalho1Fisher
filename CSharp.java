package javaLar;

public class CSharp extends Planeta{
	
	public CSharp(String nome, int posicaoX, int posicaoY, PlanoCartesiano plano) {
		super(nome, posicaoX, posicaoY, plano);
		this.mRotacao = 4.0;
		this.mTranslacao = 1.0;
		this.limitedireita = 13;
		this.limiteesquerda = 13;
		this.limitecima = 12;
		this.limitebaixo = 12;
	}
}
