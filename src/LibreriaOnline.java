public class LibreriaOnline {
    //Attributi
    private String nome; 
    private Lista elencoLibri = new Lista();
    //Costruttore con parametri
    public LibreriaOnline(String nome){
        this.nome = nome;
        this.elencoLibri = new Lista();
    }

    //Metodi get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addLibro(Libro i){
        elencoLibri.addLista(i);
    }

    //Metodo get info libreria
    @Override
    public String toString() {
        return "- - LibreriaOnline " + this.nome + " - -" + elencoLibri.toString();
    }

    
    
}
