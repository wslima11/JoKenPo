package br.com.JoKenPo;

import java.util.Scanner;

public class JoKenPo {
	public static void main(String[] args) {
		// Logica do Jogador

		int jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("______JoKenPo______");
		System.out.println("___________________");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Digite a Opção Desejada");

		jogador = mao.nextInt();

		switch (jogador) {
		case 1:
			System.out.println("Jogador Escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador Escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador Escolheu TESOURA");
			break;

		default:
			System.out.println("OPÇÃO INVALIDA");
			break;
			
		}

		// Logica do Computador

		int computador = (int) (Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("Computador Escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador Escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador Escolheu TESOURA");
			break;

		default:
			System.out.println(" INVALIDA");
			break;
		}
		mao.close();
		// Determina Logica do Vencendor
		
		if(jogador != computador) {
			if((jogador == 1 && computador == 3)|| (jogador ==2 && computador ==1)||
				(jogador == 3 && computador ==2)){
			System.out.println("Jogador VENCEU");
		}else{
			System.out.println("Computador VENCEU");
		}
		}else {
			System.out.println( "EMPATE");
		}
	}
}
