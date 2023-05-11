package ifpr.ed.tads22.diego;

public class App{
    public static void main( String[] args )
    {
        System.out.println( "Lista" );

        Lista minhaLista = new Lista();

        minhaLista.criarLista();
        minhaLista.add(50);
        minhaLista.add(34);
        minhaLista.add(27);
        minhaLista.add(45);

    }
}
