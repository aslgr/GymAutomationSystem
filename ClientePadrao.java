public class ClientePadrao extends Cliente
{
    // Construtores
    public ClientePadrao(){}

    public ClientePadrao(String nome, int idade, float peso, char genero, Endereco endereco, String email)
    {
        super(nome, idade, peso, genero, endereco, email);
    }
}