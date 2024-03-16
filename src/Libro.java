public abstract class Libro {
    private String titolo; 
    private String isbn;
    private int anno;
    private String casaEditrice;
    private Autore autore;
    private double prezzoDiVendita;

    public Libro(String titolo, String isbn, int anno, String cd, Autore a, double price){
        this.titolo = titolo;
        this.isbn = isbn;
        this.anno = anno;
        this.casaEditrice = cd;
        this.autore = a;
        this.prezzoDiVendita = price;
    }

    //Metodi get e set
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public int getAnno() {
        return anno;
    }
    
    public void setAnno(int anno) {
        this.anno = anno;
    }
    
    public String getCasaEditrice() {
        return casaEditrice;
    }
    
    public void setCasaEditrice(String casaEditrice) {
        this.casaEditrice = casaEditrice;
    }
    
    public Autore getAutore() {
        return autore;
    }
    
    public void setAutore(Autore autore) {
        this.autore = autore;
    }
    
    public double getPrezzoDiVendita() {
        return prezzoDiVendita;
    }
    
    public void setPrezzoDiVendita(double prezzoDiVendita) {
        this.prezzoDiVendita = prezzoDiVendita;
    }

    @Override
    public String toString() {
        return "\n Titolo:" + this.titolo + "\n Isbn:" + this.isbn + "\n Autore: "+ this.autore.toString();
    }

        
}
