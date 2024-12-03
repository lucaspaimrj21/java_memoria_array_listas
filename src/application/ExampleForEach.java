package application;

public class ExampleForEach {

	public static void main(String[] args) {
		String[] vect = new String[] {"Lucas", "Rafael", "Fernanda"};
		
		for (int i=0; i<vect.length; i++) {
		System.out.println(vect[i]);
		}
		
		
		//PARA CADA ELEMENTO OBJ CONTIDO EM VECT, FAÇA:
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
