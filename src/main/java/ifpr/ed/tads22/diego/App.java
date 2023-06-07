package ifpr.ed.tads22.diego;

import java.util.Scanner;

public class App{

    static Scanner teclado = new Scanner(System.in);

    public static void main( String[] args ){
        System.out.println("Hello World\n");

        //codigoAulaUm();
        //criaListaeImprime();
        //usarPilha();
        //usarFila();
        usarDeque();

        /* FAZER INTERFACE GRAFICA... */

    }

    public static void codigoAulaUm(){
        Nodo noCego = new Nodo();
        noCego.setValue(45);
    
        noCego.setProx(new Nodo());
        noCego.getProx().setValue(62);
        noCego.getProx().setProx(new Nodo());
        noCego.getProx().getProx().setValue(10);
        noCego.getProx().getProx().setProx(new Nodo());
        noCego.getProx().getProx().getProx().setValue(99);

        System.out.println("Valor do primeiro nó: "+noCego.getValue());
        System.out.println("Valor do segundo nó: "+noCego.getProx().getValue());
        System.out.println("Valor do terceiro nó: "+noCego.getProx().getProx().getValue());
        System.out.println("Valor do quarto nó: "+noCego.getProx().getProx().getProx().getValue());
    }

    public static void criaListaeImprime(){
        Lista minhaLista = new Lista();
    
        minhaLista.criarLista();
        minhaLista.add(50);
        minhaLista.add(34);
        minhaLista.add(27);
        minhaLista.add(45);
        
        minhaLista.imprimeLista(minhaLista.getInicio());
        System.out.println("\n");
        minhaLista.imprimeAtsil(minhaLista.getInicio());
        System.out.println("\n");
    }

    public static void usarPilha(){
        Pilha pilha;
        pilha = new Pilha();
        pilha.push(11);
        pilha.push(44);
        pilha.push(49);
        pilha.push(88);
        pilha.pop();
        pilha.imprimePilha(pilha.getTopo());
    }

    public static void usarFila(){
        Fila fila;
        fila = new Fila();
        fila.enfileirar(11);
        fila.enfileirar(15);
        fila.enfileirar(32);
        fila.enfileirar(65);
        fila.enfileirar(88);
        fila.desenfileira();
        fila.desenfileira();
        fila.print(fila.getHead());
    }

    public static void usarDeque(){
        Deque deque;
        deque = new Deque();
        
        
        deque.putLeft(15);
        deque.putLeft(22);
        deque.putLeft(54);
        deque.putLeft(42);
        deque.putLeft(75);
        
        deque.putRight(55);
        deque.putRight(43);
        deque.putRight(25);
        deque.putRight(93);
        deque.putRight(21);

        //deque.outLeft();
        //deque.outLeft();
        //deque.outLeft();
        deque.outRight();
        deque.imprimeDeque(deque.getLeft());
     
    }
}
