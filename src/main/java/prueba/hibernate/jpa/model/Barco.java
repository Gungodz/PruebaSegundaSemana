package prueba.hibernate.jpa.model;

import javax.persistence.*;

/**
 * Barco.java Clase para el objecto Barco
 *
 * @autor: Antoni
 * @revisor: Carlos
 * @version: 1.0
 */

@Entity
public class Barco extends Vehiculo {
	@Column
    private String tipoBarco;
    protected static final String TIPO = "Barco";

    /**
     * Constructor de la clase Barco.
     *
     * @param color     El color del Barco.
     * @param marca     La marca del Barco.
     * @param precio    El precio del Barco.
     * @param matricula La matricula del Barco.
     * @param tipoBarco El tipo de Barco.
     */
    public Barco(String color, String marca, String precio, String matricula, String tipoBarco) {
        super(color, marca, precio, matricula, 0);
        this.tipoBarco = tipoBarco;

    }
    
    

    public Barco() {
		super();
	}



	/**
     * Devuelve el tipoBarco.
     *
     * @return String
     */
    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
		this.tipoBarco = tipoBarco;
	}

	@Override // <- Bien por el uso de Override
    public void imprimirDatos() {
        System.out.println("Este vehiculo es un barco");
        System.out.println("Este barco es de tipo" + tipoBarco);
        super.imprimirDatos();
    }

}
