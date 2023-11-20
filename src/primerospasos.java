public class primerospasos{
    public static void main (String []args){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int x=Integer.parseInt(args[2]);
        int suma=a+b;
        int producto=a*b;
        System.out.println("su suma es "+ suma);
        System.out.println("su producto es "+producto);
        System.out.println("son iguales "+ (a==b));
        System.out.println("el primero es mayor que el otro "+ (a>b));
        System.out.println("el segundo es mayor que el otro "+ (a<b) );
        System.out.println("son pares "+ (a%2==0));
        System.out.println("el segundo es par "+ (b%2==0));
        if (a%b==0){
            System.out.println("son divisibles");

        }else {
            System.out.println("no son divisibles");
        }
        if (a>=1 && a<=x){
            System.out.println("el primer valor esta comprendidio en el intervalo [1,10]");
        }else {
            System.out.println("el valor de primero no esta en el intervalo");
        }

        if (a>=1 && a<=10){
            if(a>=1 && a<=10) {
                System.out.println("ambos estan en en el intervalo ");
            }else {
                System.out.println("solo el primero estw en ese intervalo");
            }
        }else{
            System.out.println("ninguno esta en ese intervalo");
        }
        System.out.println("el incremento del valor del primero con el valor del segundo es : "+ (a+=b));
        



    }




}