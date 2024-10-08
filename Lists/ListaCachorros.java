package Lists;
import java.util.ArrayList;

import Biblioteca.*;
import Modelo.Cachorro;

public class ListaCachorros {

    public static void Lista() {

        ArrayList<Cachorro> listaCachorros = new ArrayList<Cachorro>();// 1. Cria a lista

        System.out.println(" Digite quantos cães você ainda quer adicionar: ");
        System.out.print("    ");
        int x = Receba.LerNumero();

        for (int i = 0; i < x; i++) {// 2. Preenche o vetor

            Cachorro dog = new Cachorro();// 3. Cria o objeto
            if (x==1) {
                System.out.println(" Escreva o nome, idade e apelido do dog: ");
                System.out.print("    ");                
            }else{
            System.out.println(" Escreva o nome, idade e apelido de um dos seus dogs: ");
            System.out.print("    ");
            }
            dog.receberCachorro();// 4. Recebe os atributos do objeto

            listaCachorros.add(dog);// 5.Adiciona o objeto na lista

        }

        int i = 0;
        int[] idades = new int[x];

        for (Cachorro dog : listaCachorros) {// 6. Criando um vetor com as idades dos cachorros

            idades[i] = dog.voltarIdade();

            i++;
        }

        Ordenacao.Merge(idades);// 7. Ordenando as idades;

        System.out.println();
        if (idades.length == 1) {//octopus garden _ Hammer _ 
            System.out.println(" Você só tem um doguinho, e tudo bem ;)");           
        }else{
        System.out.println(" As idades organidas dos doguinhos: ");
        System.out.print("    ");
        
        for (int j = 0; j < idades.length; j++) {// 8. Imprime as idades ordenadas crescentemente
            System.out.print(idades[j]+ " ");
        }
    }
        System.out.println();

        int j = 0;
        System.out.println();

        for (Cachorro dog : listaCachorros) {
            
            if (j%2==0) {// 9. Imprimir esta mensagem, se par
                dog.imprimirCachorro();                
            }else{// 10. Imprimir esta se ímpar
                dog.imprimirCachorro2();
            }

            System.out.println();
            j++;
        }

        
    }

}
