package evaluacionDos;

/**
 * Clase Hija Television
 * @author: ANDRES URIBE N.
 * @version: 28/02/2020/A
 */
public class Television extends Electrodomestico{
	
    //Atributos 	  
    private int resolucion;
    private boolean sintonizadorTDT;
  
    //Constantes

    private final static int CONSTANTTE_RESOLUCION=20;
  
    //Métodos

    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double extra=super.precioFinal();
  
        //Si la resolucion es mayor a 40 el valor se incrementa en 30%
        if (resolucion>40){
            extra+=precioBase*0.3;
        }
      //Si tiene sintonizador TDT el valor aunmenta en 50
        if (sintonizadorTDT){
            extra+=50;
        }
  
        return extra;
    }
  
    /**
     * Constructor por defecto
     */

    public Television(){
        this(CONSTANTE_PRECIO, CONSTANTE_PESO, CONSTANTE_CONSUMO, CONSTANTE_COLOR, CONSTANTTE_RESOLUCION, false);
    }
    
    /**
     * Constructor con dos parametros
     * @param precioBase
     * @param peso
     */

    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSTANTE_CONSUMO, CONSTANTE_COLOR, CONSTANTTE_RESOLUCION, false);
    }
    
    /**
     * Constructor con seis parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param resolucion
     * @param sintonizadorTDT
     */

    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
}
