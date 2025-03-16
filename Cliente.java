public abstract class Cliente extends Pessoa implements ImprimeDados
{
    // Atributos protegidos
    protected Endereco endereco;
    protected String email;

    // Construtores
    public Cliente(){}

    public Cliente(String nome, int idade, float peso, char genero, Endereco endereco, String email)
    {
        super(nome, idade, peso, genero);
        this.setEndereco(endereco);
        this.setEmail(email);
    }

    // Métodos get/set
    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    // Outros métodos
    @Override
    public void imprimirDados()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        
        if (this.genero == 'M'){
            System.out.println("Cliente é do sexo masculino");
        } else if (this.genero == 'F'){
            System.out.println("Cliente é do sexo feminino");
        } else{
            System.out.println("Gênero não especificado");
        }

        System.out.print("\n-->Endereço do cliente\n");
        this.endereco.imprimirDados();

        System.out.println("\nEmail: " + this.email);
    }

}