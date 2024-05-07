package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class testMaximaNota {

	static int [] array1;
	static int [] array2;
	static int [] array3;
	
	@BeforeAll
	static void setup() {
		array1 = new int [] {1,2,3,4};
		array2 = new int [] {2,10,6,0};
		array3 = new int [] {5,-2,3,5};
		
	}
	
	@Test
	void maximaNotaArray1() {
		int numEsperado = 4;
		int numObtenido = MisArrays.maximaNota(array1);
		assertEquals(numEsperado,numObtenido);		 
	}
	
	@Test
	void maximaNotaArray2() {
		int numEsperado = 10;
		int numObtenido = MisArrays.maximaNota(array2);
		assertEquals(numEsperado,numObtenido);		 
	}
	
	@Test
	void maximaNotaArray3() {
		Exception ex = assertThrows(IllegalArgumentException.class, ()-> MisArrays.maximaNota(array3));
		String mensajeEsperado = "Las notas deben estar entre 0 y 10";
		String mensajeObtenido = ex.getMessage();
		assertEquals(mensajeEsperado,mensajeObtenido);
	}

}
