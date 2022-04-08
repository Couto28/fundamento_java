public class ForJava {

    public static void main(String[] Args) {
        //  CÓDIGO PARA FINS DE DIDÁTICA , CAASO FOR EXECUTAR COMENTAR DOIS E EXECUTAR UM.

        for (int x = 0; x < 10; x++) {                  // executa o codigo em ordem cronológica .
            System.out.println("Executando :" + x);


            for (int i = 0; i < 10; i = i + 2) {    // executa o codigo em duas e duas casas .
                System.out.println("Executando :" + i);


                String[] pessoas = new String[5];  // forma de executar a saida de um array po um for.

                pessoas[0] = "Diogo";
                pessoas[1] = "João";
                pessoas[2] = "Camila";
                pessoas[3] = "LucyDePapito";
                pessoas[4] = "Familia";

                for (String nome : pessoas) {

                    System.out.println(nome);

                }
            }
        }
    }
}