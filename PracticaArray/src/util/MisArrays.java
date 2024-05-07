package util;

public abstract class MisArrays {
	
	/**
	 * Devuelve la media en float de los numeros que hay dentro de un array de numeros de tipo int
	 * 
	 * @param array de numeros	el array de los numeros que queremos obtener la media
	 * @return					el numero que nos da tras calcular la media de tipo float
	 * @throws IllegalArgumentException	Excepcion lanzada si alguna nota no esta entre los parametros indicados
	 */
	public static float mediaNotas(int[] notas) {
		     
        int suma = 0;
        
        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
            }
            suma += nota;
        }
        
        float media= (float)suma/notas.length;

        return media;
        
	}
    

}
