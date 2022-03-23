
public class Circulo {

	private double diametro;
	
	public Circulo() 
	{
		
	}
	
	public Circulo(double diametro) 
	{
		this.diametro=diametro;
	}
	
	//CALCULOS QUE SON LLAMADOS EN LA CLASE MAIN
	//CALCULO AREA
	public double CalcularArea(){
		double radio=this.calcularRadio();
		return Math.PI*Math.pow(radio,2);
	}
	//CALCULO RADIO
	public double calcularRadio() 
	{
		return this.diametro/2;
	}
	//CALCULO PERIMETRO
	public double calcularPerimetro() 
	{
		return Math.PI*this.diametro;
	}

	
	
	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	

}
