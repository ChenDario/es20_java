public class Nodo {
    private Libro info;
    private Nodo next;

    public Nodo(Libro i){
        this.info = i;
        this.next = null;
    }

    public Nodo(Libro i, Nodo next){
        this.info = i;
        this.next = next;
    }

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
