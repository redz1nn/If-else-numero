import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("**{Digite seu login:}**");
        String login = sc.next();
    if (login == "Admin") { 
  System.out.println("**{digite sua senha:}**"); 
  int senha = sc.nextInt();
    if (senha == 3333) {
System.out.println("Bem vindo, Admin");
        
            } else {
     System.out.println("Senha incorreta");          
            }
        } if ( login == "financeiro" ) {
    System.out.println("digite sua senha"); 
  int senha = sc.nextInt();              if (senha == 2222) {           System.out.println("Bem vindo, financeiro");
                               
            } else {                System.out.println("senha incorreta");
            }
      } else if (login.equals("cliente")) {          System.out.println("digite sua senha"); 
                                             int senha = sc.nextInt();
if (senha == 5555) {              System.out.println("Bem vindo, cliente");
       } else {
                System.out.println("senha incorreta");
}
                                            } else {     System.out.println("usuario não encontrado");
        }
        sc.close();
    }
}