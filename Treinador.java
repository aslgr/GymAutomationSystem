public class Treinador extends Pessoa implements ImprimeDados
{
    // Atributos encapsulados
    private String especializacao;
    private Horario horarioTrabalhoInicio;
    private Horario horarioTrabalhoFim;

    // Construtores
    public Treinador(){}

    public Treinador(String nome, int idade, float peso, char genero, String especializacao, Horario horarioTrabalhoInicio, Horario horarioTrabalhoFim)
    {
        super(nome, idade, peso, genero);
        this.setEspecializacao(especializacao);
        this.setHorarioTrabalhoInicio(horarioTrabalhoInicio);
        this.setHorarioTrabalhoFim(horarioTrabalhoFim);
    }

    // Métodos get/set
    public String getEspecializacao(){
        return especializacao;
    }

    public void setEspecializacao(String especializacao)
    {
        this.especializacao = especializacao;
    }

    public Horario getHorarioTrabalhoInicio(){
        return this.horarioTrabalhoInicio;
    }

    public void setHorarioTrabalhoInicio(Horario horarioTrabalhoInicio)
    {
        this.horarioTrabalhoInicio = horarioTrabalhoInicio;
    }

    public Horario getHorarioTrabalhoFim(){
        return this.horarioTrabalhoFim;
    }

    public void setHorarioTrabalhoFim(Horario horarioTrabalhoFim)
    {
        this.horarioTrabalhoFim = horarioTrabalhoFim;
    }

    // Outros métodos
    @Override
    public void imprimirDados()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        
        if (this.genero == 'M'){
            System.out.println("Treinador é do sexo masculino");
        } else if (this.genero == 'F'){
            System.out.println("Treinador é do sexo feminino");
        } else{
            System.out.println("Gênero não especificado");
        }

        System.out.println("\nEspecialização: " + this.especializacao);
        System.out.println();

        System.out.printf("Horário chegada: %02d:%02d\n", this.horarioTrabalhoInicio.getHora(), this.horarioTrabalhoInicio.getMinuto());
        System.out.printf("Horário saída: %02d:%02d\n", this.horarioTrabalhoFim.getHora(), this.horarioTrabalhoFim.getMinuto());
        System.out.println();
    }
}