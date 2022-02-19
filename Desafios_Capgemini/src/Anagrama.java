import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Anagrama {

	public static void main(String[] args) {

		String palavra = JOptionPane.showInputDialog("Escreva uma palavra: "); //Declara a variavel (palavra) e solicita que o usu�rio informe uma palavra que ser� salva na vari�vel declarada.

		ArrayList<String> anagramas = new ArrayList<String>(); //Instancia arraylist de string

		for (int i = 0; i < palavra.length(); i++) { //Repete o c�digo abaixo de acordo com a quantidade de letras da palavra informada pelo usu�rio
			for (int j = 1; j < palavra.length(); j++) { //Repete o c�digo abaixo de acordo com a quantidade de letras da palavra informada pelo usu�rio -1 (come�a pela segunda letra)
				if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) { //Verifica se a letra correspondente a posi��o do i no momento � igual a letra correspondente a posi��o do j no momento
					if (palavra.charAt(i) == palavra.charAt(i + 1)) { //Verifica se a letra correspondente a posi��o do i no momento � igual a pr�xima letra 
						String x = palavra.substring(i, i + 1); //Se a condi��o acima for verdadeira, o anagrama par ser� salvo na variavel x
						anagramas.add(x); //Adiciona o parametro (no caso a variavel) no arraylist
					} else { //Executa caso a condi��o acima for falsa
						String y = palavra.substring(i, j); //Pega a combina��o do substring, a letra correspondente de i e j na pocis�o que a mesma est� no momento
						String z = palavra.substring(i + 1, j + 1); //Pega a posi��o de i no array e adiciona +1, retornando a posi��o de i e i+1 (0,1), e a mesma coisa com o j, j+1 retornando a posi��o atual e a pr�xima
						String h = palavra.substring(i, i + 1); //Pega a posi��o atual de i no array, e depois a posi��o atual de i e adiciona 1 (i+1), retornando i e i+1 (0,1)
						anagramas.add(h); //Adiciona o parametro (no caso a variavel) no arraylist
						anagramas.add(y); //Adiciona o parametro (no caso a variavel) no arraylist
						anagramas.add(z); //Adiciona o parametro (no caso a variavel) no arraylist
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null,"A quantidade de anagramas pares s�o: " + anagramas.size() + "\nAnagramas pares: " + anagramas); //Mostra a quantidade de anagramas pares e os anagramas pares
	}
}