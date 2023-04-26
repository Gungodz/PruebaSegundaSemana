/*
 * Copyright (c) 2016-2023 Sinensia and contributors
 *
 * This work is dual-licensed under the Apache License 2.0
 * and European Union Public License. See LICENSE file for details.
 */

package prueba.semana1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.EntityManager;

import org.apache.logging.log4j.core.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import prueba.hibernate.jpa.model.Coche;
import training.lab.hibernate.jpa.persistence.JPAPersistence;

/**
 * Clase en la que se realizan las pruebas unitarias.
 * A dia de hoy, solo hay unaprueba de un insert de la clase Coche
 *
 * @since 1.0.0
 * @author Carlos Arranz
 */


public class MyAppTest {
	
	static Coche instance;
	static EntityManager entity;
	
	public MyAppTest(){
		
	}
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		instance = new Coche();
		entity = JPAPersistence.getEntityManagerFactory().createEntityManager();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("*Test Insert Coche*");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("*Test Insert Coche Inicio*");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Hora:"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
	}

	@Test
	public void test1() {
		
		instance.setColor("Rojo");
		instance.setMarca("Toyota");
		instance.setPrecio("20.000");
		instance.setMatricula("SADF12");
		instance.setTipoMarchas("Manual");
        
        entity.getTransaction().begin();
		entity.persist(instance);
		entity.getTransaction().commit();
		
		System.out.println("Vehiculo creado e insertado en BD");
		
		Coche result = entity.find(Coche.class, "SADF12");
		
		assertEquals(instance, result);
	}
	
}
