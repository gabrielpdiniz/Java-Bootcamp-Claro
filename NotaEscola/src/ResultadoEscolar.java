public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota = 7;

        //if(nota >= 7)
        //System.out.println("Aprovado");

        //else if(nota >= 5 && nota < 7)
        //System.out.println("Prova Recuperaçao");

        //else 
        //System.out.println("Reprovado");
        
        //Ao inves de escrever tudo isso, fazer dessa forma:

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperaçao" : "Reprovado";

        System.out.println(resultado);




        
    }
}
