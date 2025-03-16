public abstract class Pessoa
{
    // Atributos protegidos
    protected String nome;
    protected int idade;
    protected float peso;
    protected char genero;

    // Construtores
    public Pessoa(){}

    public Pessoa(String nome, int idade, float peso, char genero)
    {
        this.setNome(nome);
        this.setIdade(idade);
        this.setPeso(peso);
        this.setGenero(genero);
    }

    // Métodos get/set
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade)
    {
        if (idade > 0 && idade < 150)
            this.idade = idade;
    }

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float peso)
    {
        if (peso > 0.0 && peso < 500.0)
            this.peso = peso;
    }

    public char getGenero(){
        return this.genero;
    }

    public void setGenero(char genero)
    {
        if (genero == 'M' || genero == 'F')
            this.genero = genero;
    }
}