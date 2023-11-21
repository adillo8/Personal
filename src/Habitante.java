//package padron ;
//public class Habitante{
    //atributos
    //private String nombre;
    //private String apellido1;
    //private String apellido2;


    //setters
    //public void setNombre (String nombre){
      //  this.nombre=nombre;
//   }
  //  public void setApellido1 (String apellido1){
   //     this.apellido1=apellido1;
    //} 
    //public void setApellido2 (String apellido2){
     //   this.apellido2=apellido2;
   // }

    //public static void main (String[] args){
        //crear un objeto
      //  Habitante habitante1 = new Habitante();
        
        //invocar setters 
        //habitante1.setNombre("Raul");
        //habitante1.setApellido1("Fdez");
        //habitante1.setApellido2("garcia ");

        //mostrarlos
        //System.out.println("el nombre es " + habitante1.nombre + " y el apellido es " + habitante1.apellido1 );

    //}

//}






public class Habitante{
    private String edad;
    private String sexo;
    private String rango;

    public Habitante(String edad , String rango , String sexo){
        this.edad=edad;
        this.rango=rango;
        this.sexo=sexo;
    }


    public static void main (String[] args){
        Habitante gay = new Habitante("8","13","24");
        System.out.println("su edad es " + gay.edad + " su sexo es " + gay.sexo + " y su rango social es "+ gay.rango);
    }




}