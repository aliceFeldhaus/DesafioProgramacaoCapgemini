import javax.swing.JOptionPane;

public class Asteriscos {

	public static void main(String[] arge) {

		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Escreva um n�mero: ")); //Solicita um n�mero para criar a escada, e salva na variavel n
		for (int i = 0; i < n; i++) { //Faz o la�o de repeti��o pela quantidade de vezes informada pelo usu�rio (n)
			for (int j = n - i; j > 1; j--) { //coloca os espa�os em branco de forma decrescente
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) { //Coloca os asteriscos de forma crescente
				System.out.print("*");
			}
			System.out.println(""); //Quebra de linha
		}
	}
}