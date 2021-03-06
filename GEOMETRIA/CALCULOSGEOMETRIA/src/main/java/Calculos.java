import java.util.Scanner;

public class Calculos {
	public final static int OPCION_MENU_SALIR=5;
	public final static int OPCION_AREA_CIRCULO=4;
	public final static int OPCION_CALCULO_PERIMETRO_CIRCULO=3;
	public final static int OPCION_CALCULO_RADIO_CIRCULO=2;
	public final static int OPCION_CALCULO_AREA_RECTANGULO=1;

    private static Scanner sc;
	 public static void main(String [] args){
		 
			int opcionSeleccionada;
			do 
			{
				opcionSeleccionada=menu();
				switch(opcionSeleccionada) 
				{
				case OPCION_CALCULO_AREA_RECTANGULO:
					areaRectangulo();
					break;
				case OPCION_CALCULO_RADIO_CIRCULO:
					radioCirculo();
					break;
				case OPCION_CALCULO_PERIMETRO_CIRCULO:
					perimetroCirculo();
					break;
				case OPCION_AREA_CIRCULO:
					calcularAreaCirculo();
					break;
				case OPCION_MENU_SALIR:
					calcularAreaCirculo();
					break;
				}
			}while(opcionSeleccionada !=OPCION_MENU_SALIR );
			
			System.out.printf("Selecciono la opcion %d",opcionSeleccionada);

	 }
	 
	 private static void areaRectangulo() 
	 {
		Scanner scanner= new Scanner(System.in);
		System.out.println("por favor ingrese la base del rectangulo");
		double base= scanner.nextDouble();
		System.out.println("por favor ingrese la altura del rectangulo");
		double altura= scanner.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(base,altura);
		double area=rectangulo.calcularArea();
		System.out.printf("El area del rectangulo es %f %n%n",area);
	 }
	 private static void radioCirculo() 
	 {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Por favor ingrese el diametro del circulo");
		double diametro=scanner.nextDouble();
		
		Circulo circulo = new Circulo(diametro);
		double radio=circulo.calcularRadio();
		System.out.printf("El radio del circulo es %f %n%n",radio);
	 }
	 private static void perimetroCirculo() 
	 {
		 
		 Scanner scanner= new Scanner(System.in);
			System.out.println("Por favor ingrese el diametro del circulo");
			double diametro=scanner.nextDouble();
			
			Circulo circulo = new Circulo(diametro);
			double perimetro=circulo.calcularPerimetro();
			System.out.printf("El perimetro del circulo es %f %n%n",perimetro);
		  
	 }
	 private static void calcularAreaCirculo()
	 {
		 Scanner scanner= new Scanner(System.in);
			System.out.println("Por favor ingrese el diametro del circulo");
			double diametro=scanner.nextDouble();
			
			Circulo circulo = new Circulo(diametro);
			double area=circulo.calcularPerimetro();
			System.out.printf("El area del circulo es %f %n%n",area);
		 
		 
	 }
	
	   
	 private static int menu() 
		{
		    System.out.println("\n\n=====================");
			System.out.println("MENU DATOS SERVICIO\n=====================\n");
			System.out.println("1. CALCULAR AREA RECTANGULO");
			System.out.println("2. CALCULAR RADIO DE UN CIRCULO A PARTIR DEL DIAMETRO");
			System.out.println("3. CALCULAR PERIMETRO DEL CIRCULO");
			System.out.println("4. CALCULAR AREA DE UN CIRCULO");
			System.out.println("5. SALIR DEL PROGRAMA");

			System.out.println("\nPOR FAVOR INGRESE DATOS");
			
			Scanner scanner = new Scanner(System.in);
			int opcionseleccionada = scanner.nextInt();

			return opcionseleccionada;
		}
}
