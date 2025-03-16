import java.util.*;

public class Aula implements ImprimeDados
{
    // Atributos encapsulados
    private String nome;
    private Horario horarioAula;
    private Horario tempoAula;
    private Treinador treinador;
    private int capacidadeMaxima;
    private int qntdClientesInscritos;
    private LinkedList<Cliente> clientesInscritos = new LinkedList<Cliente>();

    // Construtores
    public Aula(){}

    public Aula(String nome, Horario horarioAula, Horario tempoAula, Treinador treinador, int capacidadeMaxima, int qntdClientesInscritos)
    {
        this.setNome(nome);
        this.setHorarioAula(horarioAula);
        this.setTempoAula(tempoAula);
        this.setTreinador(treinador);
        this.setCapacidadeMaxima(capacidadeMaxima);
        this.setQntdClientesInscritos(qntdClientesInscritos);
    }

    // Métodos get/set
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Horario getHorarioAula(){
        return this.horarioAula;
    }

    public void setHorarioAula(Horario horarioAula)
    {
        this.horarioAula = horarioAula;
    }

    public Horario getTempoAula(){
        return this.tempoAula;
    }

    public void setTempoAula(Horario tempoAula)
    {
        this.tempoAula = tempoAula;
    }

    public Treinador getTreinador(){
        return this.treinador;
    }

    public void setTreinador(Treinador treinador)
    {
        this.treinador = treinador;
    }

    public int getCapacidadeMaxima(){
        return this.capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima)
    {
        if (capacidadeMaxima > 0)
            this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getQntdClientesInscritos(){
        return this.qntdClientesInscritos;
    }

    public void setQntdClientesInscritos(int qntdClientesInscritos)
    {
        if (qntdClientesInscritos >= 0)
            this.qntdClientesInscritos = qntdClientesInscritos;
    }

    public LinkedList<Cliente> getClientesInscritos(){
        return this.clientesInscritos;
    }

    // Outros métodos
    public void inscreverEmAula(Cliente cliente)
    {
        this.clientesInscritos.add(cliente);
        this.qntdClientesInscritos++;
    }

    @Override
    public void imprimirDados()
    {
        System.out.println("Dados Aula -------------------------------------");
        System.out.println("\nNome: " + this.nome);

        System.out.printf("Horário: %02d:%02d\n", this.horarioAula.getHora(), this.horarioAula.getMinuto());
        System.out.printf("Duração (em horas): %02d:%02d\n", this.tempoAula.getHora(), this.tempoAula.getMinuto());
        System.out.println("Treinador responsável: " + this.treinador.getNome());
        System.out.println("Capacidade máxima: " + this.capacidadeMaxima);
        System.out.println("Quantidade de clientes inscritos: " + this.qntdClientesInscritos);

        System.out.println("\n-->Clientes inscritos:");
        for (Cliente cliente: clientesInscritos)
        {
            System.out.println(cliente.getNome());
        }

        System.out.println("\n------------------------------------------------\n");
    }
}