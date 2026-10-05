Nesta aula 05, estarei aprendendo mais sobre os métodos em Java, e aqui deixarei alguns pontos importantes a cada tópico estudado.

-> Sobre método: Método é uma forma de separar uma tarefa do programa em um bloco de código que pode ser chamado quando necessário.

->Sobre o main: não é uma classe. Ele é um método especial dentro da classe Main. Ele pode executar/chamar outros métodos e não precisa conter toda a lógica do programa.

->Métodos que recebem informações: usa-se parâmetros entre os parenteses.

-> Parâmetro: informação que o método espera receber para funcionar.

-> Métodos *statics*: pode ser chamado diretamente dentro de outro método static.

->Métodos que retornam valores: geralmente eles recebem um valor, fazem algo e retornam um valor. Mas pode acontecer de ele não receber valor algum e ainda sim retornar algo?? e por mais que um metodo seja void, nao significa que nao vamos poder ver o que ele faz, certo? ate porque da pra ser void e imprimir algo na tela, isso ainda buga minha cabeça, qual a diferenca entre mostrar e devolver?

-> Você decide se um método vai retornar algo ou não pelo que precisa fazer com o resultado dele depois que termina, se irá fazer outro procedimento e pecisará do dado depois o mais recomendável é ser um método que retorne algo, se caso não precise e só quer que faça algo naquele momento, então deve ser void.

#Desafio: Crie um método chamado dobro que:

receba um int
calcule o dobro
retorne o resultado

Depois, no main, faça:

dobro(5)

e guarde o resultado em uma variável chamada resultado.