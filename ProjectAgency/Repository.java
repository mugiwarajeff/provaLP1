package ProjectAgency;
import java.util.Scanner;

public class Repository {
    private int index;
    private Agency BD[];
    private static final int arrayLimit = 10;
    Scanner input = new Scanner(System.in);

    public Repository(){
        index = 0;
        BD = new Agency[arrayLimit];
    }

    public void insert(Agency agencia){
        BD[index] = agencia;
        index++;
    }

    public void removeByNameAgency(){
        System.out.println("Digite o nome da agencia a ser removida: ");
        String name = input.nextLine();
        for (int i = 0; i < index; i++){
            if (BD[i].getName() == name){
                for(int j = i; j < index; j++){
                    BD[j] = BD[j+1];
                } 
                index--;
            }
        }
    }

    public void removeById(){
        System.out.println("Digite o ID da agencia a ser removida: ");
        int id = input.nextInt();
        for (int i = 0; i < index; i++){
            if (i == id -1){
                for(int j = i; j < index; j++){
                    BD[j] = BD[j+1];
                } 
                index--;
            }
        }
    }

    public void ChangeByIndex(Agency newAgency){
        System.out.println("digite o endereço da agencia removida");
        index = input.nextInt();
        BD[index - 1] = newAgency;
    }

    public void showBD(){
        for (int i = 0; i < index; i++){
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("ID:" + (i+1));
            BD[i].showReport();
        }
    }

    public void showBdById(int id){
        System.out.println(BD[id]);
    }
}
