public class HorarioFuncionamento implements ImprimeDados
{
    // Atributos encapsulados
    private Horario horarioAbre;
    private Horario horarioFecha;

    // Construtores
    public HorarioFuncionamento(){}

    public HorarioFuncionamento(Horario horarioAbre, Horario horarioFecha)
    {
        this.setHorarioAbre(horarioAbre);
        this.setHorarioFecha(horarioFecha);
    }

    // Métodos get/set
    public Horario getHorariaAbre(){
        return this.horarioAbre;
    }

    public void setHorarioAbre(Horario horarioAbre)
    {
        this.horarioAbre = horarioAbre;
    }

    public Horario getHorariaFecha(){
        return this.horarioFecha;
    }

    public void setHorarioFecha(Horario horarioFecha)
    {
        this.horarioFecha = horarioFecha;
    }

    // Outros métodos
    @Override
    public void imprimirDados()
    {
        System.out.printf("Abre às %02d:%02d\n", this.horarioAbre.getHora(), this.horarioAbre.getMinuto());
        System.out.printf("Fecha às %02d:%02d\n", this.horarioFecha.getHora(), this.horarioFecha.getMinuto());
    }
}