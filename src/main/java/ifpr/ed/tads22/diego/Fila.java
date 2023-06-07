package ifpr.ed.tads22.diego;

public class Fila {
    private Nodo head;
    private Nodo tail;
    private Nodo novo;

    public Nodo getHead(){ // retorna começo cabeça
        return head;
    }

    public Nodo getTail(){ // retorna fim calda
        return tail;
    }

    public void enfileirar(int i){  //ENQUEUE, Insere um elemento ao final da fila
        novo = new Nodo();
        novo.setValue(i);

        if(head == null){
            head = novo;
            tail = novo;
        }else{
            tail.setProx(novo);
            tail = novo;
        }
    }

    public void desenfileira(){ //DEQUEUE, Remove um elemento do início da fila
        head = head.getProx();
    }

    public void print(Nodo n){
        System.out.printf(n.getValue()+" ");
        if(n.getProx() != null){
            print(n.getProx());
        }
    }
}
