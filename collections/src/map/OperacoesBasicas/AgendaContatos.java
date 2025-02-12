package map.OperacoesBasicas;

import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;


    public AgendaContatos(){
        this.agendaContatoMap = new java.util.HashMap<>();
    }


    public void adicionarContato(String nome, Integer numero){
        agendaContatoMap.put(nome, numero);
    }


    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }


    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }


    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gabriel", 111111);
        agendaContatos.adicionarContato("Gabriel", 222222);
        agendaContatos.adicionarContato("Caue", 7676767);
        agendaContatos.adicionarContato("Gabriel Peçanha", 6666);
        agendaContatos.adicionarContato("Gabriel", 444444);

        agendaContatos.exibirContatos();

        System.out.println("Numero de Gabriel: " + agendaContatos.pesquisarPorNome("Gabriel"));

        agendaContatos.removerContato("Gabriel");

        agendaContatos.exibirContatos();

        
    }
}
