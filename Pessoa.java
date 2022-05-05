
package objetos3;

public class Pessoa {
//declaração das variáveis
    String nome;
    int idade;
    String pai;

    Pessoa(){
        
    }
    
    void Pai(Pessoa father){
        //designa pai como sendo o nome da pessoa usada como parametro na main
        pai = father.nome;
        System.out.println("O pai de "+nome+" é " +pai+" e sua idade é " +father.idade+" anos.");
    }
    

}
