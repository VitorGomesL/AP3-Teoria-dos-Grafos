package arvorebinaria;

import java.util.ArrayList;
/**
 *
 * @author vitor
 */
public class Arvore {
	
    int valor;
    Arvore esquerda, direita;
    static int contador;
    static ArrayList<Integer> arvoreArray;
    private static MenuPrincipal menu;

    public Arvore(int valor) {
        this.valor = valor;
        menu = MenuPrincipal.getInstance();
    }
    
    public static Arvore raiz;

    public static void inserir(int valor) {
        //Recebe o valor e chama outro método passando como parâmetro o atributo static "raiz" e o próprio valor.
        inserir(raiz, valor);
    }

    public static void inserir(Arvore no, int valor) {   
        
        //Se "no" não existir (ou seja a raiz) ele cria uma árvore com a raiz de valor passado anteriormente.
        if (no == null) {
            raiz = new Arvore(valor);
            menu.setTextArea("Inserido a raiz de valor: " +Integer.toString(valor)+ "\n");
        } else {
            //Se o valor solicitado para inserção for menor que o valor do nó atual verifique o que há na esquerda deste nó.
            //Se não verifique o que há na direita deste nó.
            if (valor < no.valor) {
                //Se já houver um nó na esquerda do nó atual utilizas-se da recursividade para verificar onde seria inserido o valor a partir do nó da esquerda.
                //Se não, insira um novo nó na esquerda com o valor a ser inserido.
                if (no.esquerda != null) {
                    inserir(no.esquerda, valor);
                } else {
                    no.esquerda = new Arvore(valor);
                    menu.setTextArea("Inserido " +Integer.toString(valor)+ " a esquerda de " +Integer.toString(no.valor)+ "\n");                    
                }

            } else {
                //Se já houver um nó na direita do nó atual utilizas-se da recursividade para verificar onde seria inserido o valor a partir do nó da direita.
                //Se não, insira um novo nó na direita com o valor a ser inserido.
                if (no.direita != null) {
                    inserir(no.direita, valor);
                } else {
                    no.direita = new Arvore(valor);
                    menu.setTextArea("Inserido " +Integer.toString(valor)+ " a direita de " +Integer.toString(no.valor)+ "\n");
                }
            }
        }        
    }

    public static void imprimirPreOrdem(Arvore no) {
        if (no != null) {
            contador++;
            
            if (contador == 1) {
                menu.setTextArea(Integer.toString(no.valor));
            } else {
                menu.setTextArea(", "+Integer.toString(no.valor));
            }
            
            imprimirPreOrdem(no.esquerda);
            imprimirPreOrdem(no.direita);
        }
    }
    
    public static void imprimirEmOrdem(Arvore no) {        
        if (no != null) {
            imprimirEmOrdem(no.esquerda);
            
            contador++;
            
            if (contador == 1) {
                menu.setTextArea(Integer.toString(no.valor));
            } else {
                menu.setTextArea(", "+Integer.toString(no.valor));
            }
            
            imprimirEmOrdem(no.direita);
        }
    }
    
    public static void imprimirPosOrdem(Arvore no) {
        if (no != null) {            
            imprimirPosOrdem(no.esquerda);
            imprimirPosOrdem(no.direita);
            
            contador++;
            if (contador == 1) {
                menu.setTextArea(Integer.toString(no.valor));
            } else {
                menu.setTextArea(", "+Integer.toString(no.valor));
            }
        }
    }
    
///////////////////////////////////////////////////////////////////////////////    
    public static boolean buscarNivel(int valor) 
    { 
        int altura = altura(raiz); 
        
        for (int i=1; i<=altura; i++){ 
            if (procurarNoNivel(raiz, i, valor)) {
                return true;                
            } 
        }
        
        return false;
    } 
  
    /* calcula a altura da arvore a partir da maior subarvore*/
    public static int altura(Arvore no) 
    { 
        if (no == null) 
           return 0; 
        else
        { 
            /* Calcula a altura de cada subarvore */
            int alturaEsq = altura(no.esquerda); 
            int alturaDir = altura(no.direita); 
              
            /* usa a altura maior */
            if (alturaEsq > alturaDir) 
                return(alturaEsq+1); 
            else 
                return(alturaDir+1);  
        } 
    } 
  
    public static boolean procurarNoNivel (Arvore no ,int nivel, int valor) 
    { 
        contador++;
        
        if (no == null) 
            return false; 
        if (nivel == 1){ 
            System.out.print(no.valor + " "); 
            if (no.valor == valor) {                
                menu.setTextArea("O valor \""+valor+"\" foi encontrado com "+Integer.toString(Arvore.contador)+" Iterações.\n\n");
                return true;
            }                          
        }
        else if (nivel > 1) 
        { 
            procurarNoNivel(no.esquerda, nivel-1, valor); 
            procurarNoNivel(no.direita, nivel-1, valor); 
        } 
        return false;        
    }     
///////////////////////////////////////////////////////////////////////////////
    
    public static boolean procurarNoProfundidade(Arvore arvore, int valor) {
    	//Adiciona +1 no contador para descobrir quantas vezez o código foi executado.
        contador++;

        //Se a árvore recebida no parâmetro "arvore" não existir, cancele a operação.
        if(arvore == null) {
            return false;
        //Se o valor a ser encontrado for igual ao valor atual encerre a procura.
        } else if(arvore.valor == valor) {
            return true;
        //Se a árvore existir e o valor ainda não foi encontrado utiliza-se da recursividade 
        //para ir mais fundo na árvore primeiro pela esquerda e depois pela direita,
        //até o valor ser encontrado.
        } else {            
            boolean primeiroTeste = procurarNoProfundidade(arvore.esquerda, valor);  
            if(primeiroTeste) return true; 
          
            boolean segundoTeste = procurarNoProfundidade(arvore.direita, valor);  
          
            return segundoTeste;         
        }
    }
    
    public static boolean procurarNoBusca(Arvore arvore, int valor) {
    	contador++;

        if(arvore == null) {
            return false;
        } else if(arvore.valor == valor) {
            return true;
        } else {    
        	
        	if (valor < arvore.valor) {
	            
        		boolean primeiroTeste = procurarNoBusca(arvore.esquerda, valor);	            
	            if(primeiroTeste) return true;
	            
        	} else {        		
        		
        		boolean segundoTeste = procurarNoBusca(arvore.direita, valor);                
                
        		return segundoTeste;
        	}
        }
        
        return false;
    }
}
