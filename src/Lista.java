public class Lista {
    //Attributi
    private Nodo head;

    //Costruttore vuoto
    public Lista(){
        head = null;
    }

    //Costruttore con parametri
    public Lista(Nodo a){
        head = a;
    }

    //Costruttore con parametri
    public Lista(Libro c){
        head = new Nodo(c);
    }

    //Metodi get e set
    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    //Metodo per controllare se il Libro è gia presente nella lista
    public Nodo isPresente(Libro i){
        //Scorro la lista finché non arriva in fondo
        for(Nodo tmp = head; tmp != null; tmp = tmp.getNext()){
            //Se il libro è gia presente
            if(tmp.getInfo().getIsbn().equals(i.getIsbn())){
                return tmp;
            }
        }

        return null;
    }

    //Metodo per add
    public boolean addLista(Libro i){
        Nodo nuovo = new Nodo(i);

        if(head == null){
            head = nuovo;
        } else {
            Nodo presente = isPresente(i);

            //Se il libro è nuovo e non presente nella lista
            if(presente == null){
                //Ordinamento in base al titolo 
                Nodo precedente = null;
                Nodo corrente = head;

                //Trova la posizione che deve essere messa
                while (corrente != null && corrente.getInfo().getTitolo().compareToIgnoreCase(i.getTitolo()) < 0) {
                    precedente = corrente;
                    corrente = corrente.getNext();
                }
                
                //Inserimento del nuovo nodo
                nuovo.setNext(corrente);
                if (precedente == null) {
                    head = nuovo; // Se è il primo nodo
                } else {
                    precedente.setNext(nuovo);
                }
                return true;
            } else {
                //Se è un libro cartaceo
                if(presente.getInfo() instanceof LibroCartaceo){
                    //Aumento la quantità in magazzino 
                    ((LibroCartaceo)presente.getInfo()).setQtaInMagazzino(((LibroCartaceo)presente.getInfo()).getQtaInMagazzino() + 1);
                    return true;
                }
                //Se il libro è digitale
                return false;
            }
        }   
        return false;
    }

    //Metodo per trovare l'ultimo nodo della lista
    public Nodo trovaUltimo(){
        if(head == null){
            return null;
        } else {
            Nodo tmp = null;
            for(tmp = head; tmp.getNext() != null; tmp = tmp.getNext());
            return tmp;
        }
    }

    //Metodo get info
    public String getInfoLista(){
        String info = " ";

        for(Nodo tmp = head; tmp != null; tmp = tmp.getNext()){
            info += tmp.getInfo().toString();
        }

        return info;
    }
}
