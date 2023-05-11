package ifpr.ed.tads22.diego;

public class Lista {
    private Nodo inicio;

    public void criarLista(){
        inicio = null;
    }

    public void add(int value){
        Nodo buffer = new Nodo();
        Nodo navegador = null;
        boolean inserido = false;

        buffer.setValue(value);
        navegador = inicio;

        while(!inserido){
            if(inicio == null){
                inicio = buffer;
                break;
            }
            if(navegador.getProx() == null){
                navegador.setProx(buffer);
                inserido = true;
            }
            else{
                navegador = navegador.getProx();
                System.out.println("~ Pulou ~");
            }
        }
    }

    public void imprimeLista(Nodo navegador){
        // Codigo imprimir lista;
        // Fazer codigo recursivo...
    }
}
