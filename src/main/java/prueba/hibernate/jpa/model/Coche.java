package prueba.hibernate.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Coche.java Clase para el objecto Coche
 */
@Entity
public class Coche extends Vehiculo {
	@Column
    protected String tipoMarchas;
    protected static final String TIPO = "Coche";

    /**
     * Constructor de la clase Coche.
     *
     * @param color       color del vehiculo
     * 
     * @param marca       marca del vehiculo
     * 
     * @param precio      precio del vehiculo
     * 
     * @param matricula   matricula del vehiculo
     * 
     * @param tipoMarchas tipo de marchas del coche
     * 
     */
    public Coche(String color, String marca, String precio, String matricula, String tipoMarchas) {
        super(color, marca, precio, matricula, 4); // Siempre tiene 4 ruedas si es un coche
        this.tipoMarchas = tipoMarchas;

    }
    
    public Coche() {
		super();
	}

	public String getTipoMarchas() {
        return tipoMarchas;
    }

    public void setTipoMarchas(String tipoMarchas) {
		this.tipoMarchas = tipoMarchas;
	}

	/**
     * imprime los datos del coche.
     *
     **/
    @Override
    public void imprimirDatos() {
        System.out.println("Este vehiculo es un coche");
        System.out.println("Este coche tiene una marcha " + tipoMarchas);
        super.imprimirDatos();
    }

}
