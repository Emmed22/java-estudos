import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");
        frutas.add("Morango");

        //for(int i =0; i<frutas.size(); i++){
        //    System.out.println(i + " - "+ frutas.get(i)
         //   );
       // }
       int contador = 0;
       for ( String fruta : frutas){
        System.out.println( contador+ " - " + fruta);
        contador++;
       }
    }     
}