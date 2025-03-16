import java.util.*;

public class Academia implements Administracao, ImprimeDados
{
    // Atributos encapsulados
    private String nome;
    private Endereco endereco;
    private HorarioFuncionamento horarioFuncionamento;
    private boolean abreFimDeSemana;
    private HashSet<Cliente> conjuntoClientes = new HashSet<Cliente>();
    private HashSet<Treinador> conjuntoTreinadores = new HashSet<Treinador>();

    // Construtores
    public Academia(){}

    public Academia(String nome, Endereco endereco, HorarioFuncionamento horarioFuncionamento, boolean abreFimDeSemana)
    {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setHorarioFuncionamento(horarioFuncionamento);
        this.setAbreFimDeSemana(abreFimDeSemana);
    }

    // Métodos get/set
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }

    public HorarioFuncionamento getHorarioFuncionamento(){
        return this.horarioFuncionamento;
    }

    public void setHorarioFuncionamento(HorarioFuncionamento horarioFuncionamento)
    {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public boolean isAbreFimDeSemana(){
        return this.abreFimDeSemana;
    }

    public void setAbreFimDeSemana(boolean abreFimDeSemana)
    {
        this.abreFimDeSemana = abreFimDeSemana;
    }

    // Outros métodos
    @Override
    public void adicionarCliente(Cliente cliente)
    {
        this.conjuntoClientes.add(cliente);
    }

    @Override
    public void removerCliente(Cliente cliente)
    {
        this.conjuntoClientes.remove(cliente);
    }

    @Override
    public HashSet<Cliente> mostrarClientes()
    {
        return this.conjuntoClientes;
    }

    @Override
    public void adicionarTreinador(Treinador treinador)
    {
        this.conjuntoTreinadores.add(treinador);
    }

    @Override
    public void removerTreinador(Treinador treinador)
    {
        this.conjuntoTreinadores.remove(treinador);
    }

    @Override
    public HashSet<Treinador> mostrarTreinadores()
    {
        return this.conjuntoTreinadores;
    }

    @Override
    public void inscricaoAula(Cliente cliente, Aula aula)
    {
        if (aula.getQntdClientesInscritos() < aula.getCapacidadeMaxima())
            aula.inscreverEmAula(cliente);
    }

    @Override
    public LinkedList<Cliente> listarClientesInscritos(Aula aula)
    {
        return aula.getClientesInscritos();
    }

    @Override
    public void imprimirDados()
    {
        int i;

        System.out.println("\nDados Academia ---------------------------------");
        System.out.println("\nNome: " + this.nome);

        System.out.print("\n-->Endereço\n");
        this.endereco.imprimirDados();

        System.out.print("\n-->Horário de Funcionamento\n");
        this.horarioFuncionamento.imprimirDados();

        if (abreFimDeSemana){
            System.out.println("Aberto aos fins de semana!");
        } else{
            System.out.println("Fechado aos fins de semana!");
        }

        System.out.println("\n------------------------------------------------");
        System.out.println("-->Clientes:");

        i = 1;
        for (Cliente cliente : conjuntoClientes)
        {
            System.out.println("\n--------------------------");
            System.out.print("->Cliente " + i);
            System.out.println("\n--------------------------");

            cliente.imprimirDados();

            if (cliente instanceof ClienteVIP)
            {
                ClienteVIP cVIP = (ClienteVIP)cliente;
                System.out.print("\nO cliente é VIP\n");
                System.out.printf("Seu tempo de sauna disponivel (em horas) é: %02d:%02d\n", cVIP.getTempoDisponivelSauna().getHora(), cVIP.getTempoDisponivelSauna().getMinuto());
            }

            System.out.println();
            i++;
        }

        System.out.println("\n------------------------------------------------");
        System.out.println("-->Treinadores:");

        i = 1;
        for (Treinador treinador : conjuntoTreinadores)
        {
            System.out.println("\n--------------------------");
            System.out.print("->Treinador " + i);
            System.out.println("\n--------------------------");

            treinador.imprimirDados();

            i++;
        }

        System.out.println("\n------------------------------------------------");
    }
}