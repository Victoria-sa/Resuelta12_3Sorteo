package com.cursoceat.controller;

import java.util.Scanner;

import com.cursoceat.modell.Sorteo;

/**
 * 
 * @author Victoria
 * C�digo para probar la clase Sorteo. Extraemos un conjunto
 * de valores premiados
 *
 */
public class Controller {

	public static void main(String[] args) {
		//Creamos el objeto sorteo instanciando la clase
		Sorteo<Integer> miSorteo = new Sorteo<>();
		//bucle para ir insertando
		for( int i=1;i<100;i++) {
			//insertamos la lsita con todos los elemntos
			miSorteo.agregar(i);
		}
		System.out.println(miSorteo);
		System.out.println(" Cuantos números quieres generar para el sorteo: ?");
		int n=new Scanner(System.in).nextInt();
		System.out.println("Premiados ->> " + miSorteo.premiados(n));
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		Sorteo<String> miNombres= new Sorteo<>();
		miNombres.agregar("Luna");
		miNombres.agregar("Sol");
		miNombres.agregar("Marte");
		miNombres.agregar("Jupiter");
		miNombres.agregar("Saturno");
		System.out.println(miNombres);
		System.out.println(" Cuantos nombres quieres generar para el sorteo: ?");
		 n=new Scanner(System.in).nextInt();
		System.out.println("Premiados ->> " + miNombres.premiados(n));
		
		
		
	

	}

}
