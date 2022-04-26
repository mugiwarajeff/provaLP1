package ProjectAgency;
import java.util.Scanner;

public class Agency {
    private String name;
    private String cnpj; 
    private Address adress;
    private String managerName;

    Scanner input = new Scanner(System.in);
    public Agency(){
        System.out.println("Digite o nome da Agencia (String):");
        name = input.nextLine();
        System.out.println("Digite o CNPJ da Agencia (String):");
        cnpj = input.nextLine();
        adress = new Address();
        System.out.println("Digite o nome do gerente da Agencia (String):");
        managerName = input.nextLine();
    }

    public void showReport(){
        System.out.printf("Nome: %s\nCNPJ: %s\nNome do Gerente: %s\n", name, cnpj, managerName);
        adress.printAddress();
    }

    public String getName(){
        return name;
    }
}
