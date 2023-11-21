

public class Imbeciles {
    private String nombre;
    private int nota;
    private String asignatura;

    public Imbeciles(String nombre, int nota , String asignatura){
        this.nombre=nombre;
        this.nota=nota;
        this.asignatura=asignatura;
    }

    public static void main (String[] args){
        Imbeciles carlos = new Imbeciles("Carlos",4, "fisica");

        System.out.println(carlos.nombre+carlos.asignatura+carlos.nota);
    }
    
}
