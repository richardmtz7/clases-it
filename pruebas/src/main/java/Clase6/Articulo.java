package Clase6;

public class Articulo {
	
	//atributos
	
	String titulo;
	float precio;
	String imagen;
	boolean favorito;
	boolean envioGratis;
	boolean tieneDecuento;
	boolean tieneCuotas;
	int cantidad;
	
	//constructor
	
	Articulo(String titulo, float precio, String imagen, boolean favorito, int cantidad, boolean tieneCuotas){
		if(precio > 20000) {
		this.envioGratis = true;
		
		}
		
		this.favorito = favorito;
		this.titulo = titulo;
		this.imagen = imagen;
		this.cantidad = cantidad;
		this.tieneCuotas = tieneCuotas;
		this.precio = precio;
	}
	
	void agregarAFavorito() {
		this.favorito = !this.favorito;
	}
	void detalleArticulo() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Imagen: " + this.imagen);
		System.out.println("Precio: " + this.precio);
		System.out.println("Cantidad: " + this.cantidad);
		
		
	}

}
