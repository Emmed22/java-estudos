package sobrecarga;

public class Main {
    
public static void main(String[] args) {

System.out.println( multiplicar(5,6,4)); //Ele vai saber qual das duas estarei chamando através da quantidade de parâmetros que passei. 

System.out.println(saudacao("Antonio", 20));// Aqui saberá pelos tipos e quantidade.

//chamando o método calcularMedia():

calcularMedia(7,8);

double resultado = calcularMedia(7,8); // guardando o valor o retornado do método em outra variável.

System.out.println(resultado);//Pedindo para mostrar na tela.

//Chamando desafio 4:
somar(68.4,198.7);

//Chamando desafio 6:
System.out.println(maior(9, 0, 8));
System.out.println(maior(2,3,8));


//Chamando desafio 7:
contar(5,10);
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

// Desafio 3: 

static double calcularMedia(double a, double b){
    return (a+b)/2;
}

static double calcularMedia(double a, double b, double c){
    return (a+b+c)/3;
}

//Desafio 4:
//Crie 3 somar(), com quantidades e tipos de padrões diferentes:

static int somar(int a, int b){
    return a + b;
}

static int somar(int a, int b, int c){
    return a + b+ c;
}

static double somar(double a, double b){
    return a + b;

}

//Desafio 5:
//Sobrecarga + void, um com parametro e outro sem:

static void mostrarMensagem(){
    System.out.println("Olá!");
}
static void mostrartMensagem(String nome){
    System.out.println("Olá" + nome);

}
//Desafio 6: 
//Sobrecarga + if:
static int maior(int a, int b){
    if ( a > b){
        return a;
    }else{
        return b;
    }

}
static int maior(int a, int b, int c){
    if (a > b && a > c){
        return a;
    }if(b > a && b > c){
        return b;
    }else{
        return c;
    }
}
//Desafio 7:
//Sobrecarga + for:
static void contar(int limite){
for(int i = 0; i <= limite ; i++){

    System.out.println(i);
}
}
static void contar(int inicio, int limite){
    for(int i = inicio; i <= limite; i++){
        System.out.println(i);
    }

}
}