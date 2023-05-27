package com.cursoceat.modell;
/**
 * 
 * @author Victoria
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sorteo <T>{
	//Creamos el conjunto set para insertar los elementos
	//final->constante,
	private final Set<T> elementos;
	 //en el mopmento que se contruye un bojeto de tipo sorteo...se crea el conjunto
	public Sorteo() {
		elementos=new TreeSet<>();
	}
	//por medio de un metodo agregamos elementos y los devolvemos
	public boolean agregar(T nuevo) {
		return elementos.add(nuevo);
	}
	//metodo premiado-> esa coleccion elementos
	//1. un nuevo conjunto set...Premiados
	public Set<T> premiados(int cantidadP){
		Set<T> premiado=null;//se crea con el fin de devolver los premiados ordenados
		List<T> tem= new ArrayList<>(elementos);
		//Con shuffle la lista temporal se desordena
		Collections.shuffle(tem);
		//tenemos que controla que elemntos tenga elementos
		//y sea mayor que conatidadPremiados
		if(cantidadP<elementos.size()) {
			premiado=new TreeSet<>();
			//insertamos el premiado los primeros elementos que tiene temp segun
			//la cantidad
			for(int i=0; i<cantidadP;i++) {
				premiado.add(tem.get(i));
			}
		}
		return premiado;
	}
	@Override
	public String toString() {
		return "\n Sorteo [\n elementos=" + elementos + "]";
	}
	
}
