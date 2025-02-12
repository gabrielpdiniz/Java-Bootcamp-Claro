package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatoSet;


    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }


    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }


    public void exibirContato(){
        System.out.println(contatoSet);
    }


    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatosPorNome){
            if(c.getNome() == nome){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }


    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtulizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtulizado = c;
                break;
            }
        }
        return contatoAtulizado;
    }

    
    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Gabriel", 123456);
        agendaContatos.adicionarContato("Caue", 4444444);
        agendaContatos.adicionarContato("Gustavo", 333333);
        agendaContatos.adicionarContato("Pedro", 222222);
        agendaContatos.adicionarContato("Leo", 1111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Gabriel"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Gabriel", 999999));
    }
}
