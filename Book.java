public class Book extends Prodotto {
    private String autore;
    private int pagine;

    Book(String nome, String autore,int pagine, int prezzo ){
        super(nome,prezzo);
        this.autore=autore;
        this.pagine=pagine;
    }
    public String getAutore() {
        return autore;
    }
    public int getPagine() {
        return pagine;
    }
    String getInfoAutore(){
        String info;
        info = " Il libro scelto è :" + "\n";
        info+= getInfoProdotto() + "\n";
        info+= " Autore: " + autore + "\n";
        info+= " Pagine: " + pagine;
        return info;
    }
    
}
