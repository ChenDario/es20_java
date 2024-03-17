public class Nodo {
    //Attributi
    private Libro info;
    private Nodo next;
    //Costruttore con parametri, creazione nuovo nodo
    public Nodo(Libro i){
        this.info = i;
        this.next = null;
    }
    //Costruttore con parametri, copia di un nodo
    public Nodo(Libro i, Nodo next){
        this.info = i;
        this.next = next;
    }

    //Metodi get e set
    public Libro getInfo() {
        return info;
    }

    public void setInfo(Libro info) {
        this.info = info;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
