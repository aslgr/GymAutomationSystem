import java.util.*;

public interface Administracao
{
    public abstract void adicionarCliente(Cliente cliente);
    public abstract void removerCliente(Cliente cliente);
    public abstract HashSet<Cliente> mostrarClientes();

    public abstract void adicionarTreinador(Treinador treinador);
    public abstract void removerTreinador(Treinador treinador);
    public abstract HashSet<Treinador> mostrarTreinadores();

    public abstract void inscricaoAula(Cliente cliente, Aula aula);
    public abstract LinkedList<Cliente> listarClientesInscritos(Aula aula);
}