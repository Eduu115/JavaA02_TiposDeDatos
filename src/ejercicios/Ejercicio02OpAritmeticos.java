package ejercicios;

public class Ejercicio02OpAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resultado = 0, a = 7, b = 7;
		
		resultado = a ++ ;
		System.out.println("resultado : " + resultado);
		System.out.println("resultado : " + a);
		
		resultado =  ++ b; 
		System.out.println("resultado : " + resultado);
		System.out.println("resultado : " + b++ );
		System.out.println("resultado : " + b);
		
		double hipotenusa = 0, cateto1=3 ,cateto2=4;
		
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2)+ Math.pow(cateto2, 2));
		System.out.println("La hipotenusa es : " + hipotenusa);
		
	}

}
