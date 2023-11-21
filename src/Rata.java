

public class Rata {
    //establecer los atributos 
    private String cloaca;
    private String tuberia;
    private String pelaje;

    // getters y settters
    public void setCloaca(String cloaca){
        this.cloaca=cloaca;
    }
    public void setTuberia(String tuberia){
        this.tuberia=tuberia;
    }
    public void setPelaje(String pelaje){
        this.pelaje=pelaje;
    }
    public String getCloaca(){
        return cloaca;
    }
    public String getTuberia(){
        return tuberia;
    }
    public String getPelaje(){
        return pelaje;
    }

    public static void main (String[] args){
        Rata Ivan = new Rata();

        Ivan.setCloaca("su casa");
        Ivan.setTuberia("tus piernas bb ");
        Ivan.setPelaje("excesivo pelaje ");

        System.out.println("La rata de ivan vive en una cloaca llamada " + Ivan.cloaca);
        System.out.println("La rata de ivan se encunetra "+ Ivan.tuberia);
        System.out.println("La rata de iban destaca por su " + Ivan.pelaje);
    }

    
}
