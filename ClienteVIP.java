public class ClienteVIP extends Cliente
{
    // Atributos encapsulados
    private Horario tempoDisponivelSauna;

    // Construtores
    public ClienteVIP(){}

    public ClienteVIP(String nome, int idade, float peso, char genero, Endereco endereco, String email, Horario tempoDisponivelSauna)
    {
        super(nome, idade, peso, genero, endereco, email);
        this.setTempoDisponivelSauna(tempoDisponivelSauna);
    }

    // Métodos get/set
    public Horario getTempoDisponivelSauna(){
        return this.tempoDisponivelSauna;
    }

    public void setTempoDisponivelSauna(Horario tempoDisponivelSauna)
    {        
        this.tempoDisponivelSauna = tempoDisponivelSauna;
    }
}