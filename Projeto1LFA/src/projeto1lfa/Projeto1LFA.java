
package projeto1lfa;

import java.util.Scanner;


public class Projeto1LFA {

   
    public static void main(String[] args) {
        String lista,alfabeto,aresta;
        String initial,fin,palavra;
        int n;
        Scanner s = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Grafo g = new Grafo();
        
        //System.out.println("estados");
        lista=s.nextLine();
        for(int i =0;i<lista.length();i++){
            g.addVertice(lista.charAt(i));
        }
        //System.out.println("alfabeto");
        alfabeto=s.nextLine();
        
        //System.out.println("transições");
        n=s.nextInt();
        
        while(n>0){
           // System.out.println("aresta");
            aresta=s2.nextLine();
            g.addAresta(aresta.charAt(1), aresta.charAt(0), aresta.charAt(2));
            n--;
            
        }
        //System.out.println("inicial");
        initial=s2.nextLine();
        g.setInitial(initial.charAt(0));
        //System.out.println("final");
        fin=s2.nextLine();
        for(int i=0;i<fin.length();i++){
            g.setFinal(fin.charAt(i));
        }
        
        
        //System.out.println("palavra");
        palavra=s2.nextLine();
        String[] subpalavras=palavra.split(" ");
        for(int i=0;i<subpalavras.length;i++){
            g.palavra(subpalavras[i]);
        }
        
        
        
        
        
        
        
        
        
    }
    
}
