package evaluacionDos;

/**
 * Clase Padre Electrodomestico
 * 
 * @author: ANDRES URIBE N.
 * @version: 28/02/2020/A
 */
public class Electrodomestico {

	/**
	 * Los Atributos de la Clase son precio base, color, consumo energético (letras
	 * entre A y F) y peso.
	 * 
	 */
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	/**
	 * DEfinimos las constantes Color por defecto Blanco Consumo energetico sera F
	 * PrecioBase es de $100.000 Peso de 5 kg.
	 */
	protected final static String CONSTANTE_COLOR = "blanco";
	protected final static char CONSTANTE_CONSUMO = 'F';
	protected final static double CONSTANTE_PRECIO = 100000;
	protected final static double CONSTANTE_PESO = 5;

	// Métodos
	/**
	 * comprobamos que el color sea uno de los definidos, si no esta usamos el valor
	 * de la constante
	 */
	private void comprobarColor(String color) {

		// Colores definidos
		String colores[] = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean definido = false;

		for (int i = 0; i < colores.length && !definido; i++) {

			if (colores[i].equals(color)) {
				definido = true;

			}

		}

		if (definido) {
			this.color = color;

		} else {
			this.color = CONSTANTE_COLOR;

		}

	}

	/**
	 * Consumo electrico
	 */
	public void comprobarConsumoEnergetico(char consumoEnergetico) {
		// pasamos el caracter de consumo electrico a mayusculas

		if (Character.isUpperCase(consumoEnergetico)) {

			// System.out.print(consumoEnergetico);
			// no hacer nada

		} else if (Character.isLowerCase(consumoEnergetico)) {

			consumoEnergetico = (char) (consumoEnergetico - 'a' + 'A');
		}

		switch (consumoEnergetico) {
		case 'A':

			this.consumoEnergetico = consumoEnergetico;

			break;
		case 'B':

			this.consumoEnergetico = consumoEnergetico;

			break;
		case 'C':

			this.consumoEnergetico = consumoEnergetico;

			break;
		case 'D':

			this.consumoEnergetico = consumoEnergetico;
			break;
		case 'E':

			this.consumoEnergetico = consumoEnergetico;
			break;
		case 'F':

			this.consumoEnergetico = consumoEnergetico;
			break;

		default:
			this.consumoEnergetico = CONSTANTE_CONSUMO;

			break;
		}

	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

// agregamos un extra dependiendo del consumo y el peso
	public double precioFinal() {
		double extra = 0;
		switch (consumoEnergetico) {
		case 'A':
			extra += 100;
			break;
		case 'B':
			extra += 80;
			break;
		case 'C':
			extra += 60;
			break;
		case 'D':
			extra += 50;
			break;
		case 'E':
			extra += 30;
			break;
		case 'F':
			extra += 10;
			break;
		}

		if (peso >= 0 && peso < 19) {
			extra += 10;
		} else if (peso >= 20 && peso < 49) {
			extra += 50;
		} else if (peso >= 50 && peso <= 79) {
			extra += 80;
		} else if (peso >= 80) {
			extra += 100;
		}

		return precioBase + extra;
	}

	/**
	 * Constructor por defecto
	 */

	public Electrodomestico() {
		this(CONSTANTE_PRECIO, CONSTANTE_PESO, CONSTANTE_CONSUMO, CONSTANTE_COLOR);
	}
	
	/**
     * Contructor con solo 2 parametros
     * @param precioBase del electrodomestico
     * @param peso del electrodomestico
     */

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, peso, CONSTANTE_CONSUMO, CONSTANTE_COLOR);
	}

	/**
     * Contructor con 4 parametros
     * @param precioBase 
     * @param peso 
     * @param consumoEnergetico
     * @param color
     */
	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
		this.precioBase = precioBase;
		this.peso = peso;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

}