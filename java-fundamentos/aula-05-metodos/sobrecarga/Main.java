package sobrecarga;

public class Main {
    
public static void main(String[] args) {

System.out.println( multiplicar(5,6,4)); //Ele vai saber qual das duas estarei chamando através da quantidade de parâmetros que passei. 

System.out.println(saudacao("Antonio", 20));// Aqui saberá pelos tipos e quantidade.

} 

//Desafio 1:

static int multiplicar(int a, int b){
    return a*b;
}

static int multiplicar(int a, int b, int c){
    return a*b*c;
}

//Desafio 2:

static String saudacao(String nome){
    return "Olá " + nome;
}

static String saudacao(String nome, int idade){
    return "Olá " + nome +"! " + "Você tem " + idade + " anos.";
}

}