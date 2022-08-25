public class PacienteDao {
    private List<Paciente> pacientes;

    public PacienteDao() {
        pacientes = new ArrayList();
        pacientes.add(new Paciente(1, "Pedro", "Ramirez", "pr@mail.com", 23431334, LocalDate.parse("2020-01-02"), new Domicilio("Calle falsa", 123, "Sprinfield", "Somewhere")));
        pacientes.add(new Paciente(1, "Pablo", "Gonzalez", "pg@mail.com", 28321334, LocalDate.parse("2019-10-02"), new Domicilio("Calle verdadera", 123, "Sheldyville", "Somewhere")));
        pacientes.add(new Paciente(1, "Ximena", "Perez", "xp@mail.com", 32431432, LocalDate.parse("2021-08-03"), new Domicilio("Otra calle", 18, "Resistencia", "Chaco")));
    } 

    public List<Paciente> buscarTodos() {
        return pacientes;
    }

    public Optional<Paciente> buscarPorEmail(String email) {
        Paciente paciente = null;
        for
    }
}