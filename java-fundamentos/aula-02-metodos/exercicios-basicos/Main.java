public class Main{//Main → é a classe
public static void main(String[] args){//esse main não é uma classe, é um método especial dentro da classe main, onde o java comeca a executar o programa, ele pode executar outros métodos e não precisa conter toda lógica do programa.
mostrarMensagem();
mostrarIdade(10);
mostrarIdade(6);
mostrarIdade(5);

//Aqui já estamos mexendo com parametros e métodos que retornam algo:

int resultado = dobro(5);

System.out.println(resultado);// ou poderia fazer assim também: System.out.printIn(dobro(5));

//Aqui vamos chamar o método maior():


System.out.println(maior(5, 100));
System.out.println(maior (45,8));

//Chamando calcularmedia():

double media = calcularmedia(7.0, 8.0, 9.0);
System.out.println(media);

//Chamando desafio 2:

boolean r = ehpar(4); //Aqui guardo o resultado em uma variável.
System.out.println(r);

System.out.println(ehpar(4));// Aqui já mostro diretamente.

//Chamando desafio 4:

contarAte(5);

//Chamando desafio 5:

System.out.println(classificarNota(7.5));

}


//Outro método que é criado:

//Ele não precisa de nenhuma informacao para funcionar.

static void mostrarMensagem(){
    System.out.println("Olá!");
}

//Mas agora quero criar um método que diga o nome ou idade de uma pessoa.
//teriamos que criar um método que recebesse um parametro.

static void mostrarIdade(int i){
    System.out.println("Você tem "+ i + " anos.");
}

//Mas e se quisermos que o método calcule alguma coisa e devolva o resultado?
//É ai que entra o return e o int no lugar do void.porque ele pegará os dados, fará algo com eles e retornará outro valor do mesmo tipo.

static int dobro(int n){
    return n*2;

}

//agora vamos fazer outro exercício:
//Criar um método chamado maior que recebe dois parâmetros do tipo int e retorna o maior deles.

static int maior(int a, int b){
    if (a > b){
        return a;
    } else {
        return b;
    }
}

//Desafio 1:
//Crie um método que receba 3 notas double e retorne a média.

static double calcularmedia(double a, double b, double c){
    return (a + b + c)/3;
}

//Desafio 2:

static boolean ehpar(int n){    // essa é a froma mais longa de se fazer isso, tem a mais enxuta.
 if (n % 2 == 0){
    return true;
 }else{
    return false;
 }
}

//Desafio 3:

static int menor( int a, int b){
    if( a < b){
        return a;
    }else{
        return b;
    }
}

//Desafio 4:

static void contarAte(int num){ //esse será void
    for( int i = 1; i <= num; i++){
        System.out.println( i);
    }

}

//Desafio 5:

static String classificarNota(double nota){
    if(nota>=7){
        return "Aprovado!!";
    } else if (nota >= 5){
        return "Recuperação";

    }else{
        return"Reprovado";
    }

}

}