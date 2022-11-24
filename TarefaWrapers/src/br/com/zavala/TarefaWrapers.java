package br.com.zavala;

import java.util.Scanner;

/**
 * 
 * @author Ramiro
 *
 * Tarefa Modulo 9 - Wrapers.
 * Declarar uma variável primitiva. Receber um valor para ela
 * via console. Fazer a conversão para o tipo wraper que corresponde.
 * Imprimir no console o valor da nova variável do tipo wraper.
 */
public class TarefaWrapers {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
	    System.out.println("Digite um valor inteiro : ");
	    // variável do tipo primitivo
	    int valorPrimitivo = s.nextInt();
	    
	    //atribuindo um valor primitivo para uma variável wraper
	    //aproveitamos o método toString atrelado à variável do tipo wraper
	    Integer valorWraper = valorPrimitivo;
	    System.out.println("Valor wraper : " + valorWraper.toString());

	}

}
