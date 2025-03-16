public class Endereco implements ImprimeDados
{
    // Atributos encapsulados
    private String nomeRua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;

    // Construtores
    public Endereco(){}

    public Endereco(String nomeRua, int numero, String bairro, String cidade, String estado) 
    {
        this.setNomeRua(nomeRua);
        this.setNumero(numero);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
    }

    // Métodos get/set
    public String getNomeRua(){
        return this.nomeRua;
    }

    public void setNomeRua(String nomeRua)
    {
        this.nomeRua = nomeRua;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero)
    {
        if (numero >= 0)
            this.numero = numero;
    }

    public String getBairro(){
        return this.bairro;
    }

    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }

    public String getCidade(){
        return this.cidade;
    }

    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    // Outros métodos
    @Override
    public void imprimirDados()
    {
        System.out.println("Rua: " + this.nomeRua);
        System.out.println("Número: " + this.numero);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
    }
}