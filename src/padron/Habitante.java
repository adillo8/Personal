package padron ;
public class Habitante{
    //atributos
    private String nombre;
    private String apellido1;
    private String apellido2;


    //setters
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public void setApellido1 (String apellido1){
        this.apellido1=apellido1;
    } 
    public void setApellido2 (String apellido2){
        this.apellido2=apellido2;
    }

    public static void main (String[] args){
        //crear un objeto
        Habitante habitante1 = new Habitante();
         
    }

}