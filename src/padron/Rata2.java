package padron;

public class Rata2 {
    private String cloaca;
    private String tuberia;
    private String pelaje;

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

    public Rata2(String cloaca,String pelaje , String tuberia){
        this.cloaca=cloaca;
        this.pelaje=pelaje;
        this.tuberia=tuberia;
    }

    
    
}