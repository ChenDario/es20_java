import java.util.Scanner;

public class LibreriaOnline {
    private String nome; 
    private Lista elencoLibri;
    
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

    public void addElenco(Libro i){
        elencoLibri.addLista(i);
    }

    public LibroCartaceo createElemenCartaceo(){
        Scanner scanner = new Scanner(System.in);
        //Creazione del libro
        System.out.print("\n Titolo libro: ");
        String title = scanner.nextLine();

        System.out.print("\n Quantita' in magazzino libro: ");
        int qtaMag = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" Codice ISBN libro: ");
        String isbn = scanner.nextLine();

        System.out.print(" Anno libro: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print(" casaEditrice libro: ");
        String casaEditrice = scanner.nextLine();

        System.out.print(" Prezzo libro: ");
        float price = scanner.nextFloat();
        scanner.nextLine();

        System.out.print(" Peso libro in g: ");
        float weight = scanner.nextFloat();

        Autore a1 = new Autore("Dario", "Chen", "CHNDRA05");

        LibroCartaceo libro = new LibroCartaceo(weight, false, qtaMag, title, isbn, year, casaEditrice, a1, price);
        scanner.close();

        return libro;
    }

    public void menu(){
        System.out.println(
            "\n  - - - MENU' - - - " + 
            "\n 1) Inserimento ordinato di un Libro " +
            "\n 2) Prezzo libro dato codice ISBN "  +
            "\n 3) Titolo libro dato codice ISBN "  +
            "\n 4) Prezzo libro dato codice ISBN "  +
            "\n 5) Autore libro dato codice ISBN "  +
            "\n 6) Prezzo libro piu' alto " +
            "\n 0) Esci "
        ); 
    }

    @Override
    public String toString() {
        return "- - LibreriaOnline " + this.nome + " - -" + elencoLibri.toString();
    }

    
    
}
