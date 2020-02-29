package evaluacionDos;

/**
 * Clase Hija Lavadora
 * @author: ANDRES URIBE N.
 * @version: 28/02/2020/A
 */
public class Lavadora extends Electrodomestico{
	 //Atributo carga de lavadora
    private int carga;
     //Constantes
    private final static int CONSTANTE_CARGA=5;
  
	/**
     * Devuelve la carga de la lavadora
     */
    public int getCarga() {
        return carga;
    }
  
    /**
     * Precio final de la lavadora
     * @return precio final de la lavadora
     */
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double extra=super.precioFinal();
  
        //Si la carga es mayor que 30 su precio aunmentara en 50
        if (carga>30){
            extra+=50;
        }
  
        return extra;
    }
  
	/**
	 * Constructor por defecto
	 */

    public Lavadora(){
        this(CONSTANTE_PRECIO, CONSTANTE_PESO, CONSTANTE_CONSUMO, CONSTANTE_COLOR, CONSTANTE_CARGA);
    }
    
	/**
	 * Constructor con dos parametros
	 */

    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSTANTE_CONSUMO, CONSTANTE_COLOR, CONSTANTE_CARGA);
    }
    /**
     * Constructor con 5 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param carga
     */

    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
}
