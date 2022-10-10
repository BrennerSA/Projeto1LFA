
package projeto1lfa;

import java.util.ArrayList;


public class Grafo {
    private ArrayList<Vertice> vertices;
    private ArrayList<Aresta> arestas;
    
    public Grafo(){
        this.vertices =new ArrayList<Vertice>();
        this.arestas= new ArrayList<Aresta>();
        
    }
    
    public void addVertice(char dado){
        Vertice novoVertice = new Vertice(dado);
        this.vertices.add(novoVertice);
    }
    
    public void addAresta(char trans, char dadoinicio, char dadofim){
        Vertice inicio=this.getVertice(dadoinicio);
        Vertice fim=this.getVertice(dadofim);
        Aresta aresta=new Aresta(trans,inicio,fim);
        inicio.addArestaSaida(aresta);
        fim.addArestaEntrada(aresta);
        this.arestas.add(aresta);
        
       
    }
    
    public Vertice getVertice(char dado){
        Vertice vertice=null;
        for(int i=0;i<this.vertices.size();i++){
           if(this.vertices.get(i).getDado()==dado){
               vertice=this.vertices.get(i);
               break;
           } 
        }
        return vertice;
    }
    
    public void setInitial(char dado){
        Vertice vertice=null;
        vertice=getVertice(dado);
        vertice.setInitial();
        
    }
    
    public void setFinal(char dado){
        Vertice vertice=null;
        vertice=getVertice(dado);
        vertice.setFinal();
        
    }
    
    public void palavra(String palavra){
        char c;
        Vertice atual=null;
        boolean state = false;
        for(int j=0;j<vertices.size();j++){
                if( vertices.get(j).getInitial()==true){
                    atual=vertices.get(j);
                }
        }if(atual==null){
            System.out.println("N");
        }else{
            for(int i=0;i<palavra.length();i++){
                c=palavra.charAt(i);
                int z=0;
                for(int j=0;j<arestas.size();j++){                    
                    if(arestas.get(j).getTransicao()==c && arestas.get(j).getInicio()==atual){
                        atual=arestas.get(j).getFim();
                        state=atual.getFinal();
                        break;
                    }else{
                        z++;
                    }
            }if(arestas.size()==z){
                state=false;
                break;
            }
                
            }
            if(state==true){
                System.out.println("S");
            }else{
                System.out.println("N");
            }
            
        }
        
        
        
        
    }
}
