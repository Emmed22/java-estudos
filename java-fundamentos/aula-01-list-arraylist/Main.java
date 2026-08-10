import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Fernanda");
        nomes.add("Pedro");
        nomes.add("Amanda");
        nomes.add("Antonio Carlos");

        for(String nome : nomes){
            System.out.println( nome +" possui " + nome.length() 
        + " letras.");

        }
    }
}