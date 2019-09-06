
package caixaeletronico;


public class CaixaEletronico {


    public static void main(String[] args) {
        int valor = 10;
        int[] notas = new int[]{2,5,10,20,50,100}; 
        
        int qNotas = notas.length -1;
        for (int i = qNotas; i >= 0; i--) {
            if (valor % notas[i] ==0) {
                System.out.println(valor/notas[i] + 
                        " x "+notas[i]);
                
            }
            
        }
         
    }
    
}
