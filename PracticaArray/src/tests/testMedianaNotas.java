package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class testMedianaNotas {

	static int [] array1;
	static int [] array2;
	static int [] array3;
	
	@BeforeAll
	static void setup() {
		array1 = new int [] {10,2,3,4};
		array2 = new int [] {6,5,4,2,8};
		array3 = new int [] {5,-2,3,5};
		
	}
	
	@Test
	void medianaNotasArray1() {
		float numEsperado = 3.5f;
		float numObtenido = MisArrays.medianaNotas(array1);
		assertEquals(numEsperado,numObtenido);		 
	}
	
	@Test
	void medianaNotasArray2() {
		float numEsperado = 5f;
		float numObtenido = MisArrays.medianaNotas(array2);
		assertEquals(numEsperado,numObtenido);		 
	}
	
	@Test
	void medianaNotasArray3() {
		Exception ex = assertThrows(IllegalArgumentException.class, ()-> MisArrays.medianaNotas(array3));
		String mensajeEsperado = "Las notas deben estar entre 0 y 10";
		String mensajeObtenido = ex.getMessage();
		assertEquals(mensajeEsperado,mensajeObtenido);
	}

}
