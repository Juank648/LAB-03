package edu.eci.cvds.tdd.aerodescuentos;
 

import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;
import org.junit.Assert;
/**
*Clase de pruebas para Registry
*/

public class TarifasTest {
	private CalculadorDescuentos calcular = new CalculadorDescuentos();
	
	//Prueba que la salida sea igual a 133 a partir de la entrada 140, 14, 16
	@Test
	public void validateText_1(){
		double result = calcular.calculoTarifa(140, 14, 16);
        Assert.assertEquals(133.0, result, 0.01);
	}
	//Prueba que la salida sea igual a 90 a partir de la entrada 90, 18, 60
	@Test
	public void validateText_2(){
		double result = calcular.calculoTarifa(90, 18, 60);
        Assert.assertEquals(90.0, result, 0.01);
	}
	//Prueba que la salida sea igual a 211.6 a partir de la entrada 230, 19, 68
	@Test
	public void validateText_3(){
		double result = calcular.calculoTarifa(230, 19, 68);
        Assert.assertEquals(211.6, result, 0.01);
	}
	//Prueba que la salida sea igual a 340 a partir de la entrada 400, 24, 23
	@Test
	public void validateText_4(){
		double result = calcular.calculoTarifa(400, 24, 23);
        Assert.assertEquals(340.0, result, 0.01);
	}
	//Prueba que la salida sea igual a 260 a partir de la entrada 260, 3, 30
	@Test
	public void validateText_5(){
		double result = calcular.calculoTarifa(260, 3, 30);
        Assert.assertEquals(260.0, result, 0.01);
	}
	//Prueba que la salida sea igual a 510 a partir de la entrada 510, 14, 43
	@Test
	public void validateText_6(){
		double result = calcular.calculoTarifa(510, 14, 43);
        Assert.assertEquals(510.0, result, 0.01);
	}
	//Prueba que la salida sea igual a 462 a partir de la entrada 600, 24, 67
	@Test
	public void validateText_7(){
		double result = calcular.calculoTarifa(600, 24, 67);
        Assert.assertEquals(462.0, result, 0.01);
	}
	
	
}