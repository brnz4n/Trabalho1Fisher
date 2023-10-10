package javaLar;

public abstract class Planeta implements Movimento{
	
	protected String nome;
	protected double mRotacao;
	protected double mTranslacao;
	protected int posicaoX; 
	protected int posicaoY;
	protected double posicaoAtual;
	protected int limitedireita;
	protected int limiteesquerda;
	protected int limitecima;
	protected int limitebaixo;
	protected PlanoCartesiano plano;
	private int bugsColididos = 0;
	private int devsColididos = 0;
	
	public Planeta(String nome,int posicaoX, int posicaoY, PlanoCartesiano plano) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
		this.nome = nome;
		
	}
	
	public void movimento(double tempo){
		
		double deslocamento = mRotacao * tempo;
		posicaoAtual += deslocamento;
		
		for(int i = 0; i < deslocamento; i++) {
			if(posicaoX < limitecima) {
				posicaoX++;
			}
			else if(posicaoX > limitebaixo) {
				posicaoX--;
			}
			if(posicaoY < limiteesquerda) {
				posicaoY++;
			}
			else if(posicaoY > limitedireita) {
				posicaoY--;
			}
		}
		System.out.println();

	}
	public void calcularTempo(int tempo) {
		double tempoHoras = mTranslacao * tempo;
		double diasPlaneta = tempoHoras/24;
		double anosPassados = diasPlaneta/365;
		
		String diasFormatado = String.format("%.2f", diasPlaneta);
		String anosFormatados = String.format("%.4f", anosPassados);
		
		System.out.println("Velocidade de translacao do planeta " + getNome() + ": " + tempoHoras);
		System.out.println("Dias passados (em horas) no planeta " + getNome() + ": " + diasFormatado);
		System.out.println("Anos JavaLar passado no planeta  " + getNome() + ": " + anosFormatados);
		System.out.println();
	}
	
	public void incrementoBugsColididos() {
		bugsColididos++;
	}
	
	public int getBugsColididos() {
		return bugsColididos;
	}
	public void incrementoDevsColididos() {
		devsColididos++;
	}
	public int getDevsColididos() {
		return devsColididos;
	}

	public String toString() {
	    return "Planeta: " + nome + "\nPosição X: " + posicaoX + "\nPosição Y: " + posicaoY;
	}

	public double getPosicaoAtual() {
		return posicaoAtual;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getmRotacao() {
		return mRotacao;
	}

	public void setmRotacao(double mRotacao) {
		this.mRotacao = mRotacao;
	}

	public double getmTranslacao() {
		return mTranslacao;
	}

	public void setmTranslacao(double mTranslacao) {
		this.mTranslacao = mTranslacao;
	}

	public void adicionarBugs(int quantidade) {
		
	}

	public void adicionarDesenvolvedores(int quantidade) {
		
	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
}