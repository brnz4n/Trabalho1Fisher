package javaLar;

import java.util.Random;
import java.util.ArrayList;

public class PlanoCartesiano {
	
	private int nBugs;
	private int nDevs;
	private ArrayList<Celula> Celulas;
	
	
	public PlanoCartesiano(int nBugs, int nDevs) {
		
	Celulas = new ArrayList<Celula>();
		
	int id = 1 ;
	for(int i = 0; i < 15; i++ ) {
		for(int j = 0; j < 15; j++) {
			Celula celulas = new Celula(i,j,id);
			Celulas.add(celulas);
			id++;
		}
	}
	setnBugs(nBugs);
	setnDevs(nDevs);
	sorteioBugs(Celulas.size());
	sorteioDevs(Celulas.size());
}
	
	public void sorteioBugs(int tamanho) {

		Random random = new Random();
		int celulasorteada;
		for(int i=0; i < nBugs;) {
			celulasorteada = random.nextInt(tamanho-1);
			if(Celulas.get(celulasorteada+1).getDevs() == false) {
				Celulas.get(celulasorteada+1).setBug(true);
				i++;
			}
		}
	}
	
	public void sorteioDevs(int tamanho) {
		Random random = new Random();
		int celulasorteada;
		for(int i=0; i < nDevs;) {
			celulasorteada = random.nextInt(tamanho-1);
			if(Celulas.get(celulasorteada+1).getBug() == false) {
				Celulas.get(celulasorteada+1).setDevs(true);
				i++;
			}
		}
			
	}
	
	public void verificarColisoes() {
		for(Celula celula : Celulas) {
			if(celula.celulavisitada()) {
				for(Planeta planeta : celula.getPlanetas()) {
					int posiXplaneta = planeta.getPosicaoX();
					int posiYplaneta = planeta.getPosicaoY();
					
					if(celula.isBug()) {
						if(posiXplaneta ==celula.getX() && posiYplaneta == celula.getY()) {
							System.out.println("Colisão detectada! Bug colidiu com planeta " + planeta.getNome());
							planeta.incrementoBugsColididos();
							celula.setBug(false);
						}
					}
					if(celula.isDevs()) {
						if(posiXplaneta == celula.getX() && posiYplaneta == celula.getY()) {
							System.out.println("Colisão detectada! Desenvolvedor colidiu com planeta " + planeta.getNome());
							planeta.incrementoDevsColididos();
							celula.setDevs(false);
						}
					}
				}
			}
		}
	}
	
	public void addPlaneta(Planeta planeta,int idCelula) {
		Celulas.get(idCelula).addPlaneta(planeta);
	}
	
	public void addBug(int idCelula) {
		Celulas.get(nBugs).setBug(true);
	}
	
	public void addDevs(int idCelula) {
		Celulas.get(nDevs).setDevs(true);
	}
	
	public int getnBugs() {
		return nBugs;
	}
	
	public void setnBugs(int nBugs) {
		if(Celulas.size()/2>nBugs)
		this.nBugs = nBugs;
	}
	
	public int getnDevs() {
		return nDevs;
	}
	
	public void setnDevs(int nDevs) {
		if(Celulas.size()/2>nDevs)
		this.nDevs = nDevs;
	}
	
	public ArrayList<Celula> getCelulas() {
		return Celulas;
	}
	
	public void posicoesBugsDevs() {
		System.out.println("Posicoes dos Bugs e desenvolvedores: ");
		for(Celula celula : Celulas) {
			if(celula.isBug()) {
				System.out.println("Bug: X= "+celula.getX() + ",Y= " + celula.getY());
			}
			if(celula.isDevs()) {
				System.out.println("Desenvolvedor: X= " + celula.getX() + ",Y= " + celula.getY());
			}
		}
	}
}	
	
