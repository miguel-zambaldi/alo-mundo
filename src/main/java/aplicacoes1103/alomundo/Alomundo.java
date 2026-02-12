package aplicacoes1103.alomundo;

import java.util.Arrays;
import java.util.Scanner;

public class Alomundo {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        final int tamanho=10;
        int[] numeros={9,7,5,3,1,0,2,4,6,8};
        int[] Numeros= new int[tamanho];
        //Arrays.sort(num); // Organiza os numeros
        Arrays.fill(numeros,15); // Repete o numero dependendo de quantas posições o Array tem
        
        /*WHILE*/        
        String resp="";
        
        
        System.out.print("Deseja usar o programa? ");
        resp=scan.nextLine();
        while(resp.toLowerCase().equals("sim")){            
            System.out.println("Bem vindo ao programa Array");
            
            for(int n:numeros){
                System.out.printf(" %d \n",n);
            }
            System.out.print("Deseja usar novamente o programa? ");
            resp=scan.nextLine();           
        }       
        System.out.println("Fim do Programa!");    
    }
}