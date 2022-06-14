public class condicionales{
	public static void main(String args[]){
		int matematica = 5;
		int biologia = 3;
		int quimica =  7;
		int promedio = 0;
		
		promedio = (matematica + biologia + quimica)/3;
		
		if(promedio >= 6){
			System.out.println("El alumno aprobo! promedio: " + promedio);
		}else{
			System.out.println("El alumno reprobo! promedio: " + promedio);
		}
	}
}