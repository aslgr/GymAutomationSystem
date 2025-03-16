public class Horario
{
    // Atributos encapsulados
    private int hora;
    private int minuto;

    // Construtores
    public Horario(){}

    public Horario(int hora, int minuto)
    {
        this.setHora(hora);
        this.setMinuto(minuto);
    }

    // Métodos get/set
    public int getHora(){
        return this.hora;
    }

    public void setHora(int hora)
    {
        if (hora >= 0 && hora < 24)
            this.hora = hora;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public void setMinuto(int minuto)
    {
        if (minuto >= 0 && minuto < 60)
            this.minuto = minuto;
    }
}