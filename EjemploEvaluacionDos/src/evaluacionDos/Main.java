package evaluacionDos;

/**
 * Clase Main - Ejecutora del Programa
 * @author: ANDRES URIBE N.
 * @version: 28/02/2020/A
 */
public class Main {

	public static void main(String[] args) {

		// Creamos las variables que usaremos para almacenar los totales de los
		// articulos
		double totalElectrodomesticos = 0;
		double totalTelevisiones = 0;
		double totalLavadoras = 0;
		// Creamos las variables que usaremos para contar la cantidad de tipo de
		// articulos
		int CantidadTeles = 0;
		int CantidadLavadoras = 0;
		int CantidadArticulos = 0;

		/*
		 *  creamos el array Electrodomesticos con 10 posiciones y los metodos para
		 *  llenar cada posicion
		 *  los metodos que esten vacios llamaran a sus constantes definidas en cada clase
		*/ 

		Electrodomestico Electrodomesticos[] = new Electrodomestico[10];

		Electrodomesticos[0] = new Television(200, 60, 'A', "amarillo", 30, false);
		Electrodomesticos[1] = new Lavadora(150, 30, 'A', "verde", 40);
		Electrodomesticos[2] = new Television(500, 80, 'a', "amarillo", 42, true);
		Electrodomesticos[3] = new Lavadora(200, 100, 'c', "rojo", 15);
		Electrodomesticos[4] = new Lavadora(600, 20, 'E', "violeta",5);
		Electrodomesticos[5] = new Electrodomestico(200, 20, 'h', "cafe");
		Electrodomesticos[6] = new Television(250, 70);
		Electrodomesticos[7] = new Lavadora(400, 100, 'A', "azul", 15);
		Electrodomesticos[8] = new Television(320, 60, 'b', "blanco", 30, true);
		Electrodomesticos[9] = new Electrodomestico(50, 10,'D',"negro");
		
		/*
		 * Recorremos el array, cada articulo pasara por su clase y por la clase Padre
		 * ya que son todos articulos electricos.
		 */

		for (int i = 0; i < Electrodomesticos.length; i++) {

			if (Electrodomesticos[i] instanceof Electrodomestico) {
				totalElectrodomesticos += Electrodomesticos[i].precioFinal();
				CantidadArticulos = CantidadArticulos + 1;
			}
			if (Electrodomesticos[i] instanceof Lavadora) {
				totalLavadoras += Electrodomesticos[i].precioFinal();
				CantidadLavadoras = CantidadLavadoras + 1;
			}
			if (Electrodomesticos[i] instanceof Television) {
				totalTelevisiones += Electrodomesticos[i].precioFinal();
				CantidadTeles = CantidadTeles + 1;

			}
		}

		
		// Imprimir resultado en pantalla
		System.out.println("Se contabilizaron " + CantidadLavadoras + " lavadoras y su total es = " + totalLavadoras);
		System.out.println("Se contabilizaron " + CantidadTeles + " televisores y su total es = " + totalTelevisiones);
		System.out.println("Se contabilizaron " + CantidadArticulos + " articulos electricos y su total es = "
				+ totalElectrodomesticos);

	}

}