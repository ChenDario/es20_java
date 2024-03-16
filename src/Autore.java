public class Autore {
    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Autore(String nome, String cognome, String cf){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = cf;
    }

    //Metodi get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.cognome;
    }

        
}
