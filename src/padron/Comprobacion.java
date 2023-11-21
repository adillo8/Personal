package padron;

import java.util.ArrayList;

public class Comprobacion {
    
    public static void realizarComprobacion(){

        Oficinaratas rateja = new Oficinaratas();
        
       
        
        ArrayList<Rata2> listaRatas = rateja.getListaratas();
        
        for(Rata2 ratita : listaRatas)
        {System.out.println(ratita.getCloaca() + " " +ratita.getPelaje() + " " + ratita.getTuberia());}

        System.out.println("el numero total de ratas es : "+ rateja.sumarRatas());

    }
   
    
}
