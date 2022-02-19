import javax.swing.JOptionPane;

public class ValidadorSenhas {
    public static void main(String[] args) {
        
        String requisitos = "(?=.*[!@#$%^&*()-+])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{6,}"; //Informa os caracteres requisitos (expressão regex)
        
        Boolean statusSenha = true; //Declarando variavel para controle do while
        
        while(statusSenha) { //O laço se repete enquanto a senha for invalida
        	String senha = JOptionPane.showInputDialog("A senha deve conter os requisitos: \n*Conter no mínimo 6 caracteres. \n*Conter no minimo uma letra maiúscula. \n*Conter no mínimo uma letra minúscula. \n*Conter números. \nDigite uma senha: ");
            
            if(senha.length() >=6 && senha.matches(requisitos)){ //Verifica se a senha é >= 6 e se ela contém os requisitos solicitados na expressão regex (requisitos)
            	JOptionPane.showMessageDialog(null, "Senha válida.", "Validação", 1 ); //Retorna ao usuário se a senha é válida, o número 1 corresponde ao ícone apresentado na mensagem
                statusSenha = false;
            } else {
            	JOptionPane.showMessageDialog(null,"Senha inválida.", "Validação", 0 ); //Retorna ao usuário se a senha é inválida, o número 0 corresponde ao ícone apresentado na mensagem
            }
        }
    }
}
