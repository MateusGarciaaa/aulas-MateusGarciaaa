//Data: 20/10/2025
//Conteúdo: HashSet

package aulas;
import utils.IO;
import java.util.HashSet;
import java.util.Collection;
import java.util.HashMap;

public class Aula28{

    public static void aula(){
        System.out.println("\n\n\n===========================================");
        IO.imprimir("\n\n\n## Aula 28 - HashSet ##\n\n\n");
    
        //Exercício 01
        // ex01();


        //Exercício 02
        ex02();

    }
    

    // HashSet
    public static void ex01(){
        HashSet<Integer> conjunto = new HashSet<>();
        conjunto.add(15);
        System.out.println(conjunto);
        conjunto.add(28);
        conjunto.add(13);
        System.out.println(conjunto);

        boolean resposta = conjunto.contains(15);
        System.out.println(resposta);
    }

    // HashMap
    public static void ex02(){
        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("Darlon", 28);
        System.out.println(idades);


        String frase = "Subi no pé de pera pra comer pera mas so tinha laranja e eu queria comer pera nao tinha pera";
        HashMap<String, Integer> palavras = new HashMap<>();

        String[] a = frase.split(" ");

        for (int i = 0; i < a.length; i++) {
            if (!palavras.containsKey(a[i])) {
                palavras.put(a[i],1);
            }else{
                palavras.replace(a[i], palavras.get(a[i])+1);
            }
        }

        System.out.println(palavras);
    }
    

}