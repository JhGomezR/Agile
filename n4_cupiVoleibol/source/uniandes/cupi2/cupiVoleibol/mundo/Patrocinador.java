package uniandes.cupi2.cupiVoleibol.mundo;

public class Patrocinador 
{
	
	//Atributos
	/**
	 * Nombre patrocinador
	 */
	private String nombre;
	
	/**
	 * Nombre patrocinador
	 */
	private int anhosContrato;
	
	/**
	 * Nombre patrocinador
	 */
	private double dineroAportado;
	
			
	//Constructor
	public Patrocinador(String nombre, int anhosContrato, double dineroAportado) 
	{
		super();
		this.nombre = nombre;
		this.anhosContrato = anhosContrato;
		this.dineroAportado = dineroAportado;
	}

	public String darNombre() 
	{
		// TODO Auto-generated method stub
		return nombre;
	}

	public int darAnhosContrato() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public double darDineroAportado() 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	

}
