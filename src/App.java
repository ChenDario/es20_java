import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Per leggere le variabili
        Scanner scanner = new Scanner(System.in);

        Lista libreria = new Lista();

        int choice = -1;
        do{
            //Print menu'
            stampaMenu();

            System.out.print("\n Inserire il numero dell'operazione che si vuole eseguire: ");
            choice = Integer.parseInt(scanner.nextLine());
            
            switch (choice) {
                case 0:
                    System.out.println("\n - - SAYONARA - - ");
                break;

                case 1:
                    System.out.println("\n - - SAYONARA - - ");
                break;

                case 7:
                    System.out.println(libreria.getInfoLista());
                break;
            
                default:
                    System.out.println("\n - - ERRORE, inserire una scelta valida - - ");
                break;
            }
            
            

        }while(choice != 0);
        
        //Chiudere l'input delle variabili
        scanner.close();


        /*
        Autore a1 = new Autore("Dario", "Chen", "CHNDRA05");
        Autore a3 = new Autore("Yidean", "Ye", "oiahsf2");
        Autore a2 = new Autore("Gioia", "Shi", "Lifo324");

        Lista l1 = new Lista();

        LibroCartaceo lc1 = new LibroCartaceo(23.2, true,25 ,"S", "oasiudhf",2005, "Mooo", a1, 52.3);
        LibroCartaceo lc2 = new LibroCartaceo(53.2, false,35 ,"a", "jhvcmk",2085, "rt", a2, 2.3);
        LibroCartaceo lc3 = new LibroCartaceo(13.2, true,3 ,"b", "rewhfji",2003, "bnvg", a3, 22.3);
        
        LibroDigitale ld1 = new LibroDigitale(34.5, "rtx", "c", "duoicoa", 2034, "boo", a2, 12);
        LibroDigitale ld2 = new LibroDigitale(0.5, "text", "d", "daskjbfv", 2004, "dfagh", a3, 82);
        LibroDigitale ld3 = new LibroDigitale(4543.5, "filr", "z", "yuoa", 2024, "sfg", a1, 32);
        

        l1.addLista(lc2);
        l1.addLista(lc1);
        l1.addLista(lc3);
        l1.addLista(ld3);
        l1.addLista(ld1);
        l1.addLista(ld2);
        l1.addLista(lc2);
        l1.addLista(lc1);

        System.out.println(l1.getInfoLista());
        */
        
    }   

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
}
