
import java.util.ArrayList;
import java.util.Scanner;

public class BooknFood {
    ArrayList<Prodotto> listino = new ArrayList<Prodotto>();
    ArrayList<Prodotto> carrello = new ArrayList<Prodotto>();

    private void addNewListino(Prodotto prodotto) {
        listino.add(prodotto);
    }

    public void creaNewProdotto() {
        Prodotto newprodotto;
        String nome;
        int prezzo;
        Scanner lettore = new Scanner(System.in);
        System.out.print("Dimmi nome prodotto:");
        nome = lettore.nextLine();
        System.out.print("Dimmi prezzo prodotto:");
        prezzo = lettore.nextInt();
        newprodotto = new Prodotto(nome, prezzo);
        addNewListino(newprodotto);
    }
    public void creaNewFood() {
        Food newprodotto;
        String nome;
        int prezzo;
        float peso;
        int durata;
        Scanner lettore = new Scanner(System.in);
        System.out.print("Dimmi un cibo:");
        nome = lettore.nextLine();
        System.out.print("Dimmi prezzo:");
        prezzo = lettore.nextInt();
        System.out.print("Dimmi il peso:");
        peso = lettore.nextInt();
        System.out.print("Dimmi la scadenza:");
        durata = lettore.nextInt();
        newprodotto = new Food(nome, prezzo, peso, durata);
        addNewListino(newprodotto);
    }
    public void creaNewBook() {
        Book newprodotto;
        String nome;
        int prezzo;
        String autore;
        int pagine;
        Scanner lettore = new Scanner(System.in);
        System.out.print("Dimmi un libro:");
        nome = lettore.nextLine();
        System.out.print("Dimmi l'autore:");
        autore = lettore.nextLine();
        System.out.print("Dimmi le pagine:");
        pagine = lettore.nextInt();
        System.out.print("Dimmi prezzo:");
        prezzo = lettore.nextInt();
        newprodotto = new Book(nome, autore, pagine, prezzo);
        addNewListino(newprodotto);
    }


    public void stampaListino() {
        for (Prodotto list : listino) {
            System.out.println(list.getInfoProdotto());
        }

    }

    private void addNewCarrello(Prodotto prodotto) {
        carrello.add(prodotto);
    }

    public void aggiungiCarrello() {
        Prodotto nuovoprod;
        String nome = "";
        int prezzo = 0;
        int j;
        Scanner lettore = new Scanner(System.in);
        System.out.print("Dimmi un numero dell'elenco");
        j = lettore.nextInt();
        nuovoprod = new Prodotto(nome, prezzo);
        for (int i = 0; i < j; i++) {
            nuovoprod = listino.get(i);
            
        }
        addNewCarrello(nuovoprod);
        System.out.println(" Carrello: " + nuovoprod.getInfoProdotto());
    }

    public void svuotaCarrello(){
        carrello.clear();
        System.out.println(" Il carrello è vuoto ");
    }

    public void ultimoelementoCarrello(){
        carrello.remove(carrello.size()-1);
        for (Prodotto car:carrello){
        System.out.println("Elenco carrello :" + car.getInfoProdotto());
        }
    }
    public void iesimoElemento(){
        Prodotto togliere;
        String nome = "";
        int prezzo = 0;
        int j;
        Scanner lettore = new Scanner(System.in);
        System.out.print("Dimmi un numero dell'elenco");
        j = lettore.nextInt();
        togliere = new Prodotto(nome, prezzo);
        for (int i = 0; i < j; i++) {
            togliere = carrello.get(i);
            
        }
        carrello.remove(togliere);
    }
    public void getTotaleCarrello(){
        if (carrello.size()>0){
            String totale = " Carrello: " + "\n";
            for(Prodotto carr: carrello){
                totale+= carr.getInfoProdotto();
                System.out.println(totale);
            }
           
        }

    }
    public void totaleCarrello(){
        int totale=0;
        if (carrello.size()>0){
            for(Prodotto in: carrello){
                totale= in.getPrezzo();
                
            }
        }
       System.out.println(" Il totale del tuo carrello è:" + totale);
    }


}
