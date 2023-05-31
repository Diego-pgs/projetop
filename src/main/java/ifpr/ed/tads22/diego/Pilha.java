package ifpr.ed.tads22.diego;

public class Pilha {
    private Nodo topo = new Nodo();
    
    public Nodo getTopo(){
        return topo;
    }

    public void push(int i){ // empilha
        Nodo novo = new Nodo();
        novo.setValue(i);
        if(topo == null){
            topo = novo;
        }else{
            novo.setProx(topo);
            topo = novo;
        }
    }
    
    public void pop(){ // desempilha
        if(topo == null){
            System.out.println("Pilha vazia");
        }
        else{
            topo = topo.getProx();
        }
    }

    public void imprimePilha(Nodo n){
        if(n.getProx() != null){
            System.out.printf(n.getValue()+" ");
            imprimePilha(n.getProx());
        }
    }
}