public class operadoresAritmeticos{
	public static void main(String args[]){
		int a = 4;
		int b = 4;
		int res = 0;
		res = a+b/2;
		System.out.println("El resultado incorrecto es: " + res);
		res = (a+b)/2;
		System.out.println("El resultado correcto es: " + res);
	}
}