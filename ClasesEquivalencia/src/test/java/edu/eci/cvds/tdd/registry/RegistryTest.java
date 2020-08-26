package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;
/**
*Clase de pruebas para Registry
*/

public class RegistryTest {

    private Registry registry = new Registry();
	

    @Test
	// Valida que el genero sea incorrecto, es decir que no sea MALE o FEMALE
    public void validateGenre() {

        Person person = new Person("Juan Mortago", 4539, 26, Gender.UNIDENTIFIED, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_GENRE, result);
    }
	@Test
	//Prueba si la persona esta muerta
    public void validateLife() {

        Person person = new Person("Hurtago Zacarias", 7456, 90, Gender.MALE, false);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
		
    }
	@Test
	//Prueba si el nombre es muy corto o muy largo
    public void validateName() {

        Person person = new Person("Al", 8907, 48, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_NAME, result);
		
    }
	@Test
	//Prueba si la persona es menor de 18 anios
    public void validateAge() {

        Person person = new Person("Julieta Nandez", 1209, 14, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
		
    }
	@Test
	//Prueba que la ID sea duplicada
    public void validateId() {

        Person personant = new Person("Julian Nandez", 7835, 20, Gender.MALE, true);
		Person person = new Person("Andres Fonseca", 7835, 45, Gender.MALE, true);
		
        RegisterResult resultpr = registry.registerVoter(personant);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
		
    }

}