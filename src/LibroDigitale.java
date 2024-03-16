public class LibroDigitale extends Libro{
    private double dimensione;
    private String estensioneFile; 

    public LibroDigitale(double dimensione, String estensioneFile, String titolo, String isbn, int anno, String casaEditrice, Autore autore, double prezzoDiVendita) {
        super(titolo, isbn, anno, casaEditrice, autore, prezzoDiVendita);
        this.dimensione = dimensione;
        this.estensioneFile = estensioneFile;
    }

    //Metodi get e set
    public double getDimensione() {
        return dimensione;
    }

    public void setDimensione(double dimensione) {
        this.dimensione = dimensione;
    }

    public String getEstensioneFile() {
        return estensioneFile;
    }

    public void setEstensioneFile(String estensioneFile) {
        this.estensioneFile = estensioneFile;
    }

    @Override
    public String toString() {
        return "\n\n - -LibroDigitale - - " + "\n Dimensione: " + this.dimensione + "KB" + super.toString();
    }

    
    
}
