import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
      
        List<String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");

        for (String nome : nomes){
            System.out.println("Olá " +nome);
        }
    }
}