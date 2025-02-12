package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Evento proximoEvento = null;
        LocalDate proximaData = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Proximo evento: " + proximoEvento + " na data: " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, 10, 10), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2021, 7, 10), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2001, 2, 10), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 6, 10), "Evento 4", "Atracao 4");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
