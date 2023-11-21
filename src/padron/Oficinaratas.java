package padron;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Oficinaratas {
    //creacion del arrray
    private ArrayList <Rata2> listaratas=new ArrayList<>();

    //que añada al arrya lo que añades desce habitante
    public void annadir(Rata2 ratita ){
        listaratas.add(ratita);
    }
    //que devuelva el arraylist 
    public ArrayList getListaratas(){
        return listaratas;
    }

    public int sumarRatas(){
        int suma=0;
        for (Rata2 ratita : listaratas){
            suma++;
        }
        return suma;

    }

    private void cargarRatas(){
        try {
            File fichero=new File ("padron.csv");
            fichero.createNewFile();
            Scanner sc = new Scanner(fichero);
            while(sc.hasNext()){
                Rata2 tuvieja = new Rata2(sc.next(),sc.next(),sc.next());
            }
            sc.close();

        } catch (Exception e) {
            System.out.println("no hay ratas registradas");
        }
    }
    public Oficinaratas(){
        cargarRatas();
    }

    
}
