import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Per leggere le variabili
        Scanner scanner = new Scanner(System.in);

        LibreriaOnline libreria = new LibreriaOnline("Feltrinelli");

        int choice = -1;
        do{
            //Print menu'
            stampaMenu();

            System.out.print("\nInserire il numero dell'operazione che si vuole eseguire: ");
            choice = Integer.parseInt(scanner.nextLine());
            
            switch (choice) {
                case 0:
                    System.out.println("\n- - SAYONARA - - ");
                break;

                case 1:
                    System.out.println("\n- - Inserimento - - ");
                    libreria.addLibro(libroInputs(scanner));
                    System.out.println(libreria.toString());
                    
                break;

                case 7:
                    System.out.println(libreria.toString());
                break;
            
                default:
                    System.out.println("\n- - ERRORE, inserire una scelta valida - - ");
                break;
            }
            
            

        }while(choice != 0);
        
        //Chiudere l'input delle variabili
        scanner.close();        
    }   

    //Metodo per stampare il menu'
    public static void stampaMenu(){
        System.out.println(
            "\n  - - - MENU' - - - " + 
            "\n 1) Inserimento ordinato di un Libro " +
            "\n 2) Prezzo libro dato codice ISBN "  +
            "\n 3) Titolo libro dato codice ISBN "  +
            "\n 4) Prezzo libro dato codice ISBN "  +
            "\n 5) Autore libro dato codice ISBN "  +
            "\n 6) Prezzo libro piu' alto " +
            "\n 7) Mostra libri nella libreria " +
            "\n 0) Esci "
        ); 
    }

    //Metodo per gli inputs del libro
    public static Libro libroInputs(Scanner input){
        boolean loop = false;

        System.out.print("Nome Autore libro: ");
        String nome = input.nextLine();

        System.out.print("Cognome Autore libro: ");
        String cognome = input.nextLine();

        System.out.print("Codice Fiscale Autore libro: ");
        String cf = input.nextLine();

        Autore a = new Autore(nome, cognome, cf);

        System.out.print("Titolo libro: ");
        String title = input.nextLine();

        System.out.print("Codice ISBN libro: ");
        String isbn = input.nextLine();

        System.out.print("Casa Editrice libro: ");
        String casaEditrice = input.nextLine();

        int year = -1;
        do{
            loop = false;
            try {
                System.out.print("Anno libro: ");
                year = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.print("\nData input error. Riprova \n");
                loop = true;
            }
        }while(loop);

        float price = 0;
        do{
            loop = false;
            try {
                System.out.print("Prezzo libro: ");
                price = Float.parseFloat(input.nextLine());
            } catch (Exception e) {
                System.out.print("\nData input error. Riprova \n");
                loop = true;
            }
        }while(loop);
        
        System.out.println("Il libro e' cartaceo? [Yes/No] - ");
        //Se il libro è cartaceo
        if(input.nextLine().contains("yes")){
            int qtaMag = 0;
            do{
                loop = false;
                try {
                    System.out.print("\nQuantita' in magazzino libro: ");
                    qtaMag = Integer.parseInt(input.nextLine());
                } catch (Exception e) {
                    System.out.print("\nData input error. Riprova \n");
                    loop = true;
                }
            }while(loop);

            float weight = 0;
            do{
                loop = false;
                try {
                    System.out.print("Peso libro in g: ");
                    weight = Float.parseFloat(input.nextLine());
                } catch (Exception e) {
                    System.out.print("\nData input error. Riprova \n");
                    loop = true;
                }
            }while(loop);

            boolean copertina = false;
            System.out.print("Coopertina Rigida? [Yes/No] - ");
            if(input.nextLine().contains("yes"))
                copertina = true;

            return new LibroCartaceo(weight, copertina, qtaMag, title, isbn, year, casaEditrice, a, price);
        }
        //Se il libro è digitale
        float dimensione = 0;
        do{
            loop = false;
            try {
                System.out.print("Dimennsione Libro in KB: ");
                dimensione = Float.parseFloat(input.nextLine());
            } catch (Exception e) {
                System.out.print("\nData input error. Riprova \n");
                loop = true;
            }
        }while(loop);

        System.out.print("Estensione File libro: ");
        String estensioneFile = input.nextLine();

        return new LibroDigitale(dimensione, estensioneFile, title, isbn, year, casaEditrice, a, dimensione);
    }
}
