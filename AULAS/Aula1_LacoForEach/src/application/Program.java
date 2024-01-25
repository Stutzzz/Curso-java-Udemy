package application;

public class Program {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		/*
		for (int i = 0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		*/
		// for each - uma forma mais facil de percorrer um vetor
		// passando uma variavel para chamar o elemento (obj) e depois passando o vetor que ira percorrer
		// "PARA CADA OBJETO 'obj' CONTIDO EM VECT, FAÇA"
		for(String obj : vect){
			System.out.println(obj);
		}
	}

}
