package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		//list.add("") para adcionar um elemento a sua lista, adcionando depois do ultimo
		list.add("Maria");
		list.add("Leandro");
		list.add("Lucas");
		list.add("Marco");
		list.add("Leonardo");
		
		//list.add(x,"") passando o parametro antes voce pode definir em que posicao o elemento ira ser adcionado
		list.add(2, "Bob");
		
		//O list.size() mostra o tamanho da lista 
		System.out.printf("O TAMANHO DA LISTA É: %d%n", list.size());
		
		
		for (String elemento : list) {
			System.out.println(elemento);
		}
		
		System.out.println("-------------------------");
		
		//list.remove() consegue remover o elemento da lista apenas pelo seu nome, nao precisando passar indice
		//porem list.remove(x) tambem ira funcionar passando a posicao do elemento
		list.remove("Lucas");
		// remover por predicado, removendo por exemplo todos os elementos da lista que comecam com a litra "M" 
		//  funcao (x -> x.charAt(0) == 'M' é uma lambda e funciona assim:
		//para cada x(string) na lista com o char igual a "M" e removido
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String elemento : list) {
			System.out.println(elemento);
		}
		
		System.out.println("-------------------------");
		
		//list.indexOf() funciona para achar a posicao do elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		//quando passa pra procurar um elemento que nao existe na lista ele retorna -1
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("-------------------------");
		
		//Para criar um filtro na lista (quero que apenas exista nosme que comecam com 'L')
		//Vou ter que criar uma nova lista para passar como resultado
		//stream() é um parametro para receber funcoes lambda 
		// para fazer operacoes lambda a interface list nao deixa, entao tem que converter para stream()
		//assim voce pode passar sua operacao lambda e depois tem que retornar para uma lista (.collect(Collectors.toList()))
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		
		for (String elemento : result) {
			System.out.println(elemento);
		}
		
		System.out.println("-------------------------");
		
		//agora quero pegar apenas o 1 elemnto da lista que comeca com "L"
		//usando o mesmo codigo para buscar os elementos que comecam com "L"
		//porem para pegar apenas o primeiro, uso o findFirst(), porem ele retoena uma opcional string
		//isso significa que pode ou nao retornar uma string, para isso e necessario usar orElse(null)
		//assim se o findFirst nao retornar uma string ele ira retornar nulo
		String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		
		System.out.println(name);
		
		
		
		
		
	}

}
