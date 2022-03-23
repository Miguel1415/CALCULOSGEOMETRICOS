
public class Rectangulo {
	private double base;
	private double altura;

	
	public Rectangulo() 
	{
		
	}
	
	public Rectangulo (double base, double altura) 
	{
		this.base=base;
		this.altura=altura;
	}
	//CALCULO AREA_RECTANGULO
	public double calcularArea() 
	{
		return  this.base * this.altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}


