public class Main{//Main → é a classe
public static void main(String[] args){//esse main não é uma classe, é um método especial dentro da classe main, onde o java comeca a executar o programa, ele pode executar outros métodos e não precisa conter toda lógica do programa.
mostrarMensagem();
mostrarIdade(10);
mostrarIdade(6);
mostrarIdade(5);
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
}