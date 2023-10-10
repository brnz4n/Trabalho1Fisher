package javaLar;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaLarSystem {
	
	private ArrayList<Planeta> planetas;
	private int qBugs;
	private int qDevs;
	private int qInstantes;
	private int qTempo;
	private PlanoCartesiano plano;
	Scanner input = new Scanner(System.in);
	
	public JavaLarSystem() {
		System.out.println("Bem vindo ao Sistema JavaLar!\n\n");
		solicitarDados();
		input = new Scanner(System.in);
		plano = new PlanoCartesiano(qBugs, qDevs);
	}
	public void Planetas() {
		planetas = new ArrayList<>();
		qBugs = 0;
		qDevs = 0;
		
		Python pyhton = new Python("Python", 8 , 7, plano);
		JavaScript JavaScript = new JavaScript("JavaScript",9,7,plano);
		Ruby_on_Rails Ruby_on_Rails = new Ruby_on_Rails("Ruby_on_Rails",10,7,plano);
		PHP PHP = new PHP("PHP",11,7,plano);
		CSharp CSharp = new CSharp("Csharp", 12 , 7, plano);
		Cmais_mais Cmais_mais = new Cmais_mais("C++",13,7,plano);
		C C = new C("C",14,7,plano);
		
		planetas.add(pyhton);
		planetas.add(JavaScript);
		planetas.add(Ruby_on_Rails);
		planetas.add(PHP);
		planetas.add(CSharp);
		planetas.add(Cmais_mais);
		planetas.add(C);
	}
	
	public void solicitarDados() {
		boolean dadosValidos = false;
		do {
			System.out.println("Digite a quantidade de instantes desejada: ");
			try {
				qInstantes = input.nextInt();
			}catch (Exception e) {dadosValidos = false;input.nextLine();}
			System.out.println("Digite a quantidade de tempo do instante: ");
			try {
				qTempo = input.nextInt();
				dadosValidos = true;
			}catch (Exception e) {dadosValidos = false;input.nextLine();}
			System.out.println("Digite a quantidade de desenvolvedores: ");
			try {
				qDevs = input.nextInt();
			}catch (Exception e) {dadosValidos = false;input.nextLine();}
			
			System.out.println("Digite a quantidade de bugs desejada:");
			try {
				qBugs = input.nextInt();
				dadosValidos = true;
			}catch (Exception e) {dadosValidos = false;input.nextLine();}
			
		}while(!dadosValidos);
	}
	
	public void imprimirInformacoes() {
		
		for(int instante = 0; instante < qInstantes; instante++) {
			for (Planeta planeta : planetas) {
				planeta.movimento(qInstantes);
				planeta.calcularTempo(qTempo);	
			}
			plano.verificarColisoes();
			plano.posicoesBugsDevs();
	}		
		for(Planeta planeta: planetas) {
		System.out.println("\nPlaneta: " + planeta.getNome());
		System.out.println("Posição X: " + planeta.getPosicaoX());
		System.out.println("Posição Y: " + planeta.getPosicaoY());
		System.out.println();
			}
		solicitarSaidaOuReinicio();
		
}
	
	public void solicitarSaidaOuReinicio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja sair do programa? (S para sair, R para recomeçar)");
        String escolha = scanner.nextLine().trim().toUpperCase();
        if (escolha.equals("S")) {
            System.out.println("Encerrando o programa. Adeus!");
            System.exit(0);
        } else if (escolha.equals("R")) {
            System.out.println("Reiniciando o programa...");
            Planetas(); 
            solicitarDados();
            imprimirInformacoes();
        } else {
            System.out.println("Escolha inválida. Continuando...");
        }
    }

}

