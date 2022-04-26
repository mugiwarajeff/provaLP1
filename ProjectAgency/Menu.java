package ProjectAgency;
import java.util.Scanner;
public class Menu {
    private boolean condition;
    private Repository BD;
    
    public Menu(){
        condition = true;
        BD = new Repository();
    }

    public void show(){
        Scanner input = new Scanner(System.in);
        int option = 0;

        while (condition){
            System.out.println("Menu do Projeto");
            System.out.println("--------------------");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Remover");
            System.out.println("3 - Alterar");
            System.out.println("4 - Mostrar");
            System.out.println("5 - Sair");
            System.out.println("");
            System.out.println("Digite a opção desejada: ");
            option = input.nextInt();
            
            if(option == 1){
                BD.insert(new Agency());
            }else if (option == 2){
                BD.removeById();
            }else if (option == 3){
                BD.ChangeByIndex(new Agency());
            }else if(option == 4){
                BD.showBD();  
            }else if (option == 5){
                condition = false;
                System.out.println("Obrigado por usar o nosso Sistema!!");
                System.out.println("");
                System.out.println("");
                System.out.println("By: Jeff && Froes");
            }else {
                System.out.println("Opção invalida...");
            }
        }
        input.close();
    }
}
