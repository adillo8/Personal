
public class Constructor{
    private String nombre;
    private String apellido3;
    private String apellido4;

    public Constructor(String nombre , String apellido3 , String apellido4){
        this.nombre=nombre;
        this.apellido3=apellido3;
        this.apellido4=apellido4;
    }


    public static void main (String[] args){
        Constructor ernesto = new Constructor("toyota", "x", "y");

        System.out.println(ernesto.nombre+ernesto.apellido3+ernesto.apellido4);

    }


}