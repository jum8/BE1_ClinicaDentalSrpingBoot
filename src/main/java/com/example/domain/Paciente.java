public class Paciente {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private int dni;
    private LocalDate fechaIngreso;
    private Domicilio domicilio;

    public Paciente(int id, String nombre, String apellido, String email, int dni, LocalDate fechaIngreso, Domicilio domicilio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.dni = dni;
        this fechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
    }
}