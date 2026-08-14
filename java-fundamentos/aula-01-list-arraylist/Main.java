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

    //for (int i = 0; i < nomes.size(); i++ ){
      //if (nomes.get(i).length()> 4){
        // System.out.println(i + " - " +  nomes.get(i));
      //}
    //}
    System.out.println(nomes);

      nomes.set(2,"Amanda");//troca o elemento que está no índice 2 pelo valor Amanda.
      nomes.remove(1);//remove o que está no índice 1 = João.
      System.out.println(nomes);//imprime a nova lista.
    }     
}