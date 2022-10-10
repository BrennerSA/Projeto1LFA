
package projeto1lfa;


public class Aresta {
    char transicao;
    private Vertice inicio;
    private Vertice fim;
    
    public Aresta(char transicao,Vertice inicio, Vertice fim){
        this.transicao=transicao;
        this.inicio=inicio;
        this.fim=fim;
    }
    
    public char getTransicao(){
        return transicao;
        
    }
    
    public Vertice getInicio(){
        return inicio;
    }
    
    public Vertice getFim(){
        return fim;
    }
    
}
