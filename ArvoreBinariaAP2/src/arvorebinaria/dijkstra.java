package arvorebinaria;

import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Vertice implements Comparable<Vertice>{

    public final String nome;
    public Aresta[] adjacencias;
    public double distanciaMin = Double.POSITIVE_INFINITY;
    public Vertice anterior;

    public Vertice(String nome) { 
        this.nome = nome; 
    }

    public String toString() { 
        return nome; 
    }

    public int compareTo(Vertice v){
        return Double.compare(distanciaMin, v.distanciaMin);
    }  
}

class Aresta{
	
    public final Vertice objetivo;
    public final double peso;
    
    public Aresta(Vertice objetivo, double peso){ 
    	this.objetivo = objetivo; 
    	this.peso = peso; 
	}
}

public class dijkstra{
	
    public static void calcularCaminho(Vertice inicio){
    	
        inicio.distanciaMin = 0.;
        PriorityQueue<Vertice> verticeQueue = new PriorityQueue<Vertice>();
      	verticeQueue.add(inicio);

	   while (!verticeQueue.isEmpty()) {
	       Vertice u = verticeQueue.poll();

            for (Aresta e : u.adjacencias){
                Vertice v = e.objetivo;
                double peso = e.peso;
                
                double distancia = u.distanciaMin + peso;
                
				if (distancia < v.distanciaMin) {
				    verticeQueue.remove(v);
				    v.distanciaMin = distancia ;
				    v.anterior = u;
				    verticeQueue.add(v);
				}
            }
        }
    }

    public static List<Vertice> getMenorCaminho(Vertice objetivo){
    	
        List<Vertice> caminho = new ArrayList<Vertice>();

        for (Vertice v = objetivo; v != null; v = v.anterior)
            caminho.add(v);

        Collections.reverse(caminho);
        
        return caminho;
    }
}
