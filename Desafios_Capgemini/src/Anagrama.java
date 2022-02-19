import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Anagrama {

	public static void main(String[] args) {

		String palavra = JOptionPane.showInputDialog("Escreva uma palavra: "); //Declara a variavel (palavra) e solicita que o usuário informe uma palavra que será salva na variável declarada.

		ArrayList<String> anagramas = new ArrayList<String>(); //Instancia arraylist de string

		for (int i = 0; i < palavra.length(); i++) { //Repete o código abaixo de acordo com a quantidade de letras da palavra informada pelo usuário
			for (int j = 1; j < palavra.length(); j++) { //Repete o código abaixo de acordo com a quantidade de letras da palavra informada pelo usuário -1 (começa pela segunda letra)
				if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) { //Verifica se a letra correspondente a posição do i no momento é igual a letra correspondente a posição do j no momento
					if (palavra.charAt(i) == palavra.charAt(i + 1)) { //Verifica se a letra correspondente a posição do i no momento é igual a próxima letra 
						String x = palavra.substring(i, i + 1); //Se a condição acima for verdadeira, o anagrama par será salvo na variavel x
						anagramas.add(x); //Adiciona o parametro (no caso a variavel) no arraylist
					} else { //Executa caso a condição acima for falsa
						String y = palavra.substring(i, j); //Pega a combinação do substring, a letra correspondente de i e j na pocisão que a mesma está no momento
						String z = palavra.substring(i + 1, j + 1); //Pega a posição de i no array e adiciona +1, retornando a posição de i e i+1 (0,1), e a mesma coisa com o j, j+1 retornando a posição atual e a próxima
						String h = palavra.substring(i, i + 1); //Pega a posição atual de i no array, e depois a posição atual de i e adiciona 1 (i+1), retornando i e i+1 (0,1)
						anagramas.add(h); //Adiciona o parametro (no caso a variavel) no arraylist
						anagramas.add(y); //Adiciona o parametro (no caso a variavel) no arraylist
						anagramas.add(z); //Adiciona o parametro (no caso a variavel) no arraylist
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null,"A quantidade de anagramas pares são: " + anagramas.size() + "\nAnagramas pares: " + anagramas); //Mostra a quantidade de anagramas pares e os anagramas pares
	}
}