
package projeto1lfa;

import java.util.ArrayList;


public class Vertice {
    private char dado;
    private ArrayList<Aresta> arestasEntrada;
    private ArrayList<Aresta> arestasSaida;
    private boolean isFinal;
    private boolean isInitial;
    
    
    public Vertice(char dado){
        this.dado=dado;
        this.arestasEntrada=new ArrayList<Aresta>();
        this.arestasSaida= new ArrayList<Aresta>();
        isFinal=false;
        isInitial=false;
    }
    
    public void addArestaEntrada(Aresta aresta){
        this.arestasEntrada.add(aresta);
    }
    
    public void addArestaSaida(Aresta aresta){
        this.arestasSaida.add(aresta);
    }
    
   public char getDado(){
       return dado;
   }
   
   public void setInitial(){
       this.isInitial=true;
   }
   public void setFinal(){
       this.isFinal=true;
   }
   public boolean getInitial(){
       return isInitial;
   }
   
   public boolean getFinal(){
       return isFinal;
   }
}
