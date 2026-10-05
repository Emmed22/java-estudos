package sobrecarga;

public class Main {
    
public static void main(String[] args) {

    //Desafio 1:
    System.out.println( multiplicar(5,6,4)); //Ele vai saber qual das duas estarei chamando através da quantidade de parâmetros que passei. 

    
    //Desafio 2:
    System.out.println(saudacao("Antonio", 20));// Aqui saberá pelos tipos e quantidade.

    //Desafio 3:
    double resultado = calcularMedia(7,8); // guardando o valor o retornado do método em outra variável.

    System.out.println(resultado);//Pedindo para mostrar na tela.

    //Desafio 4:
    somar(68.4,198.7);

    //Desafio 5:
   mostrarMensagem();

    //Chamando desafio 6:
    System.out.println(maior(9, 0, 8));
    System.out.println(maior(2,3,8));


    //Chamando desafio 7:
    contar(5,10);

    //Chamando desafio 8:
    System.out.println(verificarNumero(8, 2));

} 


//  ***** DESAFIOS PARA PRÁTICA *****

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
static void mostrarMensagem(String nome){
    System.out.println("Olá " + nome);

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
    int maior = a;

    if(b> maior){
        maior = b;
    }
    if (c > maior){
        maior = c;
    }
    return maior;
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

//Desafio 8:
//verificarNumero-sobrecarga + boolean

static boolean verificarNumero(int numero){
    if (numero % 2 == 0){
        return true;
    } else { 
        return false;
    }
}

static boolean verificarNumero(int numero, int divisor){
    if( numero % divisor == 0){ // O operador % retorna o resto da divisão e depois compara-se o resultado com ==.
        return true;
    } else{
        return false;
    }
}
}