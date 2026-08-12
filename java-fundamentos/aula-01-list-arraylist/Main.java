import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     List<Double> precos = new ArrayList<>();
     precos.add(10.00);
     precos.add(5.00);
     precos.add(45.00);
     precos.add(60.00);

     //int contador=0;
     //for ( Double preco : precos){
       // System.out.println(contador + preco);
        //contador++;
     //}
     for ( int i =0; i< precos.size(); i++){
         if (precos.get(i)> 10){
        System.out.println( i+ " - " + precos.get(i));
         }
     }
    }     
}