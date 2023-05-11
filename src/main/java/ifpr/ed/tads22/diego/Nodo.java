package ifpr.ed.tads22.diego;

public class Nodo {
    private int value;
    private Nodo prox;

    public int getValue(){
        return value;
    }
    
    public Nodo getProx(){
        return prox;
    }

    public void setValue(int value){
        this.value = value;
    }
    
    public void setProx(Nodo prox){
        this.prox = prox;
    }
}
