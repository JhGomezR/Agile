package uniandes.cupi2.cupiVoleibol.mundo;

import java.util.ArrayList;

public class Equipo 
{
	
	//Constantes
	public static final String INFANTIL = null;
	public static final String MAYORES = null;
	public static final String JUVENIL = null;
	
	//Atributos
		/**
		 *Nombre del equipo 
		 */
		private String nombre;
		
		/**
		 *Categoria del equipo 
		 */	
		private String categoria;
		
		/**
		 *Cantidad de aficionados del equipo 
		 */	
		private int cantidadAficionados;
		
		/**
		 *Imagen  del equipo 
		 */	
		private String imagen;
		
		/**
		 *Imagen  del equipo 
		 */	
		private Jugador jugadores;
		
	
	//Constructor		
	public Equipo(String nombre, String categoria, int cantidadAficionados,	String imagen) 
	{
			super();
			this.nombre = nombre;
			this.categoria = categoria;
			this.cantidadAficionados = cantidadAficionados;
			this.imagen = imagen;
	}
		

	public String darNombre() 
	{
		// TODO Auto-generated method stub
		return nombre;
	}

	public String darCategoria() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public int darCantidadAficionados() 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String darImagen() 
	{
		// TODO Auto-generated method stub
		return imagen;
	}

	public Patrocinador darPatrocinador() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Jugador darJugadores() 
	{
		// TODO Auto-generated method stub
		return jugadores;
	}
	
	public int darCantidadJugadoresSobrepeso() 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void agregarJugador (String nombre, String cedula, double estatura, double peso) throws Exception
	{
		if( jugadores == null )
        {
			jugadores = new Jugador ( nombre,  cedula,  estatura, peso);            
        }
        else
        {
            throw new Exception( "Ya existe un jugador de nombre: " + nombre + "." );
        }
	}


}
