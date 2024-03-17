public class LibroCartaceo extends Libro{
    //Attributi
    private double peso; 
    private boolean copertinaRigida; 
    private int qtaInMagazzino; 
    //Costruttore con parametri
    public LibroCartaceo(double peso, boolean copertinaRigida, int qtaInMagazzino, String titolo, String isbn, int anno, String casaEditrice, Autore autore, double prezzoDiVendita) {
        super(titolo, isbn, anno, casaEditrice, autore, prezzoDiVendita);
        this.peso = peso;
        this.copertinaRigida = copertinaRigida;
        this.qtaInMagazzino = qtaInMagazzino;
    }

    //Metodi get e set
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isCopertinaRigida() {
        return copertinaRigida;
    }

    public void setCopertinaRigida(boolean copertinaRigida) {
        this.copertinaRigida = copertinaRigida;
    }

    public int getQtaInMagazzino() {
        return qtaInMagazzino;
    }

    public void setQtaInMagazzino(int qtaInMagazzino) {
        this.qtaInMagazzino = qtaInMagazzino;
    }

    @Override
    public String toString() {
        return "\n\n - - LibroCartaceo - - "  + "\n Quantita' in Magazzino: " + qtaInMagazzino + super.toString();
    }

    
    
}