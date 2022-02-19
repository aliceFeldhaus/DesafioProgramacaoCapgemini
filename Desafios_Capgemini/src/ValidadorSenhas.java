import javax.swing.JOptionPane;

public class ValidadorSenhas {
    public static void main(String[] args) {
        
        String requisitos = "(?=.*[!@#$%^&*()-+])(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{6,}"; //Informa os caracteres requisitos (express�o regex)
        
        Boolean statusSenha = true; //Declarando variavel para controle do while
        
        while(statusSenha) { //O la�o se repete enquanto a senha for invalida
        	String senha = JOptionPane.showInputDialog("A senha deve conter os requisitos: \n*Conter no m�nimo 6 caracteres. \n*Conter no minimo uma letra mai�scula. \n*Conter no m�nimo uma letra min�scula. \n*Conter n�meros. \nDigite uma senha: ");
            
            if(senha.length() >=6 && senha.matches(requisitos)){ //Verifica se a senha � >= 6 e se ela cont�m os requisitos solicitados na express�o regex (requisitos)
            	JOptionPane.showMessageDialog(null, "Senha v�lida.", "Valida��o", 1 ); //Retorna ao usu�rio se a senha � v�lida, o n�mero 1 corresponde ao �cone apresentado na mensagem
                statusSenha = false;
            } else {
            	JOptionPane.showMessageDialog(null,"Senha inv�lida.", "Valida��o", 0 ); //Retorna ao usu�rio se a senha � inv�lida, o n�mero 0 corresponde ao �cone apresentado na mensagem
            }
        }
    }
}
