package ejercicios;

public class Ejercicio01TiposDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// --- VARIABLES SIMPLES/PRIMITIVAS ---
			// Enteros
			
			byte enteroByte = 123;
			short enteroShort = 30_000;
			int enteroInt = 2_000_000_000;
			long enteroLong = 2_147_483_700_000L;
			
			// reales
			
			float numeroFloat = 12;
			float numeroFloat2 = 12.4F;
			double numeroDouble = 1.7e4;
			double numeroDouble2 = 12.98; 
	
			// caracter
	
			char car1 = 'a', car2 ='b', car3 = 'g';
			
			// boolean
			
			boolean existe = true, esta = false ;
		//--- Hasta aqui son VARIABLES PRIMITIVAS, CONTIENEN LOS DATOS, SIMPLES, 1 VARIABLE, 1 CONTENIDO ---
		
		// --- OBJETOS DE CLASES, VARIABLE CONTIENE UNA REFERENCIA AL OBJETO, las simples contenian el valor ---
			//-- lo privado(Lo que no ves) son los datos de la variable, lo publico son los metodos para operar y hacer cosas con las variables
			// cadenas de caracteres
			
			String nombre = "tomas";
			
			System.out.println("El byte tiene : " + enteroByte);
			System.out.println("El caracter uno tiene : " + car1);
			System.out.println(nombre.toUpperCase());
			System.out.println(nombre);
	}

}
