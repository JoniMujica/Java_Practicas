import java.util.Scanner; //es como el <include> 

public class inputs{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);  /*asi defino una variabble x teclado, y en el new le asigno que sera "input" <in>*/
		String nombre = "";
		int numUno = 0,numDos = 0,res = 0;
		
		System.out.println("¿Cual es tu nombre?");
		nombre = teclado.nextLine();  /*Line parara guardar string, next -> int,float etc.....*/
		System.out.println("Dame el primer valor para la suma: ");
		numUno = teclado.nextInt();
		System.out.println("Dame el segundo valor para la suma: ");
		numDos = teclado.nextInt();
		
		res = numUno+numDos;
		System.out.println("Hola " + nombre + " el resultado de tu suma es: " + res);
		
	}
}