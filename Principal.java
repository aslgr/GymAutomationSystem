public class Principal{
    public static void main(String[] args)
    {
        // Instanciando academia ------------------------------------------

        Horario horarioAbre = new Horario(6 ,30);
        Horario horarioFecha = new Horario(23, 00);
        HorarioFuncionamento horarioFuncionamento = new HorarioFuncionamento(horarioAbre, horarioFecha);
        Endereco endereco = new Endereco("Polenta", 123, "Bacacheri", "Curitiba", "Paraná");
        Academia academia = new Academia("Fique Fit", endereco, horarioFuncionamento, true);

        // ----------------------------------------------------------------
        // Instanciando clientes ------------------------------------------

        Endereco endCliente1 = new Endereco("Tomate", 801, "Cabral", "Curitiba", "Paraná");
        Cliente cliente1 = new ClientePadrao("Mateus", 19, (float)64.7, 'M', endCliente1, "Mateus@email.com");

        Endereco endCliente2 = new Endereco("Batata Legal", 12, "Uberaba", "Curitiba", "Paraná");
        Cliente cliente2 = new ClientePadrao("Sofia", 24, (float)57.2, 'F', endCliente2, "Sofia@email.com");

        Endereco endCliente3 = new Endereco("Pêssego", 521, "Jardim Social", "Curitiba", "Paraná");
        Horario tempoDisponivelSaunaCliente3 = new Horario(2 ,45);
        Cliente cliente3 = new ClienteVIP("Paulo", 30, (float)88.0, 'M', endCliente3, "Paulo@email.com", tempoDisponivelSaunaCliente3);

        // ----------------------------------------------------------------
        // Adicionando clientes no sistema --------------------------------

        academia.adicionarCliente(cliente1);
        academia.adicionarCliente(cliente2);
        academia.adicionarCliente(cliente3);

        // ----------------------------------------------------------------
        // Instanciando treinadores ---------------------------------------

        Horario horarioTrabalhoInicioT1 = new Horario(6, 30);
        Horario horarioTrabalhoFimT1 = new Horario(15, 0);
        Treinador treinador1 = new Treinador("Lari", 25, (float)60.1, 'F', "Treinos cardiovasculares", horarioTrabalhoInicioT1, horarioTrabalhoFimT1);

        Horario horarioTrabalhoInicioT2 = new Horario(15, 0);
        Horario horarioTrabalhoFimT2 = new Horario(23, 0);
        Treinador treinador2 = new Treinador("Gui", 27, (float)78.9, 'M', "Treinos para hipertrofia", horarioTrabalhoInicioT2, horarioTrabalhoFimT2);

        // ----------------------------------------------------------------
        // Adicionando treinadores no sistema -----------------------------

        academia.adicionarTreinador(treinador1);
        academia.adicionarTreinador(treinador2);

        // ----------------------------------------------------------------
        // Instanciando aula ----------------------------------------------

        Horario horarioAula = new Horario(15, 30);
        Horario tempoAula = new Horario(1, 0);
        Aula aula1 = new Aula("Zumba", horarioAula, tempoAula, treinador1, 3, 0);

        // ----------------------------------------------------------------
        // Inscrevendo clientes na aula -----------------------------------

        academia.inscricaoAula(cliente1, aula1);
        academia.inscricaoAula(cliente2, aula1);
        academia.inscricaoAula(cliente3, aula1);

        // ----------------------------------------------------------------
        // Imprimindo dados -----------------------------------------------

        academia.imprimirDados();
        aula1.imprimirDados();
    }
}