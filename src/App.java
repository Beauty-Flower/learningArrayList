import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		String texto1 = "Programação orientada a objetos";
		String texto2 = "JAVA SE";
		String texto3 = "SENAI - Jandira";
		
		//Criação de um objeto do tipo ArrayList de Strings
		ArrayList<String> dados = new ArrayList<String>();
		
		//Adicionando no ArrayList dados:
		dados.add(texto1); //index 1
		dados.add(texto2); //index 2
		dados.add(texto3); //index 3
		
		//Removendo elementos de um ArrayList
		//dados.remove(1);
		
		if (dados.isEmpty()) {
			System.out.println("It's empty");
		} else {
			System.out.println("It's full " + dados.size()); //Mostrando o tamanho do vetor
			System.out.println();
			System.out.println("Dados: " + dados); //Mostrando os itens do ArrayList
			System.out.println();
			System.out.println("Índice 0: " + dados.get(0)); //Mostrando um item de cada vez
			System.out.println("Índice 1: " + dados.get(1));
			System.out.println("Índice 2: " + dados.get(2));
			System.out.println();
		}

		//Manipulando Arraylist com uso de loops de repetição:
		
		//Loop for
		System.out.println("---Loop for---");
		for (int i = 0; i < dados.size(); i++) {
			System.out.println("ìndice: " + i + " - Valor: " + dados.get(i));
		}
		
		System.out.println();
		
		//Loop foreach
		System.out.println("---Loop foreach---");
		for(String dado : dados) {
			System.out.println("Valor: " + dado);
		}
		
		System.out.println();
		
		//Método foreach do ArrayList com lambda
		System.out.println("---Loop foreach com lambda---");
		dados.forEach(dado->{
			System.out.println("Valor: " + dado);
		});
		
		System.out.println();
	}

}
