//Data: 13/08/2025
//Conteúdo: Passagem de argumentos via linha de comando
package aulas;

public class Aula16 {
    public static void aula(){
        main(null);
    }

    // public static void aula(){
    //     main("-s"+"as");
    // }
    public static void main(String[] args) {

        System.out.println(args.length);

        for(int i = 0; i < args.length;i++){
            System.out.println(args[i]);
            
        }

    }
    
}
