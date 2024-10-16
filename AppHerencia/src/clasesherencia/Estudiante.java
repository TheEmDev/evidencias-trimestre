package clasesherencia;

public class Estudiante extends Persona{
    private String carrera;
    private int codigo;

    public Estudiante() {
        // cuando se istancia a la clase se pueden utilizar los métodos y atributos de dicha clase
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
