package Clase6;

public class Auto {
	//atributos
	
	String marca;
	String modelo;
	float velocidad;
	boolean encendido;
	float velocidadMaxima;
	
	
	//constructor
	Auto(String marca, String modelo, float velocidadMaxima){
		//this hace referencia a las variables  metodos propias de la clase
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	//metodos
	void encender() {
		if(encendido == false) {
			encendido = true;
			System.out.println("Se ha encendido el auto");
				
		}else {
			System.out.println("Ya está encendido el auto");
		}
		
	}
	
	void apagar() {
		if(encendido) {
			encendido = false;
			System.out.println("Se ha apagado el auto");
				
		}else {
			System.out.println("Ya esta apagado");
		}
		
		
	}
	
	void acelerar() {
		if(encendido == true) {
			if(velocidad < velocidadMaxima) {
				velocidad ++;
			}else {
				System.out.println("Velocidad Maxima, no es posible acelerar mas");
			}
		}else {
			System.out.println("Encienda el auto primero");
		}
		
	}
	
	void frenar() {
		if(encendido) {
			if(velocidad>0) {
				velocidad--;
			}else {
				System.out.println("El auto se detuvo ya");
			}
		}else {
			System.out.println("El auto esta apagado");
		}
		
		}	
	float obtenerVelocidad() {
		return velocidad;
		
	}
	
	public void detalleAuto() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Encendido: " + this.encendido);
		System.out.println("Velocidad: " + this.velocidad);
		System.out.println("Velocidad Maxima: " + this.velocidadMaxima);
	}
}
