package prueba.hibernate.jpa.controller;

import javax.persistence.EntityManager;

import prueba.hibernate.jpa.model.Coche;
import prueba.hibernate.jpa.model.Vehiculo;
import prueba.hibernate.jpa.utils.VehiculoManager;
import training.lab.hibernate.jpa.persistence.JPAPersistence;

/**
 * MyApp.java
 *
 * @autor: Antonio Garces
 * @revisor: Carlos Arranz
 * @version: 1.0
 */
public class MyApp {

    /**
     * Pide al usuario que seleccione un vehiculo y una accion.
     *
     * @param args linea de comandos
     */
	static EntityManager entity;
	
    public static void main(String[] args) {
        
        entity = JPAPersistence.getEntityManagerFactory().createEntityManager();
        
        Coche coche = new Coche();
        
        coche.setColor("Rojo");
        coche.setMarca("Toyota");
        coche.setPrecio("20.000");
        coche.setMatricula("SADF12");
        coche.setTipoMarchas("Manual");
        
        entity.getTransaction().begin(); //aqui le digo que inicie la transacción
		entity.persist(coche); //aqui le indico a través del método persidt que guarde en BD
		entity.getTransaction().commit(); //aqui le indico que culmine
		
		System.out.println("Vehiculo creado");
    }

}
