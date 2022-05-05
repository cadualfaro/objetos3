/*
Crie uma classe Pessoa com 2 contrutores distintos.
Faça um construtor que recebe uma Pessoa que representa o pai da Pessoa
criada. Crie um atributo para armazenar a informação de quem é o pai.
*/
package objetos3;

public class Objetos3 {

    public static void main(String[] args) {
        //criação da pessoa pai
        Pessoa p1 = new Pessoa();
        p1.nome = "Marcos";
        p1.idade = 32;
        
        //criação da pessoa filho
        Pessoa p2 = new Pessoa();
        p2.nome = "Joao";
        p2.idade = 12;
        //chama a função Pai de p2 e usa p1 como parametro
        p2.Pai(p1);
    }
}
