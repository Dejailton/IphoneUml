package iphone;

import java.util.Scanner;

import iphone.aparelhotelefonico.AparelhoTelefonico;
import iphone.navegadorinternet.NavegadorInternet;
import iphone.reprodutormusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	public void ligar() {
			System.out.println("Ligando...");
	}
	
	public void atender() {
		System.out.println("Atendendo a ligação.");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o correio de voz.");
	}
	

	public void tocar() {
		System.out.println("Tocando a música.");
	}

	public void pausar() {
		System.out.println("Música pausada.");		
	}

	public void selecionarMusica() {
		System.out.println("Selecionando a música.");			
	}

	public void exibirPagina() {
		System.out.println("Exibindo a página.");
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba.");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando a página.");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		Iphone iphone = new Iphone();
		int valor;
		
		do {
			System.out.println("Opções: \n" + "1: Executa uma ligação.\n"
					+ "2: Atender a ligação. \n" + "3: Iniciar correio de voz. \n" + "4: Selecionar música \n"
					+ "5: Pausa música \n" + "6: Selecionar música. \n" + "7: Exibir página. \n"
					+ "8: Adicionar nova aba \n" + "9: Atualizar página. \n" 
					+ "0: Desliga o iphone. \n" + "Selecione a opção desejada:");
			valor = scanner.nextInt();
			
			switch(valor) {
				
				case 1:
					iphone.ligar();
					Thread.sleep(1000);
					break;
				case 2:
					iphone.atender();
					Thread.sleep(1000);
					break;
				case 3:
					iphone.iniciarCorreioVoz();
					Thread.sleep(1000);
					break;
				case 4:
					iphone.tocar();
					Thread.sleep(1000);
					break;
				case 5:
					iphone.pausar();
					Thread.sleep(1000);
					break;
				case 6:
					iphone.selecionarMusica();
					Thread.sleep(1000);
					break;
				case 7:
					iphone.exibirPagina();
					Thread.sleep(1000);
					break;
				case 8:
					iphone.adicionarNovaAba();
					Thread.sleep(1000);
					break;
				case 9:
					iphone.atualizarPagina();
					Thread.sleep(1000);
					break;
			}
		} while (valor != 0);
		System.out.println("Iphone desligado.");
		scanner.close();
	}
	
}
