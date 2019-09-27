package logic;

public class Node {

    Compuerta dato;
    Node next;

    public Node (Compuerta dato){
        this.dato = dato;
    }

    public Node (Compuerta d, Node n){
        dato = d;
        next = n;
    }

    public Compuerta getDato () {
        return dato;
    }

    public void setDato (Compuerta dato) {
        this.dato = dato;
    }

    public Node getNext () {
        return next;
    }

    public void setNext (Node next) {
        this.next = next;
    }
}
