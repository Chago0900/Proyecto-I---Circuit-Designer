package logic;

public class Lista {

    protected Node first;
    protected Node last;


    public Lista(){
        first = null;
        last = null;
    }

    //Metodo para  agregar un Nodo al inicio de la lista
    public void addFirst (Compuerta elemento){
        first = new Node (elemento, first);
        if (last == null){
            last = first;
        }
    }

    public void addLast (Compuerta elemento){
        if (first == null){
            first = new Node (elemento);
        }else {
            Node temp = first;
            while (temp != null) {
                temp = temp.getNext ();
                Node n = new Node (elemento);
                temp.setNext (n);
            }
        }
    }


    //Metodo para mostrar los datos
    public void mostrarLista(){
        Node recorrer = first;
        while (recorrer != null){
            if (recorrer.next != null){
                System.out.print ("["+recorrer.dato+"]--->");
                recorrer = recorrer.next;
            }else {
                System.out.println ("["+recorrer.dato+"]---> |||");
                recorrer = recorrer.next;
            }
        }
    }
}
