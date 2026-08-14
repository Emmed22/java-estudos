import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<String> nomes = new ArrayList<>();
    nomes.add("Maria");
    nomes.add("João");
    nomes.add("Ana");
    nomes.add("Carlos");
    nomes.add("Antonio");
    nomes.add("Pedro");
    nomes.add("Amanda");

    //Desafio — modificar uma lista usando índice.
    //Objetivo do exercício:

//Queremos que o programa faça duas coisas:

//1. Encontre os nomes com mais de 5 caracteres.

//2. Para esses nomes, coloque "!" no final do nome usando set().
 
    for ( int i =0 ; i < nomes.size(); i++){
      
      if (nomes.get(i).length()>5){
        nomes.set(i, nomes.get(i) + " ! ");
     
       // System.out.println(nome); se deixar ele dentro do if, o java pensa: só vou executar se o nome tiver + de 5 caracteres.
      }
      String nome = nomes.get(i);
      System.out.println(nome);// por isso ele deve estar fora do if
    }
    
    }     
}