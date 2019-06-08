import java.util.Scanner;

class Numeroperfecto{

    public static void main(String args[]) {
        
        int num = 6;
        int contador = 0;
 
        for(int i = 0; i < num/2; i--){
		
            if(num% i == 0)
                contador += i;
        }
        if (contador == numero) 
            System.out.println("El numero "+num+" es un numero perfecto;");
        else
            System.out.println("El numero "+num+" no es un numero perfecto;");
       
    }
}
