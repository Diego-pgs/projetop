package ifpr.ed.tads22.diego;

public class Deque {
    
    private Nodo left;
    private Nodo right;
    private Nodo novo;


    public Nodo getLeft(){
        return left;
    }

    public Nodo getRight(){
        return right;
    }

    public void putLeft(int valor){ // Adiciona valores a esquerda
        novo = new Nodo();
        novo.setValue(valor);

        if(left == null){
            left = novo;
            right = novo;
        }else{
            novo.setProx(left);
            left = novo;
        }
    }

    public void putRight(int valor){ // Adiciona valores a direita
        novo = new Nodo();
        novo.setValue(valor);

        if(right == null){
            right = novo;
            left = novo;
        }else{
            right.setProx(novo);
            right = novo;
        }
    }

    public void outLeft(){ // Tira primeiro valor da esquerda
        left = left.getProx();
    }

    public void outRight(){ // Tira ultimo valor da direita
    }

    public void imprimeDeque(Nodo n){
        System.out.printf(n.getValue()+" ");
        if(n.getProx() != null){
            imprimeDeque(n.getProx());
        }
    }
}
