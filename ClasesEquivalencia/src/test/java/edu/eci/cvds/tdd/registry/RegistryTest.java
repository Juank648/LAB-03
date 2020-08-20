package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

/**
*Clase de pruebas para Registry
*/

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person();

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }

    // TODO Complete with more test cases
}