package es.uclm.esi.bc01.testingP1;

import static org.junit.Assert.*;
import org.junit.Test;

import es.uclm.esi.bc01.testingP1.Fecha;
import es.uclm.esi.bc01.testingP1.P1_Metodos;
import es.uclm.esi.bc01.testingP1.negativoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problema1Test {
	
	final static Scanner sc = new Scanner(System.in);
	
	boolean bisiesto = true;
	boolean noBisiesto = false;
	boolean fechaCorrecta = true;
	boolean fechaIncorrecta = false;
	
	@Test
	public void comprobarConstructor() throws negativoException{
		new Fecha(-3, -2, -5);
		new Fecha(2, 2, 2000);
	}

	@Test
	public void comprobarBisiestoTest() throws negativoException {
		assertEquals(noBisiesto, P1_Metodos.comprobarBisiesto(new Fecha(1,1,99)));
		assertEquals(noBisiesto, P1_Metodos.comprobarBisiesto(new Fecha(1,1,3)));
		assertEquals(bisiesto, P1_Metodos.comprobarBisiesto(new Fecha(1,1,400)));
	}
	
	@Test
	public void comprobarFechaCorrectaTest() throws negativoException {
		assertEquals(fechaCorrecta, P1_Metodos.comprobarFecha(new Fecha(12,1,99)));
		assertEquals(fechaIncorrecta, P1_Metodos.comprobarFecha(new Fecha(32,1,99)));
		assertEquals(fechaIncorrecta, P1_Metodos.comprobarFecha(new Fecha(0,1,400)));
		assertEquals(fechaCorrecta, P1_Metodos.comprobarFecha(new Fecha(10,1,400)));
		
		assertEquals(fechaCorrecta, P1_Metodos.comprobarFecha(new Fecha(1,7,99)));
		assertEquals(fechaIncorrecta, P1_Metodos.comprobarFecha(new Fecha(1,0,99)));
		assertEquals(fechaIncorrecta, P1_Metodos.comprobarFecha(new Fecha(1,20,400)));
		assertEquals(fechaCorrecta, P1_Metodos.comprobarFecha(new Fecha(1,10,400)));
	}

	@Test
	public void comprobarDecisionesTest() throws negativoException {
		assertEquals(fechaCorrecta, P1_Metodos.comprobarFecha(new Fecha(12,7,3)));
		assertEquals(noBisiesto, P1_Metodos.comprobarBisiesto(new Fecha(12,7,3)));

		assertEquals(fechaIncorrecta, P1_Metodos.comprobarFecha(new Fecha(32,0,3)));
		assertEquals(noBisiesto, P1_Metodos.comprobarBisiesto(new Fecha(32,0,3)));

		assertEquals(fechaIncorrecta, P1_Metodos.comprobarFecha(new Fecha(0,20,400)));
		assertEquals(bisiesto, P1_Metodos.comprobarBisiesto(new Fecha(0,20,400)));
	}
	
}
