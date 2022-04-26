package ProjectAgency;
import java.util.Scanner;

public class Address {
    private String publicPlace; 
    private int number; 
    private int postalCode; 

    Scanner input = new Scanner(System.in);

    public Address(){
        System.out.println("Digite o Logradouro da Agencia (String):");
        publicPlace = input.nextLine();
        System.out.println("Digite o numero do logradouro da Agencia (Inteiro):");
        number = input.nextInt();
        System.out.println("Digite o CEP da Agencia (Inteiro):");
        postalCode = input.nextInt();
    }

    public void printAddress(){
        System.out.printf("Endereço: %s \nNumero: %d \nCEP: %d\n", publicPlace, number, postalCode);
    }
}
