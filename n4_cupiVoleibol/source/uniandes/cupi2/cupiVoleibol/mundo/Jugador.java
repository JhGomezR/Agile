package uniandes.cupi2.cupiVoleibol.mundo;

import java.io.Console;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Jugador 
{
	
	//Constantes
	/**
	 * Constante
	 */
	public static final double ESTATURA_MIN = 0;
	public static final double ESTATURA_MAX = 0;

	
	//Atributos
	/**
	 *Nombre del jugador 
	 */
	private String nombre;
	
	/**
	 *Cedula del jugador 
	 */	
	private String cedula;
	
	/**
	 *Estatura del jugador 
	 */	
	private double estatura;
	
	/**
	 *PuntosAnotados del jugador 
	 */	
	private int puntosAnotados;
	
	/**
	 *Peso del jugador 
	 */
	private double peso;
	
	//Constructor	
	
	public Jugador(String nombre, String cedula, double estatura,double peso) 
	{
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.estatura = estatura;
		this.peso = peso;
	}
	
	
	public String darNombre() 
	{
		// TODO Auto-generated method stub
		return nombre;
	}
	public String darCedula() 
	{
		// TODO Auto-generated method stub
		return cedula;
	}
	public double darEstatura() 
	{
		// TODO Auto-generated method stub
		return estatura;
	}	
	public int darPuntosAnotados() 
	{
		// TODO Auto-generated method stub
		return puntosAnotados;
	}
	public double darPeso() 
	{
		// TODO Auto-generated method stub
		return peso;
	}


	public void registrarPuntosAnotados(int i) 
	{
		// TODO Auto-generated method stub
				
		
	}
	
	public boolean darSobrePeso(double peso,double altura)
    {
		boolean peso_ideal = false;
		boolean inf_ideal = false;
		boolean sobrepeso = false;
		
		double pesoActual=peso/(Math.pow(altura, 2)); 
		if (pesoActual>=20 && pesoActual<=65)
		{ 			
			return peso_ideal; 
		}
		else if(pesoActual<20)
		{ 
			return inf_ideal; 
		}
		else
		{ 
			return sobrepeso; 
		}        
            
        }    
	
	
	

}
